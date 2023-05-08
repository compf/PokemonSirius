package compf.core.engine.pokemon.moves;

import java.lang.reflect.InvocationTargetException;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.Type;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
import compf.core.etc.services.SharedInformation;

public class DelayedMove extends Move {
    private Class _effectClass;

    public DelayedMove(Move mv, Class cls) {
        super(mv);
        _effectClass = cls;// TODO Auto-generated constructor stub
    }

    @Override
    public void init(Schedule schedule, int attacker, int defender) {

        super.init(schedule, attacker, defender, 1);
    }

    @Override
    public DamageInformation execute(ScheduleItem item) {
        try {
            var effect = (PokemonBattleEffect) _effectClass.getDeclaredConstructor(Pokemon.class)
                    .newInstance(item.getAttacker());
            item.getAttacker().addEffect(effect);
            SharedInformation.Instance.getLoggerService().log("added delayed effect",DelayedMove.class);

        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return super.execute(item);

    }

}
