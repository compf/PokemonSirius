package teambuilder

import compf.core.engine.pokemon.PokedexEntry
import compf.core.etc.services.RandomGeneratorService
import compf.core.etc.services.RealRandomGeneratorService
import compf.core.networking.BotInterface
import query.PokedexQuery
public class WorstCaseRandomGenerator :RandomGeneratorService{

    private val  defaultGenerator:RealRandomGeneratorService=RealRandomGeneratorService();
    override fun checkPerc(upTo: Int, callerInfo:Any): Boolean { 
        if(callerInfo==ThreatFinder::class || callerInfo==PokedexEntry::class.java || callerInfo==BotInterface::class.java){
            return this.defaultGenerator.checkPerc(upTo,callerInfo);
        }
        return true
    }

    override fun randomNumber(fromInc: Int, toExc: Int, callerInfo:Any): Int {
        return toExc-1
     }

}