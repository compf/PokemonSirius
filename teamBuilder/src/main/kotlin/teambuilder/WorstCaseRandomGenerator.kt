package teambuilder

import compf.core.engine.pokemon.PokedexEntry
import compf.core.etc.services.random.RandomGeneratorService
import compf.core.etc.services.random.RealRandomGeneratorService
import compf.core.networking.BotInterface

public class WorstCaseRandomGenerator : RandomGeneratorService {

    private val  defaultGenerator: RealRandomGeneratorService =
        RealRandomGeneratorService();
    override fun checkPerc(upTo: Int, callerInfo:Any): Boolean { 
        if(callerInfo==ThreatFinder::class || callerInfo==PokedexEntry::class.java ){
            return this.defaultGenerator.checkPerc(upTo,callerInfo);
        }
        return true
    }

    override fun randomNumber(fromInc: Int, toExc: Int, callerInfo:Any): Int {
        if(callerInfo==BotInterface::class.java){
            return this.defaultGenerator.randomNumber(fromInc,toExc,callerInfo);
        }
        return toExc-1
     }

}