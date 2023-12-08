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
/*Raises the user's Attack and Special Attack by 1 stage. If the weather is Sunny Day or Desolate Land, this move raises the user's Attack and Special Attack by 2 stages. If the user is holding Utility Umbrella, this move will only raise the user's Attack and Special Attack by 1 stage, even if the weather is Sunny Day or Desolate Land.*/
 public class Growth extends PokemonBattleEffect{

/*@Override
 void onModifyMove(Move move, pokemon) {
      if (["sunnyday", "desolateland"].includes(pokemon.effectiveWeather()))
        move.boosts = { atk: 2, spa: 2 };
    }*/
public Growth(Pokemon pkmn) {
        super(pkmn);
    }
}