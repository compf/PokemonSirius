package teambuilder

import compf.core.etc.RandomGenerator
public class WorstCaseRandomGenerator :RandomGenerator{


    override fun checkPerc(upTo: Int, callerInfo:Any): Boolean { 
        return true
    }

    override fun randomNumber(fromInc: Int, toExc: Int, callerInfo:Any): Int {
        return toExc-1
     }

}