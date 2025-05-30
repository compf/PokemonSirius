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
/*Has a 10% chance to freeze the target. If the weather is Snow, this move does not check accuracy.*/
 public class Blizzard extends PokemonBattleEffect{

/*@Override
 void onModifyMove(move) {
      if (this.field.isWeather(["hail", "snow"]))
        move.accuracy = true;
    }*/
public Blizzard(Pokemon pkmn) {
        super(pkmn);
    }
}