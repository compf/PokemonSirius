package pokeclass

import com.google.gson.Gson
import com.google.gson.JsonObject
import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.moves.Move
import compf.core.etc.PokemonConstants
import compf.core.etc.services.SharedInformation
import compf.core.etc.services.learnset.LearnsetService
import java.io.InputStreamReader

class SmogonDataLoader:LearnsetService {
    private  class SmogonData(val moves:List<String>, val evs:List<IntArray>,val natures:List<Nature>, val abilities:List<String>,val items:List<String>){
    }
    constructor(resourceName:String)  {
        this.resourceName=resourceName
        init()
    }
    var resourceName:String
    fun randomPokemonName():String{
        return  randomFromList(jsonData.keys.toList())
    }
    override fun getMoveNames(id: String?): Iterable<String> {
       return jsonData[id!!]!!.moves
    }
    fun randomMoveName(pokemonName:String):String{
        return randomFromList(jsonData[pokemonName]!!.moves)
    }
    fun randomUniqueMoves(pokemonName:String):Array<Move>{
        val moves= mutableSetOf<Move>()
        val learnsetSize=jsonData[pokemonName]!!.moves.filterNot { it=="Nothing" }.size
        while (moves.size<minOf(learnsetSize,PokemonConstants.MAX_MOVES_COUNT_POKEMON)){
            moves.add(SharedInformation.Instance.moveService.get(randomMoveName(pokemonName)))
        }
        return moves.toTypedArray()
    }
    fun randomEv(pokemonName:String):IntArray{
        return randomFromList(jsonData[pokemonName]!!.evs)
    }
    fun randomNature(pokemonName:String):Nature{
        return randomFromList(jsonData[pokemonName]!!.natures)
    }
    fun randomAbility(pokemonName:String):String{
        return randomFromList(jsonData[pokemonName]!!.abilities)
    }
    fun randomItem(pokemonName:String):String{
        return randomFromList(jsonData[pokemonName]!!.items)
    }
    fun <T>randomFromList(arr:List<T>):T{
        var index=SharedInformation.Instance.rng.randomNumber(arr.size,SmogonData::javaClass)
        while(arr[index].toString()=="Nothing"){
            index=SharedInformation.Instance.rng.randomNumber(arr.size,SmogonData::javaClass)
        }
        return arr[index]
    }
    private val jsonData:MutableMap<String,SmogonData> = mutableMapOf()
    override fun init() {
        InputStreamReader(SharedInformation.Instance.getResource("stats/$resourceName")).use {
            var jsonObject= Gson().fromJson(it,JsonObject::class.java)
            for(key in jsonObject.getAsJsonObject("pokemon").keySet()){
                val pkmnData=jsonObject.getAsJsonObject("pokemon").getAsJsonObject(key)
                val moves=pkmnData.getAsJsonObject("moves").keySet().toList()
                val all_evs:MutableList<IntArray> = mutableListOf()
                val all_natures:MutableList<Nature> = mutableListOf()
                for(value in pkmnData.getAsJsonObject("spreads").keySet()){
                    val nature_evs=value.toString().split(":")
                    val nature= Nature.parse(nature_evs[0])
                    val evs=nature_evs[1].split("/").map { it.toInt() }.toIntArray()
                    all_evs.add(evs)
                    all_natures.add(nature)
                }
                val items=pkmnData.getAsJsonObject("items").keySet().toList()
                var abilities=pkmnData.getAsJsonObject("abilities").keySet().toList()


                jsonData.put(key, SmogonData(moves,all_evs,all_natures,abilities,items))

            }


        }
    }
}