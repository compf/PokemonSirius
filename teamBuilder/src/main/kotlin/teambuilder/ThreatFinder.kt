
package teambuilder

import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.moves.Move
import compf.core.engine.pokemon.Type
import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.effects.StubEffect
import compf.core.engine.pokemon.effects.ChoiceItemEffect
import compf.core.engine.pokemon.effects.BattleEffect
import compf.core.engine.pokemon.effects.PokemonBattleEffect
import compf.core.etc.services.SharedInformation
import kotlin.collections.HashMap
import kotlin.collections.MutableMap
public class ThreatFinder (val defender:Pokemon){
    private fun applyEffect(effect:BattleEffect,pkmn:Pokemon){
        if(effect is PokemonBattleEffect){
            val field=PokemonBattleEffect::class.java.getDeclaredField("_pkmn")
            field.isAccessible=true
            field.set(effect, defender)
        }
        effect.init(null)
    }
    private fun getMoveKindAttackStat(kind:Move.MoveKind):Int{
        if(kind==Move.MoveKind.Physical)return 1
        else return 3
    }
    public fun findThreats(minDamageHPRatio:Double):Map<String,Double>{
        val resultMap= HashMap<String,Double>()
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
                    val effects=arrayOf(StubEffect(),ChoiceItemEffect(null,getMoveKindAttackStat(kind),1.5))
                    for(type in Type.values()){
                        for(nature in natureMap[kind]!!){
                            for(effect in effects){
                                if(type==Type.Empty || type==Type.Bird)continue
                                val mv=ImaginaryMove(power, type, kind)
                                val attacker=Pokemon(entry.nr, defender.level,evMap[kind],ivs,nature,arrayOf(mv,null,null,null))
                                applyEffect(effect, defender)
                                if(effect is PokemonBattleEffect){
                                    attacker.addEffect(effect as PokemonBattleEffect)
                                }
                                
                                val key=arrayOf(attacker,power,kind,type,nature,effect).joinToString(" ") 
                                val dmg=mv.calculateDamage(attacker, defender)
                                effect.disable()
                                val ratio=dmg/(defender.maxHP.toDouble())
                                if(ratio >= minDamageHPRatio){
                                    println(key +ratio)
                                    resultMap.putIfAbsent(key, ratio)
                                }
                            }
                            
                        }
                        

                    }
                }
            }
        }
        return resultMap
    }
}