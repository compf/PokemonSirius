package compf.core.etc.services;

import compf.core.engine.pokemon.PokedexEntry;

public interface PokedexEntryService  extends GeneralService<PokedexEntry>{
    public String getPokemonId(int nr);
}
