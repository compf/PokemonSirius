

import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.SharedInformation

public class PokemonCreator {
    companion object{
        //TODO maybe later to create best pokemon
        /*
        private fun createPokemon(nr:Int,maxStats:Boolean,nature:Nature,abilityId:Int,itemId:Int,moveId:Int){
            val entry=SharedInformation.Instance.getPokedexEntry(nr)
           val sortedStats= entry.baseStats.withIndex().sortedByDescending  { p:IndexedValue<Int> ->p.value }
            val evs=arrayOf(0,0,0,0,0)
            val possibleEvs=arrayOf(252,252,6)
            var possibleEvCounter=0;
            for(stat in sortedStats.take(3)){
                evs[stat.index]=possibleEvs[possibleEvCounter++]
            }
            val ivs=arrayOf(31,31,31,31,31,31)
        }*/
        public val SplashIndex=150

        public fun createPokemon(nr:Int,level:Int, ivs:IntArray,evs:IntArray,nature:Nature,abilityId:Int,itemId:Int,moveId:Int):Pokemon{
            return Pokemon(nr,level,evs,ivs,nature,arrayOf(SharedInformation.Instance.getMove(moveId),null,null,null))
        }
        public fun createStubPokemon(nr:Int,level:Int, ivs:IntArray,evs:IntArray,nature:Nature,abilityId:Int,itemId:Int):Pokemon{
            return Pokemon(nr,level,evs,ivs,nature,arrayOf(SharedInformation.Instance.getMove(SplashIndex),null,null,null))
        }
    }
}
