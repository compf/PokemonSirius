

import compf.core.engine.*
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.effects.BattleEffect
import compf.core.networking.*
import java.util.*
import kotlin.collections.ArrayDeque
class DefaultValuePipe:Pipe{
    private val buffer=ArrayDeque<NetworkMessage>()
    override fun write(p0: NetworkMessage): Boolean { 
        buffer.addLast(p0);
        return true;
    }
    

    override fun read(): NetworkMessage { 
        if(buffer.isEmpty()){
            return NetworkMessage(NetworkMessageKind.None,null)
        }
        return buffer.removeFirst()
    }

    override fun waitForConnection(): Pipe { return this}

    override fun connect(): Pipe { return this}

    override fun avaliable(): Boolean {return true }
    
}
public  class TestableClient(player:Player,rule:BattleRule,io:SimulationBattleIO,pipe:Pipe):BattleClient(player,rule,io,pipe){

}
class TestableInterrupt(val rule:BattleRule,val battle: PokemonBattle):Interrupt{
    override fun getNewPokemonIndex(playerId: Short, pokemonIndex: Short): Short {
        for(i in 0 until rule.MaxPokemonInTeamPerPlayer){
            if(i!=pokemonIndex.toInt() &&  battle.getPlayerById(playerId).getPokemon(i)!=null && battle.getPlayerById(playerId).getPokemon(i).currHP>0 && i > pokemonIndex){
                return i.toShort()
            }
        }
        return -1
    }


}
public class TestableServer:BattleServer{
    val client1:BattleClient;
    val client2:BattleClient;
    private val nodes:Array<SteppableHost>
     val meIO:SimulationBattleIO
     val enemyIO:SimulationBattleIO
     fun hasEffect(effect:Class<out BattleEffect> ):Boolean{
        return _battles.get(0)!!.globalEffects.hasEffect(effect)
     }
    constructor( dummyMePokemon:Pokemon,  dummyEnemyPokemon:Pokemon): this(Player(0,"Me",arrayOf(dummyMePokemon,null,null,null,null,null)),Player(1,"Enemy",arrayOf(dummyEnemyPokemon,null,null,null,null,null))){

    }

    override fun getInterrupt(): Interrupt {
        return TestableInterrupt(_rules[0]!!,_battles[0]!!)
    }
    constructor( mePlayer: Player,  enemyPlayer:Player)  {
        val rule=BattleRule(2,1,6,1)
        this._rules.put(0,rule)
        this._rules.put(1,rule)

        this._players.put(0,mePlayer)
        this._players.put(1,enemyPlayer)

        this._playerIds.add(0)
        this._playerIds.add(1)
        this._inputCounter[0]=0

        val battle=PokemonBattle(rule)
        this._battles.put(0, battle)
        this._battles.put(1, battle)
        battle.getPlayers().add(this._players.get(0));
        battle.getPlayers().add(this._players.get(1));
        battle.start()

        this._gamePlayers.put(0, LinkedList())
        this._gamePlayers.get(0)!!.add(0)
        this._gamePlayers.get(0)!!.add(1)
        
        val client1ReadPipe=DefaultValuePipe()
        val client1WritePipe=DefaultValuePipe()
        val client1ToServer=PipeEndPoint(client1ReadPipe,client1WritePipe)
        val serverToClient1=PipeEndPoint(client1WritePipe, client1ReadPipe)

        val client2ReadPipe=DefaultValuePipe()
        val client2WritePipe=DefaultValuePipe()
        val client2ToServer=PipeEndPoint(client2ReadPipe,client2WritePipe)
        val serverToClient2=PipeEndPoint(client2WritePipe, client2ReadPipe)
        this.meIO=SimulationBattleIO(mePlayer,battle)
        this.enemyIO=SimulationBattleIO(enemyPlayer,battle)

        this._pipes.put(0,serverToClient1)
        this.client1=TestableClient(mePlayer,rule,meIO,client1ToServer)

        this._pipes.put(1,serverToClient2)
        this.client2=TestableClient(enemyPlayer,rule,enemyIO,client2ToServer)
        this.nodes=arrayOf<SteppableHost>(this,client1,client2)
        this.informPlayerOfUpdate(0, BattleRoundResult(null, DetailedBattleState(battle.getPlayers()), null))
        this.sendPlayerRequestInputs(0,rule)



    }
   public override fun run(gameId:Short){
        for( c in nodes.indices){
            nodes[c].step(0)
        }
    }
}