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
/*Power doubles if a weather condition other than Delta Stream is active, and this move's type changes to match. Ice type during Snow, Water type during Primordial Sea or Rain Dance, Rock type during Sandstorm, and Fire type during Desolate Land or Sunny Day. If the user is holding Utility Umbrella and uses Weather Ball during Primordial Sea, Rain Dance, Desolate Land, or Sunny Day, this move remains Normal type and does not double in power.*/
 public class Weather_Ball extends PokemonBattleEffect{

/*@Override
 void onModifyType(Move move, pokemon) {
      switch (pokemon.effectiveWeather()) {
        case "sunnyday":
        case "desolateland":
          move.type = "Fire";
          break;
        case "raindance":
        case "primordialsea":
          move.type = "Water";
          break;
        case "sandstorm":
          move.type = "Rock";
          break;
        case "hail":
        case "snow":
          move.type = "Ice";
          break;
      }
    }*/
/*@Override
 void onModifyMove(Move move, pokemon) {
      switch (pokemon.effectiveWeather()) {
        case "sunnyday":
        case "desolateland":
          move.basePower *= 2;
          break;
        case "raindance":
        case "primordialsea":
          move.basePower *= 2;
          break;
        case "sandstorm":
          move.basePower *= 2;
          break;
        case "hail":
        case "snow":
          move.basePower *= 2;
          break;
      }
      this.debug("BP: " + move.basePower);
    }*/
public Weather_Ball(Pokemon pkmn) {
        super(pkmn);
    }
}