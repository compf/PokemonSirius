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
 public class As_One__Spectrier_ extends PokemonBattleEffect{

/*@Override
 void onPreStart(pokemon) {
      this.add("-ability", pokemon, "As One");
      this.add("-ability", pokemon, "Unnerve");
      this.effectState.unnerved = true;
    }*/
/*@Override
 void onEnd() {
      this.effectState.unnerved = false;
    }*/
/*@Override
 void onFoeTryEatItem() {
      return !this.effectState.unnerved;
    }*/
/*@Override
 void onSourceAfterFaint(length, Pokemon target, Pokemon source, effect) {
      if (effect && effect.effectType === "Move") {
        this.boost({ spa: length }, source, source, this.dex.abilities.get("grimneigh"));
      }
    }*/
public As_One__Spectrier_(Pokemon pkmn) {
        super(pkmn);
    }
}