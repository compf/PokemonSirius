package compf.core.engine.pokemon.moves;

import java.lang.reflect.InvocationTargetException;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.Type;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;

public class DelayedMove extends Move {
    private Class _effectClass;
    public DelayedMove(Move mv,Class cls) {
        super(mv);
        _effectClass=cls;//TODO Auto-generated constructor stub
    }

    @Override
    public void init(Schedule schedule, int attacker, int defender) {

        super.init(schedule, attacker, defender,1);
    }


    @Override
    public DamageInformation execute(ScheduleItem item) {
        try {
            var effect=(PokemonBattleEffect)_effectClass.getDeclaredConstructor(Pokemon.class).newInstance(item.getAttacker());
            item.getAttacker().addEffect(effect);
            System.out.println("added fly effect");
         
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return super.execute(item);
       
    }
    
}
