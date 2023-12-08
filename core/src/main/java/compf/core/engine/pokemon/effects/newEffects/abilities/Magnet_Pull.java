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
/*Prevents opposing Steel-type Pokemon from choosing to switch out, unless they are holding a Shed Shell or are a Ghost type.*/
 public class Magnet_Pull extends PokemonBattleEffect{

/*@Override
 void onFoeTrapPokemon(pokemon) {
      if (pokemon.hasType("Steel") && pokemon.isAdjacent(this.effectState.target)) {
        pokemon.tryTrap(true);
      }
    }*/
/*@Override
 void onFoeMaybeTrapPokemon(pokemon, source) {
      if (!source)
        source = this.effectState.target;
      if (!source || !pokemon.isAdjacent(source))
        return;
      if (!pokemon.knownType || pokemon.hasType("Steel")) {
        pokemon.maybeTrapped = true;
      }
    }*/
public Magnet_Pull(Pokemon pkmn) {
        super(pkmn);
    }
}