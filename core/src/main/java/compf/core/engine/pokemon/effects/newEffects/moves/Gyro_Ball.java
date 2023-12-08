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
/*Power is equal to (25 * target's current Speed / user's current Speed) + 1, rounded down, but not more than 150. If the user's current Speed is 0, this move's power is 1.*/
 public class Gyro_Ball extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, target) {
      let power = Math.floor(25 * target.getStat("spe") / pokemon.getStat("spe")) + 1;
      if (!isFinite(power))
        power = 1;
      if (power > 150)
        power = 150;
      this.debug("BP: " + power);
      return power;
    }*/
public Gyro_Ball(Pokemon pkmn) {
        super(pkmn);
    }
}