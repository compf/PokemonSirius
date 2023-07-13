package compf.core.engine.pokemon;


import static compf.core.engine.pokemon.Constants.H;
class Constants
{
    public static final int  H=252;

}

public enum  EVDistribution {
    HP_ATT(new int[]{H, H, 0, 0, 0, 0}),
    HP_DEF(new int[]{H, 0, H, 0, 0, 0}),
    HP_SATT(new int[]{H, 0, 0, H, 0, 0}),
    HP_SDEF( new int[]{H, 0, 0, 0, H, 0}),
    HP_SPEED(new int[]{H, 0, 0, 0, 0, H}),

    ATT_DEF(new int[]{0, H, H, 0, 0, 0}),
    ATT_SATT(new int[]{0, H, 0, H, 0, 0}),
    ATT_SDEF(new int[]{0, H, 0, 0, H, 0}),
    ATT_SPEED( new int[]{0, H, 0, 0, 0, H}),


    DEF_SATT(new int[]{0, 0, H, H, 0, 0}),
    DEF_SDEF( new int[]{0, 0, H, 0, H, 0}),
    DEF_SPEED(new int[]{0, 0, H, 0, 0, H}),


    SATT_SDEF(new int[]{0, 0, 0, H, H, 0}),
    SATT_SPEED(new int[]{0, 0, 0, H, 0, H}),

    SDEF_SPEED(new int[]{0, 0, 0, 0, H, H}),
    ;
    EVDistribution(int [] evs){
    this.evs=evs;
    }

    public int[] evs;

}