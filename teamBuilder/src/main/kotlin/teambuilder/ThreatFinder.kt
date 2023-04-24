
package teambuilder

import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.moves.Move
import compf.core.engine.pokemon.Type
import compf.core.engine.SharedInformation

public class ThreatFinder (val defender:Pokemon){
    public fun findThreats(minDamageHPRatio:Double):Map<Int,Double>{
        val resultMap= HashMap<Int,Double>()
        val powers:ByteArray=byteArrayOf(75,80,90,120)
        for( i in 1..SharedInformation.PokemonCount-100){
            for(power in powers){
                for(kind in Move.MoveKind.values()){
                    for(type in Type.values()){
                        if(type==Type.Empty || type==Type.Bird)continue
                        val attacker=Pokemon(SharedInformation.Instance.getPokedexEntry(i), defender.level)
                        val dmg=ImaginaryMove(power, type, kind).calculateDamage(attacker, defender)
                        val ratio=dmg/(defender.maxHP.toDouble())
                        if(ratio>=minDamageHPRatio){
                            println(dmg.toString() +" "+ratio +  " "+ attacker.toString()+" "+ type+ " "+power +" "+kind)
                            resultMap.putIfAbsent(i, 0.0)
                            resultMap[i]=maxOf(resultMap[i]!!,ratio)
                        }

                    }
                }
            }
        }
        return resultMap
    }
}