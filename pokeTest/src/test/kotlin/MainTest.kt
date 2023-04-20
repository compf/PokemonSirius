

import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.PokedexEntry
import compf.core.engine.pokemon.effects.BurnedStateCondition
import compf.core.engine.pokemon.effects.ParalyzedStateCondition
import compf.core.engine.pokemon.moves.Move
import compf.core.engine.pokemon.moves.Schedule
import compf.core.engine.SharedInformation
import compf.core.networking.BattleServer
import compf.core.etc.MyObject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.awt.SplashScreen
public class MainTest{
        companion object{
                @BeforeAll
                @JvmStatic
                public fun init(){
                        MyObject.TestSettings.activateTest(createDefaultDeterministicRandomGenerator())
                        SharedInformation.Instance.init()
                }
                public fun createDefaultDeterministicRandomGenerator():DeterministicRandomGenerator{
                        val gen=DeterministicRandomGenerator()
                        gen.addDeterministicValue( Move::class.java, 15)
                        gen.addDeterministicValue(Schedule.ScheduleItemComparator::class.java, 0)
                        return gen
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
        @Test
        public fun assertSimpleBattle(){
                val server=TestableServer()
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, CUT_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, SPLASH_ID)

                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.anyOrder().attack().assertDamage(65, 77).attack().assertDamage(0, 0).execute(2)
        }
        @Test
        public fun assertBattleWithDifferentSpeed(){
                val server=TestableServer()
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,0), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, CUT_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(0,252,6,0,0,252), Nature.N1, 0, 0, SPLASH_ID)

                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.thisOrder().attack().attack().assertDamage(0, 0).assertDamage(65, 77).execute(2)
        }
        @Test
        public fun testBurning(){
                val server=TestableServer()
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,0), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, SPLASH_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(0,252,6,0,0,252), Nature.N1, 0, 0, SPLASH_ID)
                enemyPokemon.addEffect(BurnedStateCondition(enemyPokemon))

                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                val factor=7.0/8.0
                simulator.anyOrder().attack().attack().assert(HPModifiedAssertion(factor)).attack().attack().assertNoDamage().assertNoDamage().assert(HPModifiedAssertion(factor)).execute(5)
        }
        @Test
        public fun assertBattleWithFlying(){
                val server=TestableServer()
                val FLY_ID=19;
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, FLY_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, SPLASH_ID)

                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.thisOrder().attack().attack().attack(1).assertDamage(0, 0).assertDamage(0, 0).anyOrder().assertDamage(0, 0).assertDamage(58, 68).execute(4)
        }
        @Test
        public fun assertBattleWithParalysis(){
                val server=TestableServer()
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, CUT_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.N1, 0, 0, SPLASH_ID)
                val gen=createDefaultDeterministicRandomGenerator()
                gen.addDeterministicValue(ParalyzedStateCondition::class.java, true)
                MyObject.TestSettings.activateTest(gen)

                mePokemon.addEffect(ParalyzedStateCondition(mePokemon))
                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.thisOrder().attack().attack().assertDamage(0, 0).assertDamage(0, 0).execute(2)
        }
    
}