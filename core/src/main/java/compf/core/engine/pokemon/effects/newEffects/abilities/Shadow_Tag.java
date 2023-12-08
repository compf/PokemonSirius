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
/*Prevents opposing Pokemon from choosing to switch out, unless they are holding a Shed Shell, are a Ghost type, or also have this Ability.*/
 public class Shadow_Tag extends PokemonBattleEffect{

/*@Override
 void onFoeTrapPokemon(pokemon) {
      if (!pokemon.hasAbility("shadowtag") && pokemon.isAdjacent(this.effectState.target)) {
        pokemon.tryTrap(true);
      }
    }*/
/*@Override
 void onFoeMaybeTrapPokemon(pokemon, source) {
      if (!source)
        source = this.effectState.target;
      if (!source || !pokemon.isAdjacent(source))
        return;
      if (!pokemon.hasAbility("shadowtag")) {
        pokemon.maybeTrapped = true;
      }
    }*/
public Shadow_Tag(Pokemon pkmn) {
        super(pkmn);
    }
}