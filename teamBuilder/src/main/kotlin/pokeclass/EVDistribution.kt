package pokeclass

import teambuilder.ThreatFinder
public const val  H=252
enum class EVDistribution {
    HP_ATT(intArrayOf(H,H, 0, 0, 0, 0)),
    HP_DEF(intArrayOf(H, 0, H, 0, 0, 0)),
    HP_SATT(intArrayOf(H, 0, 0, H, 0, 0)),
    HP_SDEF( intArrayOf(H, 0, 0, 0, H, 0)),
    HP_SPEED(intArrayOf(H, 0, 0, 0, 0, H)),

    ATT_DEF(intArrayOf(0, H, H, 0, 0, 0)),
    ATT_SATT(intArrayOf(0, H, 0, H, 0, 0)),
    ATT_SDEF(intArrayOf(0, H, 0, 0, H, 0)),
    ATT_SPEED( intArrayOf(0, H, 0, 0, 0, H)),


    DEF_SATT(intArrayOf(0, 0, H, H, 0, 0)),
    DEF_SDEF( intArrayOf(0, 0, H, 0, H, 0)),
    DEF_SPEED(intArrayOf(0, 0, H, 0, 0, H)),


    SATT_SDEF(intArrayOf(0, 0, 0, H, H, 0)),
    SATT_SPEED(intArrayOf(0, 0, 0, H, 0, H)),

    SDEF_SPEED(intArrayOf(0, 0, 0, 0, H, H)),
    ;
    constructor(evs:IntArray){
    this.evs=evs
    }

    val evs:IntArray
}