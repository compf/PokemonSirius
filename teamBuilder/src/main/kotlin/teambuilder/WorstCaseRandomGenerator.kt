package teambuilder

import compf.core.etc.services.RandomGeneratorService
import compf.core.etc.services.RealRandomGeneratorService
import query.PokedexQuery
public class WorstCaseRandomGenerator :RandomGeneratorService{

    private val  defaultGenerator:RealRandomGeneratorService=RealRandomGeneratorService();
    override fun checkPerc(upTo: Int, callerInfo:Any): Boolean { 
        if(callerInfo==PokedexQuery::class.java){
            return this.defaultGenerator.checkPerc(upTo,callerInfo);
        }
        return true
    }

    override fun randomNumber(fromInc: Int, toExc: Int, callerInfo:Any): Int {
        return toExc-1
     }

}