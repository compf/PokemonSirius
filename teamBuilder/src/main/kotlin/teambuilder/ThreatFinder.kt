
package teambuilder

import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.moves.Move
import compf.core.engine.pokemon.Type
import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.effects.StubEffect
import compf.core.engine.pokemon.effects.ChoiceItemEffect
import compf.core.engine.pokemon.effects.BattleEffect
import compf.core.engine.pokemon.effects.PokemonBattleEffect
import compf.core.engine.pokemon.PokedexEntry
import compf.core.etc.services.SharedInformation
import kotlin.collections.HashMap
import kotlin.collections.MutableMap
public class ThreatFinder (val mePokemon:Pokemon,val minDamageHPRatio:Double){
    class ThreatData(var otherEntry:PokedexEntry?,var otherPokemon:Pokemon?,var otherNature:Nature?,
    var otherEV:IntArray?,var otherEffect:BattleEffect?,var otherMove:Move?){
        companion object{
            public fun allNull():ThreatData{
                return ThreatData(null,null,null,null,null,null)
            }
        }
    }

    val H=252
    private val evSpreads:Array<IntArray> =arrayOf(

        intArrayOf(H,H,0,0,0,0),
        intArrayOf(0,H,H,0,0,0),
        intArrayOf(0,0,H,H,0,0),
        intArrayOf(0,0,0,H,H,0),
        intArrayOf(0,0,0,0,H,H),
        intArrayOf(0,H,0,H,0,0),
        intArrayOf(0,H,0,0,H,0),
        intArrayOf(0,0,H,0,H,0),
        intArrayOf(H,0,0,0,H,0),
        intArrayOf(H,0,H,0,0,0),
        intArrayOf(H,0,0,H,0,0),

        intArrayOf(H,0,0,0,0,H),
        intArrayOf(0,H,0,0,0,H),
        intArrayOf(0,0,H,0,0,H),
        intArrayOf(0,0,0,H,0,H),
    )
    private fun applyEffect(effect:BattleEffect,pkmn:Pokemon){
        if(effect is PokemonBattleEffect){
            val field=PokemonBattleEffect::class.java.getDeclaredField("_pkmn")
            field.isAccessible=true
            field.set(effect, pkmn)
        }
    }
    private fun getMoveKindAttackStat(kind:Move.MoveKind):Int{
        if(kind==Move.MoveKind.Physical)return 1
        else return 3
    }
    private fun iteratePokedexEntries(threatData:ThreatData){
        for(entry in SharedInformation.Instance.pokedexEntryService.iterator() ){
            threatData.otherEntry=entry
            iterateEvSpread(threatData)
        }
    }
    private fun iterateEvSpread(threatData:ThreatData){
        for(evs in evSpreads){
            threatData.otherEV=evs
            iterateNatures(threatData)
        }
    }
    private fun iterateNatures(threatData:ThreatData){
        var natures=Nature.getUniqueNatures()
        for(nature in natures){
            threatData.otherNature=nature
            iterateMoves(threatData)
        }
    }
    private fun iterateMoves(threatData:ThreatData){
        for(move in SharedInformation.Instance.moveService.iterator()){
            threatData.otherMove=move;
            iterateEffects(threatData)
        }
    }
    private var counter=0
    private fun iterateEffects(threatData:ThreatData){
        val effects=arrayOf(StubEffect(),ChoiceItemEffect(null,getMoveKindAttackStat(threatData.otherMove!!.kind),1.5))
        for(effect in effects){
            threatData.otherEffect=effect;
            val danger=checkThreat(threatData)
            if(danger>=minDamageHPRatio){
                counter+=1
            }
        }
    }
    private fun checkThreat(threatData:ThreatData):Double{
        val ivs=intArrayOf(31,31,31,31,31,31)
        var otherPokemon=Pokemon(threatData.otherEntry!!.nr, mePokemon.level, threatData.otherEV!!, ivs, threatData.otherNature, arrayOf(threatData.otherMove,null,null,null))
        applyEffect(threatData.otherEffect!!, otherPokemon)
        if(threatData.otherEffect is PokemonBattleEffect){
            otherPokemon.addEffect(threatData.otherEffect as PokemonBattleEffect)
        }
        else{
            threatData.otherEffect!!.init(null)
        }
        val dmg=threatData.otherMove!!.calculateDamage(otherPokemon, mePokemon)
        threatData.otherEffect!!.disable()
        return dmg.toDouble()/mePokemon.maxHP
    }
    public fun findThreats():Map<String,Double>{
        val resultMap= HashMap<String,Double>()
        var threatData=ThreatData.allNull()
        iteratePokedexEntries(threatData)
        println(counter)
        return resultMap
    }
}