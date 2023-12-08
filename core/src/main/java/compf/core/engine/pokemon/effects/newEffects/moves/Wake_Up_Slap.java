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
/*Power doubles if the target is asleep. If the user has not fainted, the target wakes up.*/
 public class Wake_Up_Slap extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      if (target.status === "slp" || target.hasAbility("comatose")) {
        this.debug("BP doubled on sleeping target");
        return move.basePower * 2;
      }
      return move.basePower;
    }*/
/*@Override
 void onHit(target) {
      if (target.status === "slp")
        target.cureStatus();
    }*/
public Wake_Up_Slap(Pokemon pkmn) {
        super(pkmn);
    }
}