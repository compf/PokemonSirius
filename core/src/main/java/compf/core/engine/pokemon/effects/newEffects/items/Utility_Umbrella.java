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
/*The holder ignores rain- and sun-based effects. Damage and accuracy calculations from attacks used by the holder are affected by rain and sun, but not attacks used against the holder.*/
 public class Utility_Umbrella extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (!pokemon.ignoringItem())
        return;
      if (["sunnyday", "raindance", "desolateland", "primordialsea"].includes(this.field.effectiveWeather())) {
        this.runEvent("WeatherChange", pokemon, pokemon, this.effect);
      }
    }*/
/*@Override
 void onUpdate(pokemon) {
      if (!this.effectState.inactive)
        return;
      this.effectState.inactive = false;
      if (["sunnyday", "raindance", "desolateland", "primordialsea"].includes(this.field.effectiveWeather())) {
        this.runEvent("WeatherChange", pokemon, pokemon, this.effect);
      }
    }*/
/*@Override
 void onEnd(pokemon) {
      if (["sunnyday", "raindance", "desolateland", "primordialsea"].includes(this.field.effectiveWeather())) {
        this.runEvent("WeatherChange", pokemon, pokemon, this.effect);
      }
      this.effectState.inactive = true;
    }*/
public Utility_Umbrella(Pokemon pkmn) {
        super(pkmn);
    }
}