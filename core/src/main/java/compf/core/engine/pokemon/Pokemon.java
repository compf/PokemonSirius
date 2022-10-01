package compf.core.engine.pokemon;

import java.nio.ByteBuffer;

import compf.core.engine.Player;
import compf.core.engine.SharedInformation;
import compf.core.engine.pokemon.effects.BattleEffectCollection;
import compf.core.engine.pokemon.effects.ItemEffect;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.Move;
import compf.core.etc.MyObject;

public class Pokemon extends PokedexEntry  {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int[] _stats = new int[6];
    private int[] _evs = new int[6];
    private int[] _ivs = new int[6];
    private int _lvl;
    private int _cHp;
    private int[] _statsFactors = new int[8];
    private Move[] _moves = new Move[4];
    private int[] _movesPP=new int[4];
    private Nature _nature;
    private Gender _gender;
    private Player _player;
    public Player getPlayer() {
        return _player;
    }
    public void setPlayer(Player pl) {
        _player=pl;
    }

    private BattleEffectCollection _effects=new BattleEffectCollection();
    public  BattleEffectCollection getEffects(){
        return _effects;
    }
    private ItemEffect _itemEffect;
    public ItemEffect getItemEffect(){
        return _itemEffect;
    }
    public void setItemEffect(ItemEffect effect){
        _itemEffect=effect;
    }
    public int statsSum() {
        int sum = 0;
        for (int item : _stats)
            sum += item;
        return sum;
    }
    public int getMaxHP() {
        return _stats[PokemonStat.HP];
    }
    public enum Gender{Male,Female}
    public Pokemon(int nr){
        this(SharedInformation.Instance.getPokedexEntry(nr),DefaultPokemonLevel);
    }
    private  static int DefaultPokemonLevel=50;
    public Pokemon(PokedexEntry entry){
        this(entry,DefaultPokemonLevel);
    }
    public Pokemon (int nr,int level){
        this(SharedInformation.Instance.getPokedexEntry(nr),level);
    }
    public Pokemon(PokedexEntry entry,int level) {
        super._nr = entry._nr;
        super._name = entry._name;
        super._height = entry._height;
        super._weight = entry._weight;
        super._type1 = entry._type1;
        super._type2 = entry._type2==null?Type.Empty:entry._type2;
        _lvl = level;
        _nature = Nature.values()[MyObject.RNG.nextInt(25)];
        _gender=MyObject.randomNumber(0, 2)==0?Gender.Male:Gender.Female;
        super._baseStats = entry._baseStats;
        for (int i = 0; i < 6; i++) {
            _ivs[i] = MyObject.RNG.nextInt(32);
            _evs[i] = 0;

            updateStat(i);
            if (i < 4) {
                _moves[i] = SharedInformation.Instance.getMove(1+MyObject.RNG.nextInt(SharedInformation.MovesCount-1));
                if(_moves[i]==null) {
                    _moves[i]=SharedInformation.Instance.getMove(1);
                }
                _movesPP[i]=_moves[i].getPP();
            }
        }
        _cHp = _stats[0];

    }
    public Pokemon(int nr,int lvl,int[] evs,int[] ivs,Nature nature,Move[] moves) {
        PokedexEntry entry=SharedInformation.Instance.getPokedexEntry(nr);
        _name=entry._name;
        _height=entry._height;
        _weight=entry._weight;
        _baseStats=entry._baseStats;
        _type1=entry._type1;
        _type2=entry._type2;
        _nr=nr;
        _lvl=lvl;
        _evs=evs;
        _ivs=ivs;
        _nature=nature;
        _moves=moves;
        for(int i=0;i<6;i++) {
            updateStat(i);
            if(i<4)_movesPP[i]=_moves[i].getPP();
        }
        _cHp=_stats[0];

    }
    public Move[] getMoves() {
        return _moves;
    }
    public int getValidMovesCount(){
        int count=0;
        for(int i=0;i<SharedInformation.MovesPerPokemonCount;i++){
            if(_moves[i]!=null){
                count++;
            }
        }
        return count;
    }
    public int getMoveIndex(Move mv) {
        for(int i=0;i<4;i++)
            if(_moves[i].getNr()==mv.getNr())return i;
        return -1;
    }
    public void setMove(int index,int moveNr) {
        _moves[index]=SharedInformation.Instance.getMove(moveNr);
        if(moveNr>0){
            _movesPP[index]=_moves[index].getPP();

        }
    }
    public int getMovePP(int index) {
        return _movesPP[index];
    }
    public void changeMovePP(int index,int by) {
        _movesPP[index]+=by;
    }
    public int getLevel() {
        return _lvl;
    }
    public ByteBuffer toBytes() {
        ByteBuffer buffer=ByteBuffer.allocate(76);
        buffer.putInt(_nr);
        buffer.putInt(_lvl);
        for(int ev=0;ev<6;ev++) {
            buffer.putInt(_evs[ev]);
        }
        for(int iv=0;iv<6;iv++) {
            buffer.putInt(_ivs[iv]);
        }
        buffer.putInt(_nature._index);
        for(int mv=0;mv<4;mv++) {
            if(_moves[mv]==null)buffer.putInt(0);
            else buffer.putInt(_moves[mv].getNr());
        }
        buffer.rewind();
        return buffer;
    }




    private void updateStat(int i) {

        {
            if (i == 0) {
                double d1 = (((2 * _baseStats[0] + _ivs[0] + _evs[0] / 4.0) * _lvl) / 100.0 + _lvl + 10);
                this._stats[i] = (int) (d1);
            } else {
                double natureFactor = 1;
                if (_nature.getRisingValue() == _nature.getLoweringValue())
                    ;
                else if (i == _nature.getRisingValue())
                    natureFactor = 1.1;
                else if (i == _nature.getLoweringValue())
                    natureFactor = 0.9;
                double d2 = (((2 * _baseStats[i] + _ivs[i] + _evs[i] / 4.0) * _lvl) / 100.0 + 5) * natureFactor;
                _stats[i] = (int) (d2);
            }

        }
    }

    public int getStat(int i) {
        // TODO Auto-generated method stub
        return _stats[i];
    }

    public int getStatFactor(int i) {
        return _statsFactors[i - 1];
    }

    public void modifyCurrHp(int damage) {
        _cHp -= damage;
        if(_cHp<0)_cHp=0;

    }

    public void modifyCurrHp(double factor) {

        if(factor>1 && _cHp<getStat(HP) || factor<1 ){
            _cHp*=factor;
        }
    }



    public int getCurrHP() {
        return _cHp;
    }

    public void changeStatStage(int index, int factor) {
        if(_statsFactors[index-1]>-6 && _statsFactors[index-1]<6)
            _statsFactors[index - 1] += factor;


    }

    public double getStatStageFactor(int index) {
        switch(_statsFactors[index]) {
            case -6:
                return 0.25;
            case -5:
                return 2.0/7.0;
            case -4:
                return 1.0/3.0;
            case -3:
                return 0.4;
            case -2:
                return 0.5;
            case -1:
                return 2.0/3.0;
            case 0:
                return 1;
            case +1:
                return 1.5;
            case +2:
                return 2.0;
            case +3:
                return 2.5;
            case +4:
                return 3.0;
            case +5:
                return 3.5;
            case +6:
                return 4.0;
            default:
                return 1.0;
        }
    }



    @Override
    public String toString() {
        return _name + "[" + _cHp +"/" +_stats[0] +"]" ;
    }



    public void addEffect(PokemonBattleEffect effect) {
        _effects.add(effect);
        effect.init(null);
    }


}