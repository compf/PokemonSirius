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
/*The user swaps its Attack and Special Attack stat stage changes with the target.*/
 public class Power_Swap extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      const targetBoosts = {};
      const sourceBoosts = {};
      const atkSpa = ["atk", "spa"];
      for (const stat of atkSpa) {
        targetBoosts[stat] = target.boosts[stat];
        sourceBoosts[stat] = source.boosts[stat];
      }
      source.setBoost(targetBoosts);
      target.setBoost(sourceBoosts);
      this.add("-swapboost", Pokemon source, target, "atk, spa", "[from] move: Power Swap");
    }*/
public Power_Swap(Pokemon pkmn) {
        super(pkmn);
    }
}