package teambuilder

import compf.core.engine.BattleRoundResult
import compf.core.engine.pokemon.effects.BattleEffectFactory.AbilityEffectFactory
import compf.core.engine.pokemon.effects.BattleEffectFactory.ItemEffectFactory
import compf.core.etc.PokemonConstants
import compf.core.etc.services.SharedInformation
import compf.core.networking.HeuristicBasedAI
import pokeclass.SmogonDataLoader
import util.KotlinRandomService
import util.Roulette
import java.io.FileWriter
import java.util.*


interface MutationGenerator {
    fun mutate(source: PokemonTeam, smogonData: SmogonDataLoader): PokemonTeam;

}

interface CrossoverGenerator {
    fun crossOver(
        mother: PokemonTeam,
        father: PokemonTeam,
        smogonData: SmogonDataLoader
    ): PokemonTeam?;

}

interface StopCondition {
    fun shallStop(source: PokemonTeam?, smogonData: SmogonDataLoader): Boolean;
}

class FixedIterationStopCondition(val iterations: UInt) : StopCondition {
    private var counter: UInt = 0u
    override fun shallStop(source: PokemonTeam?, smogonData: SmogonDataLoader): Boolean {
        counter++
        return counter > iterations
    }

}

interface PopulationFiller {
    fun fillPopulation(smogonData: SmogonDataLoader, population: MutableMap<PokemonTeam, Int>)
}

class PokemonTeam(val team: Array<ThreatData> = arrayOfNulls<Any>(6).map { ThreatData.allNull() }.toTypedArray()) :
    Iterable<ThreatData> {
    operator fun set(index: Int, value: ThreatData) {
        team[index] = value
    }

    operator fun get(index: Int): ThreatData {
        return team[index]!!
    }

    fun contains(value: ThreatData): Boolean {
        return (team.map { it.toString() }.contains(value.toString()))
    }

    fun copyOf(): PokemonTeam {
        return PokemonTeam(team.copyOf())
    }

    override fun hashCode(): Int {
        return team.joinToString(",").hashCode()
    }

    override fun iterator(): Iterator<ThreatData> {
        return team.iterator()
    }

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (this.javaClass != other.javaClass) return false
        val converted = other as PokemonTeam
        return team.zip(converted.team).all { it.first == it.second }
    }
}

class SimplePopulationFiller(val initialNumber: Int, val increaseNumber: Int) : PopulationFiller {
    private var first = true
    override fun fillPopulation(smogonData: SmogonDataLoader, population: MutableMap<PokemonTeam, Int>) {
        val number = if (first) initialNumber else increaseNumber
        first = false
        val abilityEffectFactory = AbilityEffectFactory()
        val itemEffectFactory = ItemEffectFactory()
        for (iteration in 0 until number) {

            val team = PokemonTeam()
            for (teamMemberIndex in 0 until PokemonConstants.DEFAULT_TEAM_SIZE) {
                val name = smogonData.randomPokemonName()
                val teamMember = ThreatData(
                    SharedInformation.Instance.pokedexEntryService.get(name),
                    null,
                    smogonData.randomNature(name),
                    smogonData.randomEv(name),
                    abilityEffectFactory.create(smogonData.randomAbility(name)),
                    itemEffectFactory.create(smogonData.randomItem(name)),
                    smogonData.randomUniqueMoves(name)
                )

                if (team.contains(teamMember)) {
                    continue
                }
                team[teamMemberIndex] = teamMember
            }
            population[team] = 0


        }
    }

}

interface LiveOrDieDecider {
    fun shallDie(team: PokemonTeam, singleTeamRating: Double, competitionRating: Double, age: Int): Boolean;
}

interface OneSolutionEvaluator {
    fun evaluate(team: PokemonTeam, smogonData: SmogonDataLoader): Double
}

interface TwoSolutionsEvaluator {
    fun evaluate(team1: PokemonTeam, team2: PokemonTeam, smogonData: SmogonDataLoader): Pair<Double, Double>
}


class SplitFatherMotherCrossover : CrossoverGenerator {
    override fun crossOver(
        mother: PokemonTeam,
        father: PokemonTeam,
        smogonData: SmogonDataLoader
    ): PokemonTeam {
        return PokemonTeam(arrayOf(mother[0], mother[1], mother[2], father[3], father[4], father[5]))
    }

}

