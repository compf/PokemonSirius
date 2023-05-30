package teambuilder

import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.PokedexEntry
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.PokemonStat
import compf.core.engine.pokemon.effects.BattleEffect
import compf.core.engine.pokemon.effects.ChoiceItemEffect
import compf.core.engine.pokemon.effects.PokemonBattleEffect
import compf.core.engine.pokemon.effects.StubEffect
import compf.core.engine.pokemon.moves.Move
import compf.core.etc.services.SharedInformation
import compf.core.networking.HeuristicBasedAI
import pokeclass.PokedexEntryCategory
import pokeclass.PokedexQuery
import pokeclass.PokedexEntryClassifier

public class ThreatFinder(val mePokemon: Pokemon, val minDamageHPRatio: Double) {








    private fun applyEffect(effect: BattleEffect, pkmn: Pokemon) {
        if (effect is PokemonBattleEffect) {
            val field = PokemonBattleEffect::class.java.getDeclaredField("_pkmn")
            field.isAccessible = true
            field.set(effect, pkmn)
        }
    }





    private fun checkThreat(threatData: ThreatData): Boolean {
        var otherPokemon = threatData.createPokemon(mePokemon.level)

        applyEffect(threatData.otherEffect!!, otherPokemon)
        if (threatData.otherEffect is PokemonBattleEffect) {
            otherPokemon.addEffect(threatData.otherEffect as PokemonBattleEffect)
        } else {
            threatData.otherEffect!!.init(null)
        }
        /*val damageOtherToMe = threatData.otherMove!!.calculateDamage(otherPokemon, mePokemon)
         var bestMove:Move=mePokemon.moves[0]
         var bestDamage=0
         for(myMove in mePokemon.moves.filterNotNull()){
             val dmg=myMove.calculateDamage(mePokemon, otherPokemon)
             if(dmg>bestDamage){
                 bestMove=myMove
                 bestDamage=dmg
             }
         }
         if(bestDamage.toDouble()/otherPokemon.maxHP>=minDamageHPRatio && mePokemon.getStat(PokemonStat.SPEED)>otherPokemon.getStat(PokemonStat.SPEED)){
             return false
         }
         threatData.otherEffect!!.disable()
         return damageOtherToMe.toDouble() / mePokemon.maxHP> minDamageHPRatio*/
        val executor = BattleExecutor(mePokemon, otherPokemon,HeuristicBasedAI(),HeuristicBasedAI())
        val state = executor.execute(5)
        val rater = BattleStateRater()
        val rating = rater.rate(state, 0)
        val ratingInt = (10 * rating).toInt()
        ratingMap.computeIfAbsent(ratingInt) { ArrayList<ThreatData>() }
        ratingMap[ratingInt]!!.add(threatData.clone())
        SharedInformation.Instance.getLoggerService().log("Rating" + rating, null)
        return rating <= 0.4
    }

    private val ratingMap = mutableMapOf<Int, MutableList<ThreatData>>()
    public fun findThreats(): Map<String, Double> {
        val resultMap = HashMap<String, Double>()
        val threats=ThreatIterable(mePokemon)
        var counter=0
        for( threatData in  threats){
            if(checkThreat(threatData)){
                counter+=1

            }
        }
        SharedInformation.Instance.getLoggerService().log("counter  " + counter, true)
        for (x in ratingMap) {
            SharedInformation.Instance.getLoggerService()
                .log(x.key.toString() + "" + x.value.minWith {a,b->  a.createPokemon(mePokemon.level).statsSum().compareTo(b.createPokemon(mePokemon.level).statsSum()) }, true)
        }
        val weakestThreat=ratingMap[0]!!.minWith {a,b->  a.createPokemon(mePokemon.level).statsSum().compareTo(b.createPokemon(mePokemon.level).statsSum()) }
        val debugExecutor=DebugExecutor(mePokemon,weakestThreat.createPokemon(50),HeuristicBasedAI(),HeuristicBasedAI())
        debugExecutor.execute(10)

        return resultMap
    }
}
