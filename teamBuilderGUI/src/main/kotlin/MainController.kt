package main

import compf.core.engine.BattleRule
import compf.core.engine.Player
import compf.core.engine.PokemonBattle
import compf.core.engine.PokemonBattleCreator
import compf.core.etc.services.SharedInformation
import compf.core.etc.services.learnset.StubLearnsetService
import compf.core.etc.services.logging.NoLoggerService
import compf.core.etc.services.move.DefaultMoveService
import compf.core.etc.services.pokemon.DefaultPokedexEntryService
import compf.core.etc.services.random.RandomGeneratorService
import compf.core.etc.services.random.RealRandomGeneratorService
import compf.core.networking.ConsolePrompt
import compf.core.networking.SimpleIOInterface
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import java.util.concurrent.atomic.AtomicLong


data class Greeting(val id: Long, val content: String)

@RestController("test")
class GreetingController {
    private val counter = AtomicLong()

    @GetMapping("/dex")
    fun showPokedexEntry(model: Model, @RequestParam(value = "nr", defaultValue ="28") nr: Int?): ModelAndView {
        val entry = SharedInformation.Instance.pokedexEntryService.get(nr!!)
        val modelAndView = ModelAndView()
        modelAndView.viewName = "pokemonBattle"
        modelAndView.addObject("entry", entry)
        return modelAndView
    }

    companion object {
        private const val template = "Hello, %s!"
    }
}


@SpringBootApplication
class DemoApplication





fun main(args: Array<String>) {
    val controller=HttpBattleController()
    SharedInformation.Instance.init(
        DefaultPokedexEntryService("pokedex.json"),
        DefaultMoveService("moves.json"),
        RealRandomGeneratorService(),
        StubLearnsetService(),
        NoLoggerService(),

    )
    val botPlayer = Player(1.toShort(), "Bot", PokemonBattle.createRandomTeam())
    val clientPlayer = Player(0.toShort(), "Player", PokemonBattle.createRandomTeam())

    PokemonBattleCreator.startPrototyp(
        clientPlayer,
        botPlayer,
        controller)

    runApplication<DemoApplication>(*args)
}

