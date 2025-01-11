package main;

import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.PokedexEntry
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.PokemonStat
import compf.core.engine.pokemon.moves.Move
import compf.core.etc.services.SharedInformation
import compf.core.etc.services.move.DefaultMoveService
import compf.core.etc.services.pokemon.DefaultPokedexEntryService
import javafx.application.Application
import javafx.collections.FXCollections
import javafx.geometry.Side
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.stage.Stage
import teambuilder.WorstCaseRandomGenerator

class YourMainClass : Application() {
    fun createPokemonGUI(title:String): Tab {
        val tab = Tab()
        tab.text = title
        val innerTabPane=TabPane()
        val pokemons=FXCollections.observableList( SharedInformation.Instance.pokedexEntryService.map { it })
        val natures= FXCollections.observableList(Nature.values().toList())
        val genders=FXCollections.observableList(Pokemon.Gender.values().toList())
        val moves=FXCollections.observableList( SharedInformation.Instance.moveService.map { it })

        for(i in 0 until 6){
            val pkmnTab=Tab()
            pkmnTab.text=i.toString()
            val stack=VBox()
            val speciesCB=ComboBox<PokedexEntry>()
            speciesCB.items=  pokemons
            stack.children.add(speciesCB)



            val genderCB=ComboBox<Pokemon.Gender>()
            genderCB.items=genders
            stack.children.add(genderCB)

            val pane=TitledPane()
            val moveStack=VBox()
            pane.content=moveStack
            stack.children.add(pane)
            for(j in 0 until 4){
                val moveCB=ComboBox<Move>()
                moveCB.items=moves
                moveStack.children.add(moveCB)
            }
            val naturesCB=ComboBox<Nature>()
            naturesCB.items= natures
            stack.children.add(naturesCB)

            for(stat in PokemonStat.STAT_WITHOUT_ACC_EVA){
                val innerStack=HBox()
                val evTB=TextField()
                evTB.resize(20.0,20.0)
                val ivTB=TextField()
                ivTB.resize(100.0,20.0)
                val label=Label(PokemonStat.getName(stat))
                innerStack.children.addAll(label,evTB,Label("IVs"),ivTB)
                stack.children.add(innerStack)
            }






            pkmnTab.content=stack
            pkmnTab.isClosable=false
            innerTabPane.tabs.add(pkmnTab)

        }

        innerTabPane.side=Side.LEFT
        tab.content = innerTabPane
        return tab

    }

    override fun start(primaryStage: Stage) {
        SharedInformation.Instance.init(DefaultPokedexEntryService("pokedex.json"),
            DefaultMoveService("moves.json"),
            WorstCaseRandomGenerator(),
            null,
            null
            )
        val mainPane = TabPane()

        val tab =  createPokemonGUI("My Team")
        mainPane.tabs.add(tab)

        primaryStage.title = "JavaFX with FXML and Kotlin"
        primaryStage.scene = Scene(mainPane,400.0,500.0)
        primaryStage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(YourMainClass::class.java)
        }
    }
}