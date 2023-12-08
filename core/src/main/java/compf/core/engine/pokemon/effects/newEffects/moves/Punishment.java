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
/*Power is equal to 60+(X*20), where X is the target's total stat stage changes that are greater than 0, but not more than 200 power.*/
 public class Punishment extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, target) {
      let power = 60 + 20 * target.positiveBoosts();
      if (power > 200)
        power = 200;
      this.debug("BP: " + power);
      return power;
    }*/
public Punishment(Pokemon pkmn) {
        super(pkmn);
    }
}