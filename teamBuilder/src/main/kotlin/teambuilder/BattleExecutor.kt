package teambuilder

import compf.core.engine.pokemon.Pokemon
import compf.core.engine.PokemonBattle
import compf.core.engine.Interrupt
import compf.core.engine.BattleState
import compf.core.engine.Player
import compf.core.engine.Tuple
import compf.core.networking.BotInterface
public class BattleExecutor(val myPokemon:Pokemon,val otherPokemon:Pokemon){
  private class SimpleInterrupt(val ioInterface1:BotInterface,val ioInterface2:BotInterface):Interrupt{

      override fun forceSwitch(playerId: Short, pokemonIndex: Short): Short {
        if(playerId.toInt()==0)return ioInterface1.switchPokemon(Tuple(pokemonIndex,null))
        else  return ioInterface2.switchPokemon(Tuple(pokemonIndex,null))
       }

  }
    public fun execute(numberTimes:Int):BattleState{
        val battle=PokemonBattle(2)
        val mePlayer=Player(0)
        val enemyPlayer=Player(1)
        var lastState:BattleState?=null
        val ioInterfaces=arrayOf(BotInterface(mePlayer),BotInterface(enemyPlayer))
        val simpleInterrupt=SimpleInterrupt(ioInterfaces[0],ioInterfaces[1])
        for (i in 0..numberTimes){
            for(io in ioInterfaces){
                val input=io.requestPlayerInput(0)
                battle.addInput(input)
            }
            val result=battle.executeSchedule(simpleInterrupt)
            lastState=result.State
            
        }
        return lastState!!
    }
}