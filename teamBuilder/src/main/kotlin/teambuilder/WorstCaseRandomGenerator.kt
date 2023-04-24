package teambuilder

import compf.core.etc.services.RandomGeneratorService
public class WorstCaseRandomGenerator :RandomGeneratorService{


    override fun checkPerc(upTo: Int, callerInfo:Any): Boolean { 
        return true
    }

    override fun randomNumber(fromInc: Int, toExc: Int, callerInfo:Any): Int {
        return toExc-1
     }

}