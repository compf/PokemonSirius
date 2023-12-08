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
/*The power of this move depends on (user's current Speed / target's current Speed), rounded down. Power is equal to 150 if the result is 4 or more, 120 if 3, 80 if 2, 60 if 1, 40 if less than 1. If the target's current Speed is 0, this move's power is 40.*/
 public class Electro_Ball extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, target) {
      let ratio = Math.floor(pokemon.getStat("spe") / target.getStat("spe"));
      if (!isFinite(ratio))
        ratio = 0;
      const bp = [40, 60, 80, 120, 150][Math.min(ratio, 4)];
      this.debug("BP: " + bp);
      return bp;
    }*/
public Electro_Ball(Pokemon pkmn) {
        super(pkmn);
    }
}