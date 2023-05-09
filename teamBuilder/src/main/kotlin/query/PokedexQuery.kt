package query;

import compf.core.engine.pokemon.PokedexEntry
import compf.core.etc.services.SharedInformation
import java.util.stream.StreamSupport
import kotlin.collections.mutableListOf
public class PokedexQuery{
    public fun getSimiliarPokemon(pokedexEntry:PokedexEntry,minFactor:Double,maxFactor:Double, pokedexEntryRater:(entry:PokedexEntry)->Double):Sequence<PokedexEntry>{
        val compValue=pokedexEntryRater(pokedexEntry)
       var res=  SharedInformation.Instance.pokedexEntryService.iterator().asSequence().filter {
            var value=pokedexEntryRater(it)
            compValue >= minFactor*value && compValue <= value*maxFactor;
        }

        return res
    }

}