package teambuilder

import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.PokemonTypeHolder
import compf.core.engine.pokemon.Type
import compf.core.engine.pokemon.moves.Move

public class PokemonTeamAnalyzer(val team:Array<Pokemon>) {

    public fun defensiveTypeCoverage(aggregrator: Aggregator): Map<Type, Double> {
        val resultMap = HashMap<Type, Double>()
        for (type in Type.values()) {
            for (pkmn in team) {

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
        for (type in Type.values().filterNot { it==Type.Bird || it==Type.Empty }) {
            for (pkmn in team) {
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
        for(i in 0 until 6){
            for(pkmn in team){
                aggregrator.consume(pkmn.getStat(i).toDouble())
            }
            result[i]=aggregrator.produce()
            aggregrator.reset()
            
        }
        return result
    }
}
