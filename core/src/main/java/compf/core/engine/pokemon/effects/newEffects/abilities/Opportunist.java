package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*undefined*/
 public class Opportunist extends PokemonBattleEffect{

/*@Override
 void onFoeAfterBoost(boost, Pokemon target, Pokemon source, effect) {
      if (effect?.name === "Opportunist" || effect?.name === "Mirror Herb")
        return;
      const pokemon = this.effectState.target;
      const positiveBoosts = {};
      let i;
      for (i in boost) {
        if (boost[i] > 0) {
          positiveBoosts[i] = boost[i];
        }
      }
      if (Object.keys(positiveBoosts).length < 1)
        return;
      this.boost(positiveBoosts, pokemon);
    }*/
public Opportunist(Pokemon pkmn) {
        super(pkmn);
    }
}