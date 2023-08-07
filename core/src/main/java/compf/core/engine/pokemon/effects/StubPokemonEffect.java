package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;

public class StubPokemonEffect extends PokemonBattleEffect{
    public StubPokemonEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void pokemonSwitchedOut(EffectParam param) {
        getPokemon().resetStatChanges();
    }
}
