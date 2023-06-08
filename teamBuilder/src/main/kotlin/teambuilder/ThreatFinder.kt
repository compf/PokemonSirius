package teambuilder

import compf.core.engine.Tuple
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.effects.BattleEffect
import compf.core.engine.pokemon.effects.PokemonBattleEffect
import compf.core.etc.services.SharedInformation
import compf.core.networking.HeuristicBasedAI
import pokeclass.FullTeamIterator

public class ThreatFinder(val meLeadPokemon:String,val enemyLeadPokemon: String,val resourceName:String,val level:Int, val minDamageHPRatio: Double) {








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
    private fun createTeam(threats: Array<ThreatData>):List<Pokemon>{
        val team= mutableListOf<Pokemon>()
        for(threatData in threats){
            val otherPokemon = threatData.createPokemon(level)

            initEffect(otherPokemon,threatData.otherAbilityEffect!!)
            initEffect(otherPokemon,threatData.otherItemEffect!!)
            team.add(otherPokemon)
       }
        return team
    }
    private fun checkThreat(meTeamThreats: Array<ThreatData>,enemyTeamThreats:Array<ThreatData>): Boolean {

        var meTeam=createTeam(meTeamThreats)
        val enemyTeam=createTeam(enemyTeamThreats)
        val executor = BattleExecutor(meTeam,enemyTeam,HeuristicBasedAI(),HeuristicBasedAI())
        val state = executor.execute(5)
        val rater = BattleStateRater()
        val rating = rater.rate(state, 0)

        val ratingInt = (10 * rating).toInt()
        ratingMap.computeIfAbsent(ratingInt) { ArrayList<Tuple<Array<ThreatData>,Array<ThreatData>>>() }
        ratingMap[ratingInt]!!.add(Tuple(meTeamThreats.clone(),enemyTeamThreats))
        SharedInformation.Instance.getLoggerService().log("Rating" + rating, null)
        return rating >=minDamageHPRatio
    }

    private val ratingMap = mutableMapOf<Int, MutableList<Tuple<Array<ThreatData>,Array<ThreatData>>>>()
    public fun findThreats(): Map<String, Double> {
        val resultMap = HashMap<String, Double>()
        val meTeam=FullTeamIterator(meLeadPokemon,resourceName)
        val enemyTeam=FullTeamIterator(enemyLeadPokemon,resourceName)
        meTeam.resetAll()
        enemyTeam.resetAll()
        var counter=0
        while(meTeam.hasNext() && enemyTeam.hasNext()){
            val meTeamThreat=meTeam.next()
            val enemyTeamThreat=enemyTeam.next()
            if(checkThreat(meTeamThreat,enemyTeamThreat)){
                counter+=1
                for(i in 0 until 6){
                    println(counter.toString()+ " " +meTeamThreat[i].toString())
                }
                println()

            }
        }



        SharedInformation.Instance.getLoggerService().log("counter  " + counter, true)
       /* for (x in ratingMap) {
            SharedInformation.Instance.getLoggerService()
                .log(x.key.toString() + "" + x.value.minWith {a,b->  a.createPokemon(mePokemon.level).statsSum().compareTo(b.createPokemon(mePokemon.level).statsSum()) }, true)
        }*/
        return resultMap
        /*val weakestThreat=ratingMap[0]!!.minWith {a,b->  a.createPokemon(mePokemon.level).statsSum().compareTo(b.createPokemon(mePokemon.level).statsSum()) }
        val debugExecutor=DebugExecutor(mePokemon,weakestThreat.createPokemon(50),HeuristicBasedAI(),HeuristicBasedAI())
        debugExecutor.execute(10)

        return resultMap*/
    }
}
