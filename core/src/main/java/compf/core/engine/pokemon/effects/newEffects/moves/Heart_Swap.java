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
/*The user swaps all its stat stage changes with the target.*/
 public class Heart_Swap extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      const targetBoosts = {};
      const sourceBoosts = {};
      let i;
      for (i in target.boosts) {
        targetBoosts[i] = target.boosts[i];
        sourceBoosts[i] = source.boosts[i];
      }
      target.setBoost(sourceBoosts);
      source.setBoost(targetBoosts);
      this.add("-swapboost", Pokemon source, target, "[from] move: Heart Swap");
    }*/
public Heart_Swap(Pokemon pkmn) {
        super(pkmn);
    }
}