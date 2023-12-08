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
/*Power is equal to 100 times the user's Stockpile count. Fails if the user's Stockpile count is 0. Whether or not this move is successful, the user's Defense and Special Defense decrease by as many stages as Stockpile had increased them, and the user's Stockpile count resets to 0.*/
 public class Spit_Up extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon) {
      if (!pokemon.volatiles["stockpile"]?.layers)
        return false;
      return pokemon.volatiles["stockpile"].layers * 100;
    }*/
/*@Override
 void onTry(source) {
      return !!source.volatiles["stockpile"];
    }*/
/*@Override
 void onAfterMove(pokemon) {
      pokemon.removeVolatile("stockpile");
    }*/
public Spit_Up(Pokemon pkmn) {
        super(pkmn);
    }
}