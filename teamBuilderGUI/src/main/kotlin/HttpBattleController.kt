package main

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.json.JsonMapper
import compf.core.engine.*
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.PokemonStat
import compf.core.networking.BattleClient
import compf.core.networking.IOInterface
import compf.core.networking.Pipe
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayDeque

class SimplifiedBattleState :BattleState{
    data class SimplifiedPokemon(
        var nr:Int=0,
        var name:String="",
        var hp:Int=0,
        var maxHp:Int=0,
        var level:Int=0,
        var stateCondition:String="",
        var moves:Array<String>
    )

    constructor(detailedBattleState: DetailedBattleState){
       for(pl in detailedBattleState.allPlayers){
           playerMap[pl.playerId.toInt()]=pl.name
           pokemonMap[pl.playerId.toInt()]=pl.team.map {
               SimplifiedPokemon(
                   it.nr,
                   it.name,
                   it.currHP,
                   it.getStat(PokemonStat.HP),
                   it.level,
                   "", // TODO,
                   it.moves.map { it.name }.toTypedArray()
               )
           }.toTypedArray()

           for(pkmn in pl.team){

           }
       }

    }
    val playerMap:MutableMap<Int,String> = mutableMapOf()
    val pokemonMap:MutableMap<Int,Array<SimplifiedPokemon>> = mutableMapOf()

    override fun getCurrHp(playerId: Int, pkmnIndex: Int): Int {
        return pokemonMap[playerId]!![pkmnIndex].hp
    }

    override fun getMaxHP(playerId: Int, pkmnIndex: Int): Int {
        return pokemonMap[playerId]!![pkmnIndex].maxHp
    }

    override fun getPlayerIds(): MutableIterable<Short> {
        return playerMap.keys.map { it.toShort() }.toMutableList()
    }

    override fun getPokemonLevel(playerId: Short, pokemonId: Short): Int {
        return pokemonMap[playerId.toInt()]!![pokemonId.toInt()].level
    }

    override fun getDefeatedPlayer(): Optional<Int> {
        return Optional.empty()
    }

    override fun getPlayerName(playerId: Int): String {
        return playerMap[playerId]!!
    }

    override fun getPokemonName(playerId: Int, pokemonId: Int): String {
        return pokemonMap[playerId]!![pokemonId].name
    }

    override fun getStateConditionString(playerId: Int, pkmnIndex: Int): String {
        return pokemonMap[playerId]!![pkmnIndex].stateCondition
    }

    override fun getPokemonNr(playerId: Short, pokemonId: Short): Int {
        return pokemonMap[playerId.toInt()]!![pokemonId.toInt()].nr
    }




}
@RestController()
class HttpBattleController  :Pipe, IOInterface{
    companion object{
        val toWrite=ArrayDeque<NetworkMessage>()
        val toRead=LinkedBlockingQueue<NetworkMessage>()
    }

    override fun write(obj: NetworkMessage): Boolean {
        var modfiedObj=NetworkMessage(obj.Kind,simplifyData(obj.Data))
        toWrite.add(modfiedObj)
        return true
    }

    override fun read(): NetworkMessage {
        var res=toRead.poll(1,TimeUnit.HOURS)
        return res
    }

    override fun waitForConnection(): Pipe {
        return this
    }

    override fun connect(): Pipe {
        return this
    }

    override fun avaliable(): Boolean {
        return true
    }
    fun simplifyData(data:Any):Any?{
        if(data is Tuple<*, *>){
            if(data.Item2 is DetailedBattleState){
                return SimplifiedBattleState(data.Item2 as DetailedBattleState)
            }

        }
        else if(data is BattleRoundResult){
           return mapOf<String,Any>(
                "Actions" to data.Actions.map { it.Messages.joinToString { it.toString() } },
                "State" to SimplifiedBattleState(data.State as DetailedBattleState),
               "Kind" to data.Kind
            )
        }
        return null
    }

    fun convertData(kind:String, data:JsonNode):Any?{
        return when(kind){
            NetworkMessageKind.ReplyInputFromIO.name->{
                if(data.has("MoveIndex")){
                    return PlayerInput.AttackInput(
                        data["PokemonIndex"].asInt().toShort(),
                        data["MoveIndex"].asText().toShort(),
                        data["TargetPlayer"].asInt().toShort(),
                        data["TargetPokemonIndex"].asInt().toShort(),
                        data["PlayerId"].asInt().toShort()
                    )
                }
                else{
                    data
                }

            }

            NetworkMessageKind.Update.name,NetworkMessageKind.None.name->{
                return null
            }

            else->{
                data
            }
        }

    }

    @PostMapping("/battle/fetch")
    fun fetch(@RequestBody body:JsonNode):NetworkMessage{
        val kind=NetworkMessageKind.valueOf( body["Kind"].asText())
        val data=convertData(kind.name,body["Data"])
        val msg=NetworkMessage(kind,data)

       toRead.offer(msg)
        val write=toWrite.removeFirstOrNull()
        if(write==null){
            return NetworkMessage(NetworkMessageKind.None,null)
        }
        else{
            return write
        }
    }

    override fun message(msg: String?) {
        toWrite.addLast(NetworkMessage(NetworkMessageKind.Message,msg))
    }

    override fun update(state: BattleRoundResult?) {
        toWrite.addLast(NetworkMessage(NetworkMessageKind.Update,state))
    }

    override fun requestPlayerInput(inf: Tuple<Short, BattleState>?): PlayerInput {
       toWrite.addLast(NetworkMessage(NetworkMessageKind.RequestInputToIO,inf))
        return read().Data as PlayerInput
    }

    override fun battleEnded(playerId: Int) {

    }

    override fun switchPokemon(inf: Tuple<Short, BattleState>?): Short {
        return 1
    }

    override fun getPipe(): Pipe {
        return this
    }
}