class ShiftTeam : MutationGenerator {
    override fun mutate(source: PokemonTeam, smogonData: SmogonDataLoader): PokemonTeam {
        val result = source.copyOf()
        for (i in 0 until PokemonConstants.DEFAULT_TEAM_SIZE) {
            result[i] = source[(i + 1) % PokemonConstants.DEFAULT_TEAM_SIZE]
        }
        return result
    }

}

class ReplaceMove : MutationGenerator {
    override fun mutate(source: PokemonTeam, smogonData: SmogonDataLoader): PokemonTeam {
        val result = source.copyOf()
        for (pkmn in result) {
            for (mvIndex in 0 until PokemonConstants.MAX_MOVES_COUNT_POKEMON) {
                if (SharedInformation.Instance.rng.checkPerc(50, GeneticThreatFinder::javaClass)) {
                    val move =
                        SharedInformation.Instance.moveService.get(smogonData.randomMoveName(pkmn.otherEntry!!.name))!!
                    if (pkmn.otherMoves!!.contains(move)) continue
                    pkmn.otherMoves!![mvIndex] = move
                }
            }
        }
        return result
    }


}

class ReplaceNature : MutationGenerator {
    override fun mutate(source: PokemonTeam, smogonData: SmogonDataLoader): PokemonTeam {
        val result = source.copyOf()
        for (pkmn in result) {

            if (SharedInformation.Instance.rng.checkPerc(50, GeneticThreatFinder::javaClass)) {
                pkmn.otherNature = smogonData.randomNature(pkmn.otherEntry!!.name)
            }

        }
        return result
    }

}


class ReplaceAbility : MutationGenerator {
    override fun mutate(source: PokemonTeam, smogonData: SmogonDataLoader): PokemonTeam {
        val result = source.copyOf()
        for (pkmn in result) {

            if (SharedInformation.Instance.rng.checkPerc(50, GeneticThreatFinder::javaClass)) {
                pkmn.otherAbilityEffect =
                    AbilityEffectFactory().create(smogonData.randomAbility(pkmn.otherEntry!!.name))
            }

        }
        return result
    }

}

class ReplaceItem : MutationGenerator {
    override fun mutate(source: PokemonTeam, smogonData: SmogonDataLoader): PokemonTeam {
        val result = source.copyOf()
        for (pkmn in result) {

            if (SharedInformation.Instance.rng.checkPerc(50, GeneticThreatFinder::javaClass)) {
                pkmn.otherItemEffect = ItemEffectFactory().create(smogonData.randomItem(pkmn.otherEntry!!.name))
            }

        }
        return result
    }

}

class ReplaceEv : MutationGenerator {
    override fun mutate(source: PokemonTeam, smogonData: SmogonDataLoader): PokemonTeam {
        val result = source.copyOf()
        for (pkmn in result) {

            if (SharedInformation.Instance.rng.checkPerc(50, GeneticThreatFinder::javaClass)) {
                pkmn.otherEV = (smogonData.randomEv(pkmn.otherEntry!!.name))
            }

        }
        return result
    }

}

class PokemonBasedCrossover : CrossoverGenerator {
    override fun crossOver(
        mother: PokemonTeam,
        father: PokemonTeam,
        smogonData: SmogonDataLoader
    ): PokemonTeam {
        val result = mother.copyOf()
        for (i in 0 until PokemonConstants.DEFAULT_TEAM_SIZE) {
            if (SharedInformation.Instance.rng.checkPerc(50, GeneticThreatFinder::javaClass)) {
                result[i] = mother[i]
            } else {
                result[i] = father[i]
            }
        }
        return result
    }

}


class SimpleOneTeamEvaluator : OneSolutionEvaluator {
    override fun evaluate(team: PokemonTeam, smogonData: SmogonDataLoader): Double {
        val poketeamAnalyzer = PokemonTeamAnalyzer(team.map { it.createPokemon(50) }.toTypedArray())

        val offensive = SumAggregator().aggregateAll(poketeamAnalyzer.offensiveTypeCoverage(MeanAggregator()).values)
        val defensive = SumAggregator().aggregateAll(poketeamAnalyzer.offensiveTypeCoverage(MeanAggregator()).values)

        val statSum = 1 - HooverAggregator().aggregateAll(poketeamAnalyzer.statCoverage(SumAggregator()).asIterable())

        return offensive - defensive + statSum
    }

}

