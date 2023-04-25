
package teambuilder

import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.moves.Move
import compf.core.engine.pokemon.Type
import compf.core.engine.pokemon.Nature
import compf.core.etc.services.SharedInformation
import kotlin.collections.HashMap
import kotlin.collections.MutableMap
public class ThreatFinder (val defender:Pokemon){
    public fun findThreats(minDamageHPRatio:Double):Map<Int,Double>{
        val resultMap= HashMap<Int,Double>()
        val powers:ByteArray=byteArrayOf(75,80,90,120)
        val natureMap:MutableMap<Move.MoveKind,Array<Nature>> = HashMap()
        val evMap:MutableMap<Move.MoveKind,IntArray> =HashMap()
        val ivs=intArrayOf(31,31,31,31,31,31)
        val moveKinds=arrayOf(Move.MoveKind.Physical,Move.MoveKind.Special)
        evMap[Move.MoveKind.Physical] =intArrayOf(252,252,0,0,0,0)
        natureMap[ Move.MoveKind.Physical ] = arrayOf(Nature.Bold,Nature.Lonely)

        evMap[Move.MoveKind.Special] =intArrayOf(252,0,0,252,0,0)
        natureMap[ Move.MoveKind.Special ] = arrayOf(Nature.Impish,Nature.Mild)

        for(entry in SharedInformation.Instance.pokedexEntryService.iterator()){
            for(power in powers){
                for(kind in moveKinds){
                    for(type in Type.values()){
                        for(nature in natureMap[kind]!!){
                            if(type==Type.Empty || type==Type.Bird)continue
                            val mv=ImaginaryMove(power, type, kind)
                            val attacker=Pokemon(entry.nr, defender.level,evMap[kind],ivs,nature,arrayOf(mv,null,null,null))
                            val dmg=mv.calculateDamage(attacker, defender)
                            val ratio=dmg/(defender.maxHP.toDouble())
                            if(ratio >= minDamageHPRatio){
                                println(dmg.toString() +" "+ratio +  " "+ attacker.toString()+" "+ type+ " "+power +" "+kind)
                                resultMap.putIfAbsent(attacker.nr, 0.0)
                                resultMap[attacker.nr]=maxOf(resultMap[attacker.nr]!!,ratio)
                            }
                        }
                        

                    }
                }
            }
        }
        return resultMap
    }
}