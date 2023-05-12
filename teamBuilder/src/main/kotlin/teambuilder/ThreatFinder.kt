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
import pokeclass.PokedexEntryCategory
import pokeclass.PokedexQuery
import pokeclass.PokedexEntryClassifier

public class ThreatFinder(val mePokemon: Pokemon, val minDamageHPRatio: Double) {
    class ThreatData(
        var otherEntry: PokedexEntry?,
        var otherCatgory:PokedexEntryCategory?,
        var otherNature: Nature?,
        var otherEV: IntArray?,
        var otherEffect: BattleEffect?,
        var otherMoves: Array<Move>?
    ) {
        public override fun toString(): String {
            var statNames =
                otherEV?.mapIndexed({ i, x -> if (x == ThreatFinder.H) i else null })
                    ?.filterNotNull()!!
                    .map({ i -> PokemonStat.getName(i) })
                    .joinToString(",")
            return otherEntry?.toString() +
                    " " +
                    otherNature?.toString() +
                    " " +
                    statNames +
                    " " +
                    otherMoves?.joinToString(",")
        }

        fun createPokemon(level: Int): Pokemon {
            val ivs = intArrayOf(31, 31, 31, 31, 31, 31)

            return Pokemon(
                otherEntry!!.nr,
                level,
                otherEV!!,
                ivs,
                otherNature,
                otherMoves
            )
        }

        fun clone(): ThreatData {
            return ThreatData(otherEntry, otherCatgory,otherNature, otherEV, otherEffect, otherMoves)
        }

        companion object {
            public fun allNull(): ThreatData {
                return ThreatData(null, null, null, null, null,null)
            }
        }
    }

    companion object {
        val H = 252
    }

    public fun <T> sample(maxNumber: Int, prob: Int, seq: Iterable<T>): List<T> {

        var count = 0;
        val result = ArrayList<T>(maxNumber)
        while(result.size<maxNumber){
            for(s in seq){
                if(SharedInformation.Instance.rng.checkPerc(prob,ThreatFinder::class)){
                    result.add(s)
                }
                if(result.size>=maxNumber)break
            }
        }
        return result


    }




    public fun getGoodMoves(threatData: ThreatData): Array<Move> {
        val id = SharedInformation.Instance.pokedexEntryService.getPokemonId(threatData.otherEntry!!.nr)
        var seq = SharedInformation.Instance.learnsetService.getMoves(id).asSequence().map { it ->
            SharedInformation.Instance.moveService.get(
                SharedInformation.Instance.moveService.getRealName(it)
            )
        }.filter{threatData.otherCatgory!!.isGoodMove(it)}.toList()
        if (seq.any()) {
            return sample(4, 30, seq).toTypedArray()
        }
        return arrayOf()
    }
    private fun applyEffect(effect: BattleEffect, pkmn: Pokemon) {
        if (effect is PokemonBattleEffect) {
            val field = PokemonBattleEffect::class.java.getDeclaredField("_pkmn")
            field.isAccessible = true
            field.set(effect, pkmn)
        }
    }

    private fun getMoveKindAttackStat(kind: Move.MoveKind): Int {
        if (kind == Move.MoveKind.Physical) return 1 else return 3
    }

    private fun iteratePokedexEntries(threatData: ThreatData) {
        val query = PokedexQuery()
        var entries = sample(50, 30, query.getSimiliarPokemon(mePokemon, 0.0, 5.0) { it -> it.statsSum().toDouble() }.toList())
        for (entry in entries) {
            threatData.otherEntry = entry
            iterateCategories(threatData)
        }
    }
    private fun iterateCategories(threatData: ThreatData){
        val classifier=PokedexEntryClassifier()
        for(cat in classifier.getPossibleCategories(threatData.otherEntry!!)){
            threatData.otherCatgory=cat
            iterateEvSpread(threatData)
        }
    }

    private fun iterateEvSpread(threatData: ThreatData) {
        for (evs in threatData.otherCatgory!!.getEvDistributions()) {
            threatData.otherEV = evs.evs
            iterateNatures(threatData)
        }
    }

    private fun iterateNatures(threatData: ThreatData) {
        var natures = threatData.otherCatgory!!.getNatures()
        for (nature in natures) {
            threatData.otherNature = nature
            iterateMoves(threatData)
        }
    }

    private fun iterateMoves(threatData: ThreatData) {
        val pokemonId =
            SharedInformation.Instance.pokedexEntryService.getPokemonId(
                threatData.otherEntry!!.nr
            )
        val moves = getGoodMoves(threatData)
        threatData.otherMoves=moves
        if(moves.any()){
            iterateEffects(threatData)

        }

    }

    private var counter = 0
    private fun iterateEffects(threatData: ThreatData) {
        val effects =
            arrayOf(
                StubEffect(),
                ChoiceItemEffect(
                    null,
                   threatData.otherCatgory!!.getBestOffensiveStat(threatData.otherEntry!!),
                    1.5
                ),
            )
        for (effect in effects) {
            threatData.otherEffect = effect
            val danger = checkThreat(threatData)
            if (danger) {
                counter++
                // println(threatData.toString() + " " + danger)
            }
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
        val executor = BattleExecutor(mePokemon, otherPokemon)
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
        var threatData = ThreatData.allNull()
        iteratePokedexEntries(threatData)
        SharedInformation.Instance.getLoggerService().log("counter  " + counter, true)
        for (x in ratingMap) {
            SharedInformation.Instance.getLoggerService()
                .log(x.key.toString() + " " + x.value.minWith {a,b->  a.createPokemon(mePokemon.level).statsSum().compareTo(b.createPokemon(mePokemon.level).statsSum()) }, true)
        }
        return resultMap
    }
}
