package compf.core.engine.pokemon.effects.offensive;

import java.lang.reflect.Field;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.ItemEffect;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.engine.pokemon.moves.Move;

public class ChoiceItemEffect extends ItemEffect {
    private int _lastMoveId=-1;
    private int _stat;
    private int[] _stats;
    private double _by;
    private int _statBackup;
    public ChoiceItemEffect(Pokemon pkmn,int stat,double by) {
       super(pkmn);
       this._stat=stat;
       this._by=by;
    }
    @Override
    public void init() {
        try {
            Field field=Pokemon.class.getDeclaredField("_stats");
            field.setAccessible(true);
            int [] stats=(int[])field.get(getPokemon());
            _statBackup=stats[_stat];
            stats[_stat]=(int)(stats[_stat]*_by);
            _stats=stats;
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    @Override
    public void disable() {
        // TODO Auto-generated method stub
        super.disable();
        _stats[_stat]=_statBackup;

    }
    @Override
    public void attack(EffectParam param) {
        if(!isMeAttacking(param))return;
        var attData=(EffectParam.AdditionalDirectDamageData)param.additionalData();
        if(_lastMoveId==-1 || attData.getDamageInformation().getMoveId()==_lastMoveId){
            _lastMoveId=attData.getDamageInformation().getMoveId();
        }
        else{
           attData.killFully();
        }
    }
    
}