class SimpleTwoTeamEvaluator: TwoSolutionsEvaluator {
    override fun evaluate(
        team1: PokemonTeam,
        team2: PokemonTeam,
        smogonData: SmogonDataLoader
    ): Pair<Double, Double> {
        val executor = DebugExecutor(
            team1.map { it.createPokemon(50) },
            team2.map { it.createPokemon(50) },
            HeuristicBasedAI(),
            HeuristicBasedAI()
        )
        val result = executor.execute(numberTimes)
        writeResult(team1,team2,executor.roundResults)

        val stateEvaluator = BattleStateRater()
        val player0 = stateEvaluator.rate(result, 0)
        val player1 = stateEvaluator.rate(result, 1)
        return Pair(player0, player1)


    }
    private val numberTimes:Int
    private val startTime:Long
    constructor( numberTimes: Int){
        this.numberTimes=numberTimes
        startTime=Calendar.getInstance().timeInMillis

    }

    private fun writeResult(team1:PokemonTeam,team2:PokemonTeam,roundResults: MutableList<BattleRoundResult>) {
            FileWriter("battlelog_${startTime}.txt",true).use {
                for(t in team1){
                    it.write(t.toString()+"\n")

                }
                it.write("\n")
                for(t in team2){
                    it.write(t.toString()+"\n")

                }
                it.write("\n")
                var roundCounter=0
                for(round in roundResults){
                    it.write("Round $roundCounter\n")
                    for(action in round.Actions){
                        it.write("\n")
                        for(msg in action.Messages){
                            it.write(msg+"\n")
                        }
                    }
                    roundCounter+=1
                }
            }
    }


}
class SimpleLiveOrDieDecider:LiveOrDieDecider{
    override fun shallDie(team: PokemonTeam, singleTeamRating: Double, competitionRating: Double, age: Int): Boolean {
        return age>30
    }

}
class DetailedCrossover : CrossoverGenerator {
    override fun crossOver(
        mother: PokemonTeam,
        father: PokemonTeam,
        smogonData: SmogonDataLoader
    ): PokemonTeam {
        val SPECIES_ORIGIN_BIAS = 70
        val isMother = SharedInformation.Instance.rng.checkPerc(50, GeneticThreatFinder::javaClass)
        val speciesOrigin =
            if (isMother) mother else father
        val mate = if (isMother) father else mother
        val child = speciesOrigin.copyOf()
        for (i in 0 until PokemonConstants.DEFAULT_TEAM_SIZE) {
            for (mvIndex in 0 until minOf(PokemonConstants.MAX_MOVES_COUNT_POKEMON,speciesOrigin[i].otherMoves!!.size,mate[i].otherMoves!!.size)) {
                val moves = smogonData.getMoveNames(child[i].otherEntry!!.name)
                val hasMotherMove = (moves.contains(mother[i].otherMoves!![mvIndex]!!.name))
                val hasFatherMove = (moves.contains(father[i].otherMoves!![mvIndex]!!.name))

                if (hasFatherMove && hasMotherMove) {
                    child[i].otherMoves!![mvIndex] = if (SharedInformation.Instance.rng.checkPerc(
                            50,
                            GeneticThreatFinder::javaClass
                        )
                    ) mother[i].otherMoves!![mvIndex] else father[i].otherMoves!![mvIndex]
                }
            }
            if (SharedInformation.Instance.rng.checkPerc(SPECIES_ORIGIN_BIAS, GeneticThreatFinder::javaClass)) {
                child[i].otherEV = speciesOrigin[i].otherEV
            } else {
                child[i].otherEV = mate[i].otherEV
            }


            if (SharedInformation.Instance.rng.checkPerc(SPECIES_ORIGIN_BIAS, GeneticThreatFinder::javaClass)) {
                child[i].otherNature = speciesOrigin[i].otherNature
            } else {
                child[i].otherNature = mate[i].otherNature
            }
            if (SharedInformation.Instance.rng.checkPerc(50, GeneticThreatFinder::javaClass)) {
                child[i].otherItemEffect = speciesOrigin[i].otherItemEffect
            } else {
                child[i].otherItemEffect = mate[i].otherItemEffect
            }


        }
        return child
    }

}

