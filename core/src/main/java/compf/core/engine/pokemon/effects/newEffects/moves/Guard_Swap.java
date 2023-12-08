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
/*The user swaps its Defense and Special Defense stat stage changes with the target.*/
 public class Guard_Swap extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      const targetBoosts = {};
      const sourceBoosts = {};
      const defSpd = ["def", "spd"];
      for (const stat of defSpd) {
        targetBoosts[stat] = target.boosts[stat];
        sourceBoosts[stat] = source.boosts[stat];
      }
      source.setBoost(targetBoosts);
      target.setBoost(sourceBoosts);
      this.add("-swapboost", Pokemon source, target, "def, spd", "[from] move: Guard Swap");
    }*/
public Guard_Swap(Pokemon pkmn) {
        super(pkmn);
    }
}