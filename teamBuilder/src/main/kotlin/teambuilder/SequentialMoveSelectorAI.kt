package teambuilder

import compf.core.engine.BattleState
import compf.core.engine.Player
import compf.core.engine.PlayerInput
import compf.core.networking.BotAI

class SequentialMoveSelectorAI : BotAI {
    private  var index:Short=0
    override fun getPlayerInput(pkmnIndex: Short, mePlayer: Player?, state: BattleState?): PlayerInput {
        val enemyPlayerId=this.selectEnemyPlayerId(mePlayer,state)
        val enemyPokemonId=this.selectEnemyPokemonId(enemyPlayerId)
        val input=PlayerInput.AttackInput(pkmnIndex,index,enemyPlayerId,enemyPokemonId,mePlayer!!.playerId)
        index=((index+1)%4).toShort()
        if(mePlayer!!.team[pkmnIndex.toInt()].moves[index.toInt()]==null){
            index=0
        }
        return input

    }

}
