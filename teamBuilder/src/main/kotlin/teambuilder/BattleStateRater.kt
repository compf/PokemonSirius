package teambuilder;

import compf.core.engine.BattleState
import compf.core.engine.DetailedBattleState
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.effects.BurnedStateCondition
import compf.core.engine.pokemon.effects.FrozenStateCondition
import compf.core.engine.pokemon.effects.ParalyzedStateCondition
import compf.core.engine.pokemon.effects.PoisonedStateCondition
import compf.core.engine.pokemon.effects.SleepingEffect
public class BattleStateRater{
    public fun rate(state:BattleState,playerId:Short):Double{
        val converted=state as DetailedBattleState
        val players=converted.getAllPlayers()
       val player= if (players[0].playerId==playerId) players[0] else players[1]
       var totalHpSum=0
       var hpSum=0.0
       for(pkmn in player.team){
        if(pkmn==null)continue
        val factor:Double =if (hasVisibleEffect(pkmn)) 0.5  else 1.0
        hpSum+=(pkmn.currHP*factor)
        totalHpSum+=pkmn.maxHP
       }
       return hpSum/totalHpSum

    }
    private val visibleEffects=arrayOf(BurnedStateCondition::class.java,FrozenStateCondition::class.java,ParalyzedStateCondition::class.java,PoisonedStateCondition::class.java,SleepingEffect::class.java)
    private fun hasVisibleEffect(pkmn:Pokemon):Boolean{
     return  visibleEffects.any { pkmn.effects.hasEffect(it) }
        
    }
}