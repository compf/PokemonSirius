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
/*Power doubles if the target is paralyzed. If the user has not fainted, the target is cured of paralysis.*/
 public class Smelling_Salts extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      if (target.status === "par") {
        this.debug("BP doubled on paralyzed target");
        return move.basePower * 2;
      }
      return move.basePower;
    }*/
/*@Override
 void onHit(target) {
      if (target.status === "par")
        target.cureStatus();
    }*/
public Smelling_Salts(Pokemon pkmn) {
        super(pkmn);
    }
}