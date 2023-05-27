package compf.core.etc.services.pokemon;

import compf.core.engine.pokemon.PokedexEntry;
import compf.core.etc.services.GeneralService;

public interface PokedexEntryService  extends GeneralService<PokedexEntry> {
    public String getPokemonId(int nr);
}
