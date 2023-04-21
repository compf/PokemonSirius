package teambuilder

import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.PokemonTypeHolder
import compf.core.engine.pokemon.Type
import compf.core.engine.pokemon.moves.Move

public class PokemonTeam() {
    private val team: Array<Pokemon?> = arrayOfNulls(6)
    public fun addPokemon(pkmn: Pokemon) {
        val i = team.indexOf(null)
        team[i] = pkmn
    }
    public fun defensiveTypeCoverage(aggregrator: Aggregator): Map<Type, Double> {
        val resultMap = HashMap<Type, Double>()
        for (type in Type.values()) {
            for (pkmn in team.filterNotNull()) {

                val effectiveness = Move.getEffectiveness(pkmn, type)
                aggregrator.consume(effectiveness)
               
            }
            resultMap[type]= aggregrator.produce()
            aggregrator.reset()
        }
        return resultMap
    }
    private class SingleTypePokemon(val typ: Type) : PokemonTypeHolder {

        override fun getType1(): Type {
            return typ
        }

        override fun getType2(): Type {
            return Type.Empty
        }
    }
    public fun offensiveTypeCoverage(aggregrator: Aggregator): Map<Type, Double> {
        val resultMap = HashMap<Type, Double>()
        for (type in Type.values()) {
            for (pkmn in team.filterNotNull()) {
                for (mv in pkmn.moves.filterNotNull()) {

                    val effectiveness = Move.getEffectiveness(SingleTypePokemon(type), mv.type)
                    aggregrator.consume(effectiveness)
                    
                }
               
            }
            resultMap[type] =aggregrator.produce()
            aggregrator.reset()
        }
        return resultMap
    }
    public fun statCoverage(aggregrator:Aggregator):DoubleArray{
        val result=DoubleArray(6)
        for(i in 0..6){
            for(pkmn in team.filterNotNull()){
                aggregrator.consume(pkmn.getStat(i).toDouble())
            }
            result[i]=aggregrator.produce()
            aggregrator.reset()
            
        }
        return result
    }
}
