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
/*Hits one time for the user and one time for each unfainted Pokemon without a non-volatile status condition in the user's party. The power of each hit is equal to 5+(X/10), where X is each participating Pokemon's base Attack; each hit is considered to come from the user.*/
 public class Beat_Up extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      const currentSpecies = move.allies.shift().species;
      const bp = 5 + Math.floor(currentSpecies.baseStats.atk / 10);
      this.debug("BP for " + currentSpecies.name + " hit: " + bp);
      return bp;
    }*/
/*@Override
 void onModifyMove(Move move, pokemon) {
      move.allies = pokemon.side.pokemon.filter((ally) => ally === pokemon || !ally.fainted && !ally.status);
      move.multihit = move.allies.length;
    }*/
public Beat_Up(Pokemon pkmn) {
        super(pkmn);
    }
}