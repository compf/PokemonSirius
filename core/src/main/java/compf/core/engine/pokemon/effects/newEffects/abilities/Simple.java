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
 public class Simple extends PokemonBattleEffect{

/*@Override
 void onChangeBoost(boost, Pokemon target, Pokemon source, effect) {
      if (effect && effect.id === "zpower")
        return;
      let i;
      for (i in boost) {
        boost[i] *= 2;
      }
    }*/
public Simple(Pokemon pkmn) {
        super(pkmn);
    }
}