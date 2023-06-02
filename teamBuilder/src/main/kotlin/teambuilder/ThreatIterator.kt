package teambuilder


import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.PokedexEntry
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.PokemonStat
import compf.core.engine.pokemon.effects.BattleEffect
import compf.core.engine.pokemon.effects.ChoiceItemEffect
import compf.core.engine.pokemon.effects.StubEffect
import compf.core.engine.pokemon.moves.Move
import compf.core.etc.PokemonConstants
import compf.core.etc.services.SharedInformation
import pokeclass.EVDistribution
import pokeclass.PokedexEntryCategory
import pokeclass.PokedexEntryClassifier
import pokeclass.PokedexQuery
import util.CountingStyleIterator






const val NUMBER_ITERATORS= 7
class ThreatData(
    var otherEntry: PokedexEntry?,
    var otherCategory: PokedexEntryCategory?,
    var otherNature: Nature?,
    var otherEV: IntArray?,
    var otherAbilityEffect: BattleEffect?,
    var otherItemEffect:BattleEffect?,
    var otherMoves: Array<Move>?
) {
    public override fun toString(): String {
        var statNames =
            otherEV?.mapIndexed { i, x ->
                val H = 252
                if (x == H) i else null
            }
                ?.filterNotNull()!!
                .map({ i -> PokemonStat.getName(i) })
                .joinToString(",")
        return otherEntry?.toString() +
                " " +
                otherNature?.toString() +
                " " +
                statNames +
                " " +
                otherMoves?.joinToString(",")+ otherAbilityEffect.toString() + " "+ otherItemEffect.toString()
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
        return ThreatData(otherEntry, otherCategory,otherNature, otherEV, otherAbilityEffect,otherItemEffect, otherMoves)
    }

    companion object {
        public fun allNull(): ThreatData {
            return ThreatData(null, null, null, null, null,null,null)
        }
    }
}
class ThreatIterator(private val mePokemon: Pokemon): CountingStyleIterator<ThreatData>(NUMBER_ITERATORS){
    private  val threatData=ThreatData.allNull()
     val POKEDEX_ENTRY=0
     val POKEMON_CATEGORY=1
     val EV_SPREAD=2
     val NATURE=3
     val POKEMON_MOVE=4
     val POKEMON_Ability_EFFECT=5
     val POKEMON_ITEM_EFFECT=6
    public fun <T> sample(maxNumber: Int, prob: Int, seq: Iterable<T>): List<T> {

        var count = 0;
        val result = ArrayList<T>(maxNumber)
        while(result.size<maxNumber && seq.any()){
            for(s in seq){
                if(SharedInformation.Instance.rng.checkPerc(prob,ThreatFinder::class)){
                    result.add(s)
                }
                if(result.size>=maxNumber)break
            }
        }
        return result


    }

    override fun assign(index: Int, value: Any) {
        when(index){
            POKEDEX_ENTRY->{
                threatData.otherEntry=value as PokedexEntry
            }
            POKEMON_CATEGORY ->{
                threatData.otherCategory=value as PokedexEntryCategory;
            }
            EV_SPREAD->{
                threatData.otherEV=(value as EVDistribution).evs
            }
            NATURE ->{
                threatData.otherNature=value as Nature
            }
            POKEMON_MOVE->{
                threatData.otherMoves=value as Array<Move>?
            }
            POKEMON_Ability_EFFECT->{

               threatData.otherAbilityEffect=value as BattleEffect
            }
            POKEMON_ITEM_EFFECT->{

                threatData.otherItemEffect=value as BattleEffect
            }
        }
    }
    public fun getGoodMoves(threatData: ThreatData): List<Array<Move>> {
        val NUMBER_MOVESETS=5
        val result= mutableListOf<Array<Move>>()
        for (i in 0 until  NUMBER_MOVESETS){
            var seq = sample( PokemonConstants.MAX_MOVES_COUNT_POKEMON,50, SharedInformation.Instance.learnsetService.getMoveNames(threatData.otherEntry!!.name).asSequence().map { it
            }.map{SharedInformation.Instance.moveService.get(it)}.filter{threatData.otherCategory!!.isGoodMove(it)}.asIterable())
            if (seq.isNotEmpty()) {
               result.add(seq.toTypedArray())
            }
        }

        return result
    }
    override fun reset(index: Int) {
       iterators[index]= when(index){
            POKEDEX_ENTRY->{
                val query = PokedexQuery()
                  sample(50, 30, query.getSimiliarPokemon(mePokemon, 0.0, 5.0) { it -> it.statsSum().toDouble() }.toList()).iterator()
            }
            POKEMON_CATEGORY -> {
                val classifier= PokedexEntryClassifier()
                 classifier.getPossibleCategories(threatData.otherEntry!!).iterator()

            }
            EV_SPREAD->{
                threatData.otherCategory!!.getEvDistributions().iterator()
            }
            NATURE ->{
                threatData.otherCategory!!.getNatures().iterator()
            }
           POKEMON_MOVE->{
               getGoodMoves(threatData).iterator()
           }
           POKEMON_Ability_EFFECT->{

                   arrayOf(
                       StubEffect(),

                   ).iterator()
           }
           POKEMON_ITEM_EFFECT ->{
               arrayOf(
                   StubEffect(),
                   ChoiceItemEffect(
                       null,
                       threatData.otherCategory!!.getBestOffensiveStat(threatData.otherEntry!!),
                       1.5
                   ),
               ).iterator()
           }
           else -> null
        }
    }

    override fun construct(): ThreatData {
       return threatData
    }

}
class ThreatIterable(val mePokemon: Pokemon):Iterable<ThreatData>{
    override fun iterator(): Iterator<ThreatData> {
        var iterator=ThreatIterator(mePokemon)
        iterator.resetAll()
        return iterator
    }

}