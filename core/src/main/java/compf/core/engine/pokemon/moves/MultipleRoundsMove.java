package compf.core.engine.pokemon.moves;

import compf.core.etc.MyObject;

public class MultipleRoundsMove extends Move {
    private int _max,_min;
    public MultipleRoundsMove(Move mv,int min,int max){
        super(mv);
        _max=max;
        _min=min;
    }
    @Override
    public void init(Schedule schedule,short attacker,short defender){
        int rnd= _min+MyObject.RNG.nextInt(_max-_min);
        for(int i=1;i<rnd;i++){
            super.init(schedule,attacker,defender,i);
        }
    }
}