package compf.core.engine.pokemon.moves;

import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
import compf.core.etc.MyObject;
import compf.core.etc.services.SharedInformation;

public class MultipleAttacksMove extends Move {
    private int _max, _min;

    public MultipleAttacksMove(Move mv, int min, int max) {
        super(mv);
        _max = max;
        _min = min;
    }

    @Override
    public DamageInformation execute(ScheduleItem item) {
        int rounds = SharedInformation.Instance.getRNG().randomNumber(_min, _max,this.getClass());
        int totalDamage = 0;
        for (int i = 0; i < rounds; i++) {
            totalDamage += super.execute(item).getDamage();
        }
        return new DamageInformation(totalDamage, getEffectiveness(item.getDefender(), getType()), item.getAttacker(),
                item.getDefender(), getNr());

    }
}
