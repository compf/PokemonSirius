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
/*This move's power is 20 if the target weighs less than 10 kg, 40 if less than 25 kg, 60 if less than 50 kg, 80 if less than 100 kg, 100 if less than 200 kg, and 120 if greater than or equal to 200 kg.*/
 public class Grass_Knot extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, target) {
      const targetWeight = target.getWeight();
      let bp;
      if (targetWeight >= 2e3) {
        bp = 120;
      } else if (targetWeight >= 1e3) {
        bp = 100;
      } else if (targetWeight >= 500) {
        bp = 80;
      } else if (targetWeight >= 250) {
        bp = 60;
      } else if (targetWeight >= 100) {
        bp = 40;
      } else {
        bp = 20;
      }
      this.debug("BP: " + bp);
      return bp;
    }*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target.volatiles["dynamax"]) {
        this.add("-fail", source, "move: Grass Knot", "[from] Dynamax");
        this.attrLastMove("[still]");
        return null;
      }
    }*/
public Grass_Knot(Pokemon pkmn) {
        super(pkmn);
    }
}