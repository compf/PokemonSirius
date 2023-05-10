package pokeclass

import compf.core.engine.pokemon.PokedexEntry
import compf.core.engine.pokemon.PokemonStat

class PokedexEntryClassifier {
    companion object {
        const val ATT_THRESHOLD = 75
        const val SATT_THRESHOLD = 75;
        const val DEF_THRESHOLD = 75;
        const val SDEF_THRESHOLD = 75;
    }

    public fun getPossibleCategories(entry: PokedexEntry):Iterable<PokedexEntryCategory> {

        var totalSum = 0
        var result = mutableListOf<PokedexEntryCategory>()


        if (entry.baseStats[PokemonStat.ATT] > ATT_THRESHOLD ) {
            result.add(PokedexEntryCategory.PhysicalSweeper)
        }
        if (entry.baseStats[PokemonStat.SATT] > SATT_THRESHOLD) {
            result.add(PokedexEntryCategory.SpecialSweeper)
        }
        if (entry.baseStats[PokemonStat.ATT] > ATT_THRESHOLD && entry.baseStats[PokemonStat.SATT] > SATT_THRESHOLD) {
            result.add(PokedexEntryCategory.MixedSweeper)
        }
        if (entry.baseStats[PokemonStat.DEF] > DEF_THRESHOLD ) {
            result.add(PokedexEntryCategory.PhysicalTank)
        }
        if (entry.baseStats[PokemonStat.SDEF] > SDEF_THRESHOLD ) {
            result.add(PokedexEntryCategory.SpecialTank)
        }
        if(result.isEmpty()){
            result.add(PokedexEntryCategory.Other)
        }
        return result
    }

}