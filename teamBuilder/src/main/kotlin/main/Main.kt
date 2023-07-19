package main

import compf.core.etc.services.SharedInformation
import compf.core.etc.services.learnset.DefaultLearnsetService
import compf.core.etc.services.logging.NoLoggerService
import compf.core.etc.services.move.DefaultMoveService
import compf.core.etc.services.pokemon.DefaultPokedexEntryService
import compf.core.etc.services.random.RealRandomGeneratorService
import teambuilder.GeneticThreatFinder


        fun main(args:Array<String>){
            println(System.getProperty("user.dir"))
            SharedInformation.Instance.init(
                DefaultPokedexEntryService("pokedex.json"),
                DefaultMoveService("moves.json"), RealRandomGeneratorService(),
                DefaultLearnsetService("learnsets.json"),
                NoLoggerService()
            )

            val gen= GeneticThreatFinder()
            gen.execute()
        }
