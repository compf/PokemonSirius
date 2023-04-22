
package teambuilder

import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.moves.Move
import compf.core.engine.pokemon.Type
import compf.core.engine.SharedInformation

public class ThreatFinder (val def:Pokemon){
    public fun findThreats(minDamageHPRatio:Double):Map<Int,Double>{
        val resultMap= HashMap<Int,Double>()
        val powers:ByteArray=byteArrayOf(75)
        for( i in 1..SharedInformation.PokemonCount-100){
            for(power in powers){
                for(kind in Move.MoveKind.values()){
                    for(type in Type.values()){
                        if(type==Type.Empty || type==Type.Bird)continue
                        val att=Pokemon(SharedInformation.Instance.getPokedexEntry(i), def.level)
                        val dmg=ImaginaryMove(power, type, kind).calculateDamage(att, def)
                        val ratio=dmg/(def.maxHP.toDouble())
                        if(ratio>=minDamageHPRatio){
                            println(dmg.toString() +" "+ratio +  " "+ att.toString()+" "+att.level)
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