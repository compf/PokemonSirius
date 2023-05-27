package compf.core.etc.services.pokemon;

import compf.core.engine.pokemon.PokedexEntry;
import compf.core.etc.services.GeneralService;

public interface PokedexEntryService  extends GeneralService<PokedexEntry> {
    int getNr(String key);
    String getRealName(String key);
}
