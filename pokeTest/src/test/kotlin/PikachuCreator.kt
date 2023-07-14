

import compf.core.engine.pokemon.EVDistribution
import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.Pokemon
import compf.core.etc.services.SharedInformation

public class PikachuCreator {
    companion object{
        val SplashIndex=150
        val PikachuIndex=25
        val CUT_ID=15;
    }

    public var nr= PikachuIndex
    public var level=100
    public var evDistr=EVDistribution.HP_ATT
    public var nature=Nature.ATT_ATT
    public var moveId= SplashIndex
    public  var ivs= intArrayOf(31,31,31,31,31,31)

        public fun create():Pokemon{
            return Pokemon(nr,level,evDistr.evs,ivs,nature,arrayOf(SharedInformation.Instance.moveService.get(moveId),null,null,null))
        }
        public fun setEV(evDistr:EVDistribution):PikachuCreator{
            this.evDistr=evDistr
            return  this
        }
    public fun setMoveId(moveId:Int):PikachuCreator{
        this.moveId=moveId
        return this
    }
    fun cutMove():PikachuCreator{
        return setMoveId(CUT_ID)
    }
    fun setLevel(level:Int):PikachuCreator{
        this.level=level
        return this
    }



}
