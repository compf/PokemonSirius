package teambuilder

import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.effects.BattleEffect
import compf.core.engine.pokemon.effects.PokemonBattleEffect
import compf.core.etc.services.SharedInformation
import compf.core.networking.HeuristicBasedAI
import pokeclass.SmogonThreatIterable

public class ThreatFinder(val mePokemon: Pokemon, val minDamageHPRatio: Double) {








    private fun applyEffect(effect: BattleEffect, pkmn: Pokemon) {
        if (effect is PokemonBattleEffect) {
            val field = PokemonBattleEffect::class.java.getDeclaredField("_pkmn")
            field.isAccessible = true
            field.set(effect, pkmn)
        }
    }




    private  fun initEffect(pkmn:Pokemon,effect: BattleEffect){
        applyEffect(effect,pkmn)
        if (effect is PokemonBattleEffect) {
            pkmn.addEffect(effect)
        } else {
            effect.init(null)
        }
    }
    private fun checkThreat(threatData: ThreatData): Boolean {
        var otherPokemon = threatData.createPokemon(mePokemon.level)

        initEffect(otherPokemon,threatData.otherAbilityEffect!!)
        initEffect(otherPokemon,threatData.otherItemEffect!!)

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
        val threats=SmogonThreatIterable(mePokemon,"gen9ou.json")
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
