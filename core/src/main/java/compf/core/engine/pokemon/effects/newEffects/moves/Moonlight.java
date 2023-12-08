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
/*The user restores 1/2 of its maximum HP if Delta Stream or no weather conditions are in effect or if the user is holding Utility Umbrella, 2/3 of its maximum HP if the weather is Desolate Land or Sunny Day, and 1/4 of its maximum HP if the weather is Primordial Sea, Rain Dance, Sandstorm, or Snow, all rounded half down.*/
 public class Moonlight extends PokemonBattleEffect{

/*@Override
 void onHit(pokemon) {
      let factor = 0.5;
      switch (pokemon.effectiveWeather()) {
        case "sunnyday":
        case "desolateland":
          factor = 0.667;
          break;
        case "raindance":
        case "primordialsea":
        case "sandstorm":
        case "hail":
        case "snow":
          factor = 0.25;
          break;
      }
      const success = !!this.heal(this.modify(pokemon.maxhp, factor));
      if (!success) {
        this.add("-fail", pokemon, "heal");
        return this.NOT_FAIL;
      }
      return success;
    }*/
public Moonlight(Pokemon pkmn) {
        super(pkmn);
    }
}