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
/*If the user has not fainted, the target is cured of its burn.*/
 public class Sparkling_Aria extends PokemonBattleEffect{

/*@Override
 void onAfterMove(Pokemon source, Pokemon target, move) {
      for (const pokemon of this.getAllActive()) {
        if (pokemon !== source && pokemon.removeVolatile("sparklingaria") && pokemon.status === "brn" && !source.fainted) {
          pokemon.cureStatus();
        }
      }
    }*/
public Sparkling_Aria(Pokemon pkmn) {
        super(pkmn);
    }
}