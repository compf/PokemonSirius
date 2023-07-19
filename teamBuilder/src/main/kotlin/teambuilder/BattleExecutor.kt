package teambuilder

import compf.core.engine.*
import compf.core.engine.pokemon.Pokemon
import compf.core.networking.BotAI
import compf.core.networking.BotInterface
import java.util.*

open class BattleExecutor(val myPokemons:List<Pokemon>,val enemyPokemons:List<Pokemon>, val meAI:BotAI,val enemyAI:BotAI){
    private var stop=false

  private inner class SimpleInterrupt(val ioInterface1:BotInterface,val ioInterface2:BotInterface):Interrupt{
      override fun forceSwitch(playerId: Short, pokemonIndex: Short): Short {
       var result = if(playerId.toInt()==0) ioInterface1.switchPokemon(Tuple(pokemonIndex,null)) else ioInterface2.switchPokemon(Tuple(pokemonIndex,null));
        if(result.toInt()==-1){
          stop=true
        }
        return result
       }

  }
    open fun debugResult(result:BattleRoundResult){

    }
    public fun execute(numberTimes:Int):BattleState{
        val battle=PokemonBattle(BattleRule.DEFAULT_RULE)
        val mePlayer=Player(0,"Me",myPokemons.map{Pokemon(it.nr, it.level, it.eVs.clone(), it.iVs, it.nature, it.moves.clone())}.toTypedArray())
        
        val enemyPlayer=Player(1,"Enemy",enemyPokemons.map{Pokemon(it.nr, it.level, it.eVs.clone(), it.iVs, it.nature, it.moves.clone())}.toTypedArray())
        battle.players.add(mePlayer)
        battle.players.add(enemyPlayer)
        var lastState:BattleState?=null
        val ioInterfaces=arrayOf(BotInterface(mePlayer,meAI),BotInterface(enemyPlayer,enemyAI))
        for(io in ioInterfaces){
            io.update(BattleRoundResult(LinkedList<BattleAction>(),DetailedBattleState(listOf(mePlayer,enemyPlayer)),NetworkMessageKind.Update))
        }
        val simpleInterrupt=SimpleInterrupt(ioInterfaces[0],ioInterfaces[1])
        for (i in 0..numberTimes){
            if(stop)break
            var s:Short=0
            for(io in ioInterfaces){
                val input=io.requestPlayerInput(0)
                battle.addInput(input)
            }
            val result=battle.executeSchedule(simpleInterrupt)
            debugResult(result)
            lastState=result.State
            battle.incrementRound()
            
        }
        return lastState!!
    }
}
class DebugExecutor( myPokemons:List<Pokemon>, enemyPokemons:List<Pokemon>, meAI: BotAI,enemyAI: BotAI) : BattleExecutor(myPokemons, enemyPokemons,
    meAI,enemyAI
) {
    public val roundResults= mutableListOf<BattleRoundResult>()
    override   fun debugResult(result:BattleRoundResult){
        roundResults.add(result)
    }
}