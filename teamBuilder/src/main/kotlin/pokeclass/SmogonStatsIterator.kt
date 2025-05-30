package pokeclass

import com.google.gson.Gson
import com.google.gson.JsonObject
import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.PokedexEntry
import compf.core.engine.pokemon.moves.Move
import compf.core.etc.PokemonConstants
import compf.core.etc.services.SharedInformation
import teambuilder.ThreatData
import util.CountingStyleIterator
import java.io.InputStreamReader

public const val NUMBER_ITERATORS_SMOGON=5
class SmogonStatsIterator(val leadPokemon: String): CountingStyleIterator<ThreatData>(NUMBER_ITERATORS_SMOGON) {

    private var jsonData:MutableMap<String,JsonObject> = mutableMapOf();
    private var threatData:ThreatData=ThreatData.allNull()
    private fun getKeysUntilSumExceedsThreshold(jsonObject: JsonObject,threshold:Double):Iterable<String>{
        var currValue=0.0
        val keys=jsonObject.keySet().toTypedArray()
        val resultList= mutableListOf<String>()
        var counter=0
        do {
            val key=keys[counter]
            val curr=jsonObject.get(key).asDouble
            resultList.add(key)
            currValue+=curr
            counter++
        }while(counter < keys.size && currValue<=threshold);
        return resultList
    }
    private fun getKeysUntilThreshold(jsonObject: JsonObject,threshold:Double):Array<String>{
        val keys=jsonObject.keySet().toTypedArray()
        val resultList= mutableListOf<String>()
        var counter=0
        do {
            val key=keys[counter]
            val curr=jsonObject.get(key).asDouble
            resultList.add(key)
            counter++

            if(curr<threshold){
                break;
            }
        }while(counter < keys.size );
        return resultList.toTypedArray()
    }
    val POKEDEX_ENTRY=0
    val EV_NATURE=1
    val ITEM_EFFECT=2
    val ABILITY_EFFECT=3
    val MOVE=4
    override fun reset(index: Int) {
        val POKEDEX_ENTRY=0
        val EV_NATURE=1
        val ITEM_EFFECT=2
        val ABILITY_EFFECT=3
        val MOVE=4
        iterators[index]=when(index){
            POKEDEX_ENTRY->{
               jsonData.keys.map { SharedInformation.Instance.pokedexEntryService.get(it) }.iterator()
            }
            EV_NATURE->{
                val SPREADS_THRESHOLD=0.5
               val keys= getKeysUntilSumExceedsThreshold(jsonData[threatData.otherEntry!!.name]!!.getAsJsonObject("spreads"),SPREADS_THRESHOLD)
              keys.iterator()
            }
            ITEM_EFFECT->{
                val ITEM_EFFECT_THRESHOLD=0.5
                val keys= getKeysUntilSumExceedsThreshold(jsonData[threatData.otherEntry!!.name]!!.getAsJsonObject("items"),ITEM_EFFECT_THRESHOLD)
               keys.iterator()

            }
           ABILITY_EFFECT->{
                val ABILITY_EFFECT_THRESHOLD=0.5
                val keys= getKeysUntilSumExceedsThreshold(jsonData[threatData.otherEntry!!.name]!!.getAsJsonObject("abilities"),ABILITY_EFFECT_THRESHOLD)

                keys.iterator()

            }
            MOVE->{
                val MOVES_THRESHOLD=0.3
                val keys= getKeysUntilThreshold(jsonData[threatData.otherEntry!!.name]!!.getAsJsonObject("moves"),MOVES_THRESHOLD)
                val moves= mutableListOf<Array<Move?>>()

                for(offset in 0 until keys.size){
                    var counter=0
                    val array= arrayOfNulls<Move>(PokemonConstants.MAX_MOVES_COUNT_POKEMON)
                    for (keyIndex in offset until keys.size-offset){
                        array[counter]=SharedInformation.Instance.moveService.get(keys[keyIndex])
                        counter++
                        if(counter>=PokemonConstants.MAX_MOVES_COUNT_POKEMON)break
                    }
                    if(array.any { it!=null }){
                        moves.add(array)

                    }
                }
                moves.iterator()
            }
            else->null


        }
    }

    override fun assign(index: Int, value: Any) {
      when(index){
          POKEDEX_ENTRY->{
              threatData.otherEntry=value as PokedexEntry
          }
          EV_NATURE->{
              val nature_evs=value.toString().split(":")
              val nature= Nature.parse(nature_evs[0])
              val evs=nature_evs[1].split("/").map { it.toInt() }.toIntArray()
              threatData.otherEV=evs
              threatData.otherNature=nature

          }
          ITEM_EFFECT->{
              threatData.otherItemEffect=value.toString()
          }
          ABILITY_EFFECT->{
              threatData.otherAbilityEffect=value.toString()
          }
          MOVE->{
              threatData.otherMoves=value as Array<Move>
          }
      }
    }

    override fun construct(): ThreatData {
       return threatData
    }
    constructor(leadPokemon: String,resourceName:String):this(leadPokemon){
        InputStreamReader(SharedInformation.Instance.getResource("stats/$resourceName")).use {
            var jsonObject= Gson().fromJson(it,JsonObject::class.java)
            jsonData.put(leadPokemon,jsonObject.getAsJsonObject("pokemon").getAsJsonObject(leadPokemon))


        }

    }
}
 class FullTeamIterator(val leadPokemon: String, val resourceName: String) :
     CountingStyleIterator<Array<ThreatData>>(PokemonConstants.DEFAULT_TEAM_SIZE) {
         private val teamMateNames:Iterable<String>
    private var team= arrayOfNulls<ThreatData>(PokemonConstants.DEFAULT_TEAM_SIZE);
     override fun reset(index: Int) {
        /*val it=SmogonStatsIterator(teamMateNames.toList() [index],resourceName)
         iterators[index]=it
         it.resetAll()*/

     }

     init {
         teamMateNames=getTeamMates()
         for((counter, name) in getTeamMates().withIndex()) {
             val it=SmogonStatsIterator(name,resourceName)
             iterators[counter]=it
             it.resetAll()

         }
     }
     private fun getTeamMates():Iterable<String> {
          InputStreamReader(SharedInformation.Instance.getResource("stats/$resourceName")).use { stream ->
             val jsonObject= Gson().fromJson(stream,JsonObject::class.java)
             return  (arrayOf( leadPokemon)+jsonObject.getAsJsonObject("pokemon").getAsJsonObject(leadPokemon).getAsJsonObject("teammates").keySet().take(PokemonConstants.DEFAULT_TEAM_SIZE-1).toTypedArray()).asIterable()

         }
     }

     override fun assign(index: Int, value: Any) {
        team[index]=value as ThreatData
     }

     override fun construct(): Array<ThreatData> {
         return team.requireNoNulls()
     }
 }

