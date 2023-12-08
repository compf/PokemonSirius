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
/*On switch-in, the weather becomes Primordial Sea, which includes all the effects of Rain Dance and prevents damaging Fire-type moves from executing. This weather remains in effect until this Ability is no longer active for any Pokemon, or the weather is changed by the Delta Stream or Desolate Land Abilities.*/
 public class Primordial_Sea extends PokemonBattleEffect{

/*@Override
 void onStart(source) {
      this.field.setWeather("primordialsea");
    }*/
/*@Override
 void onAnySetWeather(Pokemon target, Pokemon source, weather) {
      const strongWeathers = ["desolateland", "primordialsea", "deltastream"];
      if (this.field.getWeather().id === "primordialsea" && !strongWeathers.includes(weather.id))
        return false;
    }*/
/*@Override
 void onEnd(pokemon) {
      if (this.field.weatherState.source !== pokemon)
        return;
      for (const target of this.getAllActive()) {
        if (target === pokemon)
          continue;
        if (target.hasAbility("primordialsea")) {
          this.field.weatherState.source = target;
          return;
        }
      }
      this.field.clearWeather();
    }*/
public Primordial_Sea(Pokemon pkmn) {
        super(pkmn);
    }
}