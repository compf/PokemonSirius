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
/*Has a 30% chance to paralyze the target. This move can hit a target using Bounce, Fly, or Sky Drop, or is under the effect of Sky Drop. If the weather is Primordial Sea or Rain Dance, this move does not check accuracy. If the weather is Desolate Land or Sunny Day, this move's accuracy is 50%. If this move is used against a Pokemon holding Utility Umbrella, this move's accuracy remains at 70%.*/
 public class Thunder extends PokemonBattleEffect{

/*@Override
 void onModifyMove(Move move, pokemon, target) {
      switch (target?.effectiveWeather()) {
        case "raindance":
        case "primordialsea":
          move.accuracy = true;
          break;
        case "sunnyday":
        case "desolateland":
          move.accuracy = 50;
          break;
      }
    }*/
public Thunder(Pokemon pkmn) {
        super(pkmn);
    }
}