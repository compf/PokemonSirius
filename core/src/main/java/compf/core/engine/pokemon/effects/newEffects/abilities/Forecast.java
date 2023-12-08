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
/*If this Pokemon is a Castform, its type changes to the current weather condition's type, except Sandstorm. This effect is prevented if this Pokemon is holding a Utility Umbrella and the weather is Rain Dance or Sunny Day.*/
 public class Forecast extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      this.singleEvent("WeatherChange", this.effect, this.effectState, pokemon);
    }*/
/*@Override
 void onWeatherChange(pokemon) {
      if (pokemon.baseSpecies.baseSpecies !== "Castform" || pokemon.transformed)
        return;
      let forme = null;
      switch (pokemon.effectiveWeather()) {
        case "sunnyday":
        case "desolateland":
          if (pokemon.species.id !== "castformsunny")
            forme = "Castform-Sunny";
          break;
        case "raindance":
        case "primordialsea":
          if (pokemon.species.id !== "castformrainy")
            forme = "Castform-Rainy";
          break;
        case "hail":
        case "snow":
          if (pokemon.species.id !== "castformsnowy")
            forme = "Castform-Snowy";
          break;
        default:
          if (pokemon.species.id !== "castform")
            forme = "Castform";
          break;
      }
      if (pokemon.isActive && forme) {
        pokemon.formeChange(forme, this.effect, false, "[msg]");
      }
    }*/
public Forecast(Pokemon pkmn) {
        super(pkmn);
    }
}