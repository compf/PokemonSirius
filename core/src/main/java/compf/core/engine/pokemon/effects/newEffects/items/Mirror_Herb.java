package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*When an opposing Pokemon raises a stat stage, the holder copies it. Single use.*/
 public class Mirror_Herb extends PokemonBattleEffect{

/*@Override
 void onFoeAfterBoost(boost, Pokemon target, Pokemon source, effect) {
      if (effect?.name === "Opportunist" || effect?.name === "Mirror Herb")
        return;
      const boostPlus = {};
      let statsRaised = false;
      let i;
      for (i in boost) {
        if (boost[i] > 0) {
          boostPlus[i] = boost[i];
          statsRaised = true;
        }
      }
      if (!statsRaised)
        return;
      const pokemon = this.effectState.target;
      pokemon.useItem();
      this.boost(boostPlus, pokemon);
    }*/
public Mirror_Herb(Pokemon pkmn) {
        super(pkmn);
    }
}