class StubMutation:MutationGenerator{
    override fun mutate(source: PokemonTeam, smogonData: SmogonDataLoader): PokemonTeam {
        return source
    }

}
class StubCrossover:CrossoverGenerator{
    override fun crossOver(mother: PokemonTeam, father: PokemonTeam, smogonData: SmogonDataLoader): PokemonTeam? {
        return null
    }

}
class GeneticThreatFinder {
    private val population: MutableMap<PokemonTeam,Int> = mutableMapOf<PokemonTeam,Int>()
    fun execute(): Pair<PokemonTeam,PokemonTeam> {
        val stopCondition = FixedIterationStopCondition(10_000u)
        val smogonData = SmogonDataLoader("gen9ou.json")
        val populationFiller=SimplePopulationFiller(1000,10)
        populationFiller.fillPopulation(smogonData, population )
        val liveOrDieDecider=SimpleLiveOrDieDecider()
        val competiveHeuristic=SimpleTwoTeamEvaluator(20)
        val rnd= KotlinRandomService(GeneticThreatFinder::javaClass)
        val teamHeuristic=SimpleOneTeamEvaluator()
        val mutations=Roulette(mapOf(StubMutation() to 5.0 ,ShiftTeam() to 3.0,
            ReplaceMove() to 1.0,
            ReplaceNature() to 1.0,
            ReplaceEv() to 1.0,
            ReplaceAbility() to 1.0,
            ReplaceItem() to 1.0



            ))
        var bestCompetive:PokemonTeam?=null
        var bestCompetiveScore=0.0

        var bestSingle:PokemonTeam?=null
        var bestSingleScore=0.0

        val crossover= Roulette(mapOf(StubCrossover() to 3.0, SplitFatherMotherCrossover() to 1.0, PokemonBasedCrossover() to 1.0,DetailedCrossover() to 1.0))
        while (!stopCondition.shallStop(null, smogonData)) {

            val backupList=this.population.keys.shuffled(rnd)
            for(pair in backupList.chunked(2)){
                if(pair.size<2){
                    break;
                }
                var mother=pair[0]
                var father=pair[1]

                if(mother !in population || father !in population){
                    continue
                }
                val motherAge=population.getOrDefault(mother,0)
                val fatherAge=population.getOrDefault(father,0)
                population.remove(mother)
                population.remove(father)
                var child=crossover.random(GeneticThreatFinder::javaClass).crossOver(mother,father,smogonData)
                if(child!=null){
                    child=mutations.random(GeneticThreatFinder::javaClass).mutate(child,smogonData)

                    population[child]=0

                }
                mother=mutations.random(GeneticThreatFinder::javaClass).mutate(mother,smogonData)
                father=mutations.random(GeneticThreatFinder::javaClass).mutate(father,smogonData)

                val fatherSingleScore=teamHeuristic.evaluate(father,smogonData)
                val motherSingleScore=teamHeuristic.evaluate(mother,smogonData)
                val competiveScore=competiveHeuristic.evaluate(father,mother,smogonData)

                if(!liveOrDieDecider.shallDie(father,fatherSingleScore,competiveScore.first,fatherAge+1)){
                    population[father]=fatherAge+1
                }
                if(!liveOrDieDecider.shallDie(mother,motherSingleScore,competiveScore.second,motherAge+1)){
                    population[father]=fatherAge+1
                }

                if(fatherSingleScore>bestSingleScore){
                    bestSingle=father
                    bestSingleScore=fatherSingleScore
                }
                if(motherSingleScore>bestSingleScore){
                    bestSingle=mother
                    bestSingleScore=motherSingleScore
                }
                if(competiveScore.first>bestCompetiveScore){
                    bestCompetive=father
                    bestCompetiveScore=competiveScore.first
                }
                if(competiveScore.second>bestCompetiveScore){
                    bestCompetive=mother
                    bestCompetiveScore=competiveScore.second

                }




            }


        }
       return Pair(bestSingle!!,bestCompetive!!)
    }
}