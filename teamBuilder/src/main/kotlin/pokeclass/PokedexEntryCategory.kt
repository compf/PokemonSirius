package pokeclass

import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.moves.Move

public enum class PokedexEntryCategory(val natures: Array<Nature>, val evDistr: Array<EVDistribution>,val  moveFilter: (mv: Move)->Boolean) {


    PhysicalSweeper(arrayOf(Nature.ATT_SATT,Nature.ATT_SPEED,Nature.ATT_DEF,Nature.ATT_SDEF,Nature.SPEED_SATT),arrayOf(EVDistribution.ATT_SPEED,EVDistribution.ATT_DEF,EVDistribution.ATT_SDEF,EVDistribution.HP_ATT,EVDistribution.ATT_SATT),{it.kind==Move.MoveKind.Physical}),
    SpecialSweeper(arrayOf(Nature.SATT_ATT,Nature.SATT_SPEED,Nature.ATT_DEF,Nature.SATT_SDEF,Nature.SPEED_ATT),arrayOf(EVDistribution.SATT_SPEED,EVDistribution.DEF_SATT,EVDistribution.SATT_SDEF,EVDistribution.HP_SATT,EVDistribution.ATT_SATT),{it.kind==Move.MoveKind.Special}),
    MixedSweeper(arrayOf(Nature.SPEED_DEF,Nature.SPEED_SDEF,Nature.DEF_SPEED,Nature.DEF_SDEF,Nature.SDEF_DEF,Nature.SDEF_SPEED),
        arrayOf(EVDistribution.ATT_SATT,EVDistribution.ATT_SPEED,EVDistribution.SATT_SPEED,EVDistribution.HP_ATT,EVDistribution.HP_SATT,EVDistribution.ATT_DEF,EVDistribution.ATT_SDEF,EVDistribution.SATT_SDEF,EVDistribution.DEF_SATT)
    ,{true}),
    PhysicalTank(arrayOf(Nature.DEF_ATT,Nature.DEF_ATT,Nature.DEF_SDEF,Nature.DEF_SPEED,Nature.SPEED_SDEF,Nature.SPEED_ATT,Nature.SPEED_SATT),
        arrayOf(EVDistribution.DEF_SDEF,EVDistribution.HP_DEF,EVDistribution.DEF_SATT,EVDistribution.DEF_SPEED,EVDistribution.ATT_DEF,EVDistribution.HP_SDEF)
    ,{true}),
    SpecialTank(arrayOf(Nature.SDEF_ATT,Nature.SDEF_ATT,Nature.SDEF_DEF,Nature.SDEF_SPEED,Nature.SPEED_DEF,Nature.SPEED_ATT,Nature.SPEED_SATT),
    arrayOf(EVDistribution.DEF_SDEF,EVDistribution.HP_SDEF,EVDistribution.SATT_SDEF,EVDistribution.SDEF_SPEED,EVDistribution.ATT_SDEF,EVDistribution.HP_DEF)
    ,{true}),
    Other(arrayOf(Nature.DEF_ATT,Nature.DEF_SATT,Nature.SDEF_SATT,Nature.SDEF_ATT,Nature.DEF_SPEED,Nature.SDEF_SPEED),
        arrayOf(EVDistribution.DEF_SDEF,EVDistribution.HP_DEF,EVDistribution.HP_SDEF,EVDistribution.HP_SPEED,EVDistribution.DEF_SPEED,EVDistribution.SDEF_SPEED)
    ,{it.kind==Move.MoveKind.Status})





}