package pokeclass

import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.PokedexEntry
import compf.core.engine.pokemon.PokemonStat
import compf.core.engine.pokemon.moves.Move
import compf.core.engine.pokemon.moves.Move.MoveKind

public interface PokedexEntryCategory {

    fun getNatures():Array<Nature>
    fun getEvDistributions():Array<EVDistribution>
    fun isGoodMove(mv:Move):Boolean;

     fun getBestOffensiveStat(entry: PokedexEntry): Int {
        if(entry.baseStats[PokemonStat.DEF]>entry.baseStats[PokemonStat.SDEF])return PokemonStat.DEF
        else return PokemonStat.SDEF
    }

     fun getBestDefensiveStat(entry: PokedexEntry): Int {
        if(entry.baseStats[PokemonStat.DEF]>entry.baseStats[PokemonStat.SDEF])return PokemonStat.DEF
        else return PokemonStat.SDEF
    }


}
 class PhysicalSweeper:PokedexEntryCategory{
    override fun getNatures(): Array<Nature> {
        return arrayOf(Nature.ATT_SATT,Nature.ATT_SPEED,Nature.ATT_DEF,Nature.ATT_SDEF,Nature.SPEED_SATT)
    }

    override fun getEvDistributions(): Array<EVDistribution> {
       return arrayOf(EVDistribution.ATT_SPEED,EVDistribution.ATT_DEF,EVDistribution.ATT_SDEF,EVDistribution.HP_ATT,EVDistribution.ATT_SATT)
    }

    override fun isGoodMove(mv: Move): Boolean {
        return mv.kind==Move.MoveKind.Physical    }

    override fun getBestOffensiveStat(entry: PokedexEntry): Int {
        return PokemonStat.ATT
    }


}

 class SpecialSweeper:PokedexEntryCategory{
    override fun getNatures(): Array<Nature> {
        return arrayOf(Nature.SATT_ATT,Nature.SATT_SPEED,Nature.ATT_DEF,Nature.SATT_SDEF,Nature.SPEED_ATT)
    }

    override fun getEvDistributions(): Array<EVDistribution> {
        return arrayOf(EVDistribution.SATT_SPEED,EVDistribution.DEF_SATT,EVDistribution.SATT_SDEF,EVDistribution.HP_SATT,EVDistribution.ATT_SATT)
    }

    override fun isGoodMove(mv: Move): Boolean {
        return mv.kind==MoveKind.Special
    }

    override fun getBestOffensiveStat(entry:PokedexEntry): Int {
        return PokemonStat.SATT
    }

}
class MixedSweeper:PokedexEntryCategory{
    override fun getNatures(): Array<Nature> {
        return arrayOf(Nature.SPEED_DEF,Nature.SPEED_SDEF,Nature.DEF_SPEED,Nature.DEF_SDEF,Nature.SDEF_DEF,Nature.SDEF_SPEED)
    }

    override fun getEvDistributions(): Array<EVDistribution> {
       return  arrayOf(EVDistribution.ATT_SATT,EVDistribution.ATT_SPEED,EVDistribution.SATT_SPEED,EVDistribution.HP_ATT,EVDistribution.HP_SATT,EVDistribution.ATT_DEF,EVDistribution.ATT_SDEF,EVDistribution.SATT_SDEF,EVDistribution.DEF_SATT)
    }

    override fun isGoodMove(mv: Move): Boolean {
       return true
    }



}
class PhysicalTank:PokedexEntryCategory{
    override fun getNatures(): Array<Nature> {
        return arrayOf(Nature.DEF_ATT,Nature.DEF_ATT,Nature.DEF_SDEF,Nature.DEF_SPEED,Nature.SPEED_SDEF,Nature.SPEED_ATT,Nature.SPEED_SATT)
    }

    override fun getEvDistributions(): Array<EVDistribution> {
       return  arrayOf(EVDistribution.DEF_SDEF,EVDistribution.HP_DEF,EVDistribution.DEF_SATT,EVDistribution.DEF_SPEED,EVDistribution.ATT_DEF,EVDistribution.HP_SDEF)
    }

    override fun isGoodMove(mv: Move): Boolean {
        return true
    }

}
class SpecialTank:PokedexEntryCategory{
    override fun getNatures(): Array<Nature> {
       return arrayOf(Nature.SDEF_ATT,Nature.SDEF_ATT,Nature.SDEF_DEF,Nature.SDEF_SPEED,Nature.SPEED_DEF,Nature.SPEED_ATT,Nature.SPEED_SATT)
    }

    override fun getEvDistributions(): Array<EVDistribution> {
        return  arrayOf(EVDistribution.DEF_SDEF,EVDistribution.HP_SDEF,EVDistribution.SATT_SDEF,EVDistribution.SDEF_SPEED,EVDistribution.ATT_SDEF,EVDistribution.HP_DEF)

    }

    override fun isGoodMove(mv: Move): Boolean {
        return true
    }

}
class OtherCategory:PokedexEntryCategory{
    override fun getNatures(): Array<Nature> {
        return arrayOf(Nature.DEF_ATT,Nature.DEF_SATT,Nature.SDEF_SATT,Nature.SDEF_ATT,Nature.DEF_SPEED,Nature.SDEF_SPEED)
    }

    override fun getEvDistributions(): Array<EVDistribution> {
        return arrayOf(EVDistribution.DEF_SDEF,EVDistribution.HP_DEF,EVDistribution.HP_SDEF,EVDistribution.HP_SPEED,EVDistribution.DEF_SPEED,EVDistribution.SDEF_SPEED)
    }

    override fun isGoodMove(mv: Move): Boolean {
        return true
    }

}