package compf.core.engine.pokemon.moves;

import compf.core.etc.MyObject;

public class MultipleRoundsMove extends Move {
    private int _max, _min;

    public MultipleRoundsMove(Move mv, int min, int max) {
        super(mv);
        _max = max;
        _min = min;
    }

    @Override
    public void init(Schedule schedule, int attacker, int defender) {
        int rnd = _min + MyObject.getRNG().randomNumber(_max - _min,this.getClass());
        for (int i = 1; i < rnd; i++) {
            super.init(schedule, attacker, defender, i);
        }
    }
}