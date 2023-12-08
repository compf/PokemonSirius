package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Holder may switch out even when trapped by another Pokemon, or by Ingrain.*/
 public class Shed_Shell extends PokemonBattleEffect{

/*@Override
 void onTrapPokemon(pokemon) {
      pokemon.trapped = pokemon.maybeTrapped = false;
    }*/
public Shed_Shell(Pokemon pkmn) {
        super(pkmn);
    }
}