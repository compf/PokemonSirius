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
/*Has a 30% chance to lower the target's Speed by 1 stage. If the weather is Primordial Sea or Rain Dance, this move does not check accuracy. If this move is used against a Pokemon holding Utility Umbrella, this move's accuracy remains at 80%.*/
 public class Bleakwind_Storm extends PokemonBattleEffect{

/*@Override
 void onModifyMove(Move move, pokemon, target) {
      if (target && ["raindance", "primordialsea"].includes(target.effectiveWeather())) {
        move.accuracy = true;
      }
    }*/
public Bleakwind_Storm(Pokemon pkmn) {
        super(pkmn);
    }
}