package teambuilder

import compf.core.engine.pokemon.Pokemon
import compf.core.engine.PokemonBattle
import compf.core.engine.Interrupt
import compf.core.engine.BattleState
import compf.core.engine.Player
import compf.core.engine.Tuple
import compf.core.networking.BotInterface
public class BattleExecutor(val myPokemon:Pokemon,val otherPokemon:Pokemon){
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
    public fun execute(numberTimes:Int):BattleState{
        val battle=PokemonBattle(2)
        val mePlayer=Player(0,"Me",arrayOf(Pokemon(myPokemon.nr, myPokemon.level, myPokemon.eVs, myPokemon.iVs, myPokemon.nature, myPokemon.moves)))
        
        val enemyPlayer=Player(1,"Enemy",arrayOf(otherPokemon))
        battle.players.add(mePlayer)
        battle.players.add(enemyPlayer)
        var lastState:BattleState?=null
        val ioInterfaces=arrayOf(BotInterface(mePlayer),BotInterface(enemyPlayer))
        val simpleInterrupt=SimpleInterrupt(ioInterfaces[0],ioInterfaces[1])
        for (i in 0..numberTimes){
            if(stop)break
            for(io in ioInterfaces){
                val input=io.requestPlayerInput(0)
                battle.addInput(input)
            }
            val result=battle.executeSchedule(simpleInterrupt)
            lastState=result.State
            battle.incrementRound()
            
        }
        return lastState!!
    }
}