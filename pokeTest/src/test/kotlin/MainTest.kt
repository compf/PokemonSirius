

import kotlin.test.*;
import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.PokedexEntry
import compf.core.engine.SharedInformation
import compf.core.networking.BattleServer
import org.junit.jupiter.api.BeforeAll
public class MainTest{
        companion object{
                @BeforeAll
                @JvmStatic
                public fun init(){
                        SharedInformation.Instance.init()
                }
        }
        
        @Test
        public fun testPokemonStats(){

        val pkmn= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, 15)
        assertEquals(274, pkmn.getStat(0))
        assertEquals(209, pkmn.getStat(1));
        assertEquals(117, pkmn.getStat(2));
        assertEquals(136, pkmn.getStat(3));
        assertEquals(136, pkmn.getStat(4));
        assertEquals(216, pkmn.getStat(5));
        }
        val CUT_ID=15;
        val SPLASH_ID=150;
        //@Test
        public fun assertSimpleBattle(){
                val server=BattleServer()
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, CUT_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, SPLASH_ID)

                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.init().anyOrder().attack().assertDamage(65, 77).attack().assertDamage(0, 0).execute()
        }
        //@Test
        public fun assertBattleWithDifferentSpeed(){
                val server=BattleServer()
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,0), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, CUT_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(0,252,6,0,0,252), Nature.N1, 0, 0, SPLASH_ID)

                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.init().thisOrder().attack().attack().assertDamage(0, 0).assertDamage(65, 77).execute()
        }
        @Test
        public fun assertBattleWithFlying(){
                val server=BattleServer()
                val FLY_ID=19;
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, FLY_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, 150)

                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.init().thisOrder().attack().attack().attack(1).assertDamage(0, 0).assertDamage(0, 0).anyOrder().assertDamage(0, 0).assertDamage(58, 68).execute()
        }
    
}