package main;

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class YourMainClass : Application() {
    override fun start(primaryStage: Stage) {
        val root: Parent = FXMLLoader.load(javaClass.getResource("/Main.fxml"))
        val scene = Scene(root)

        primaryStage.title = "JavaFX with FXML and Kotlin"
        primaryStage.scene = scene
        primaryStage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(YourMainClass::class.java)
        }
    }
}