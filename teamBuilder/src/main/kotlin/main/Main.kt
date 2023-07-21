package main

import compf.core.etc.services.SharedInformation
import compf.core.etc.services.learnset.DefaultLearnsetService
import compf.core.etc.services.logging.NoLoggerService
import compf.core.etc.services.move.DefaultMoveService
import compf.core.etc.services.pokemon.DefaultPokedexEntryService
import compf.core.etc.services.random.RealRandomGeneratorService
import teambuilder.GeneticThreatFinder

fun isValidSeed(args:Array<String>):Boolean{
    return args.isNotEmpty() && args[0].isNotBlank() && args[0].toLongOrNull() !=null

}
fun main(args:Array<String>){

            val rnd=if(isValidSeed(args))RealRandomGeneratorService(args[0].toLong())else RealRandomGeneratorService()

            println(System.getProperty("user.dir"))
            SharedInformation.Instance.init(
                DefaultPokedexEntryService("pokedex.json"),
                DefaultMoveService("moves.json"),
                rnd,
                DefaultLearnsetService("learnsets.json"),
                NoLoggerService()
            )

            val gen= GeneticThreatFinder()
            val result=gen.execute()
            println("Single")
            for(pkmn in result.first){
                println(pkmn)
            }
            println("Competitive")
             for(pkmn in result.second){
                println(pkmn)
            }
        }
