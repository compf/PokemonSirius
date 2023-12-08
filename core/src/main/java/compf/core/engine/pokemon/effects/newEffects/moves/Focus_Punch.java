package compf.core.engine.pokemon.effects.newEffects.moves;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*The user loses its focus and does nothing if it is hit by a damaging attack this turn before it can execute the move.*/
 public class Focus_Punch extends PokemonBattleEffect{

/*@Override
 void priorityChargeCallback(pokemon) {
      pokemon.addVolatile("focuspunch");
    }*/
/*@Override
 void beforeMoveCallback(pokemon) {
      if (pokemon.volatiles["focuspunch"]?.lostFocus) {
        this.add("cant", pokemon, "Focus Punch", "Focus Punch");
        return true;
      }
    }*/
/*@Override
 void 1*/
/*@Override
 void onStart(pokemon) {
        this.add("-singleturn", pokemon, "move: Focus Punch");
      }*/
/*@Override
 void onHit(pokemon, Pokemon source, move) {
        if (move.category !== "Status") {
          this.effectState.lostFocus = true;
        }
      }*/
/*@Override
 void onTryAddVolatile(status, pokemon) {
        if (status.id === "flinch")
          return null;
      }*/
public Focus_Punch(Pokemon pkmn) {
        super(pkmn);
    }
}