

import compf.core.engine.PokemonBattle.PokemonComparator
import compf.core.engine.pokemon.Nature
import compf.core.engine.pokemon.PokedexEntry
import compf.core.engine.pokemon.effects.BurnedStateCondition
import compf.core.engine.pokemon.effects.ParalyzedStateCondition
import compf.core.engine.pokemon.effects.ProtectionEffect
import compf.core.engine.pokemon.moves.Move
import compf.core.engine.pokemon.moves.PokemonEffectMove
import compf.core.engine.pokemon.moves.Schedule
import compf.core.networking.BattleServer
import compf.core.etc.MyObject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.awt.SplashScreen
import compf.core.etc.CallerInformation
import compf.core.etc.services.DefaultPokedexEntryService
import compf.core.etc.services.DefaultMoveService
import compf.core.etc.services.NoLoggerService
import compf.core.etc.services.SharedInformation
import compf.core.etc.services.StubLearnsetService
public class MainTest{
        companion object{
                @BeforeAll
                @JvmStatic
                public fun init(){
                        SharedInformation.Instance.init(DefaultPokedexEntryService("pikachu.json"),
                        DefaultMoveService("kanto_moves.json"),null,StubLearnsetService(),NoLoggerService())

                }
                public fun addDeterministicRandomResults(generator:DeterministicRandomGenerator){
                        generator.addUnchangeableDeterminsticValue( CallerInformation.CriticalHit, false)
                        generator.addUnchangeableDeterminsticValue(Schedule.ScheduleItemComparator::class.java, false)
                        generator.addUnchangeableDeterminsticValue(PokemonComparator::class.java, false)
                        generator.addUnchangeableDeterminsticValue(CallerInformation.MoveStrengthVariation,Move.MAX_MOVE_STRENGTH_VARIATION)
                        generator.addUnchangeableDeterminsticValue(CallerInformation.Accuracy,true)
                }
                public fun newGenerator():DeterministicRandomGenerator{
                        val gen=DeterministicRandomGenerator()
                        addDeterministicRandomResults(gen)
                        SharedInformation.Instance.init(null,null,gen,null,null)
                        return gen
                }
        }
        
        @Test
        public fun testPokemonStats(){

        val pkmn= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, 15)
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
        public fun assertSimpleBattleRandomPriority(){
                val gen= newGenerator()
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, CUT_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, SPLASH_ID)
                val server=TestableServer(mePokemon,enemyPokemon)
                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.attack().attack().assertNoDamage().assertDamage(77).execute(2)
        }
        @Test
        public fun assertBattleWithDifferentSpeed(){
                val gen= newGenerator()

                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,0), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, CUT_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(0,252,6,0,0,252), Nature.ATT_ATT, 0, 0, SPLASH_ID)
                val server=TestableServer(mePokemon,enemyPokemon)

                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.attack().attack().assertNoDamage().assertDamage(77).execute(2)
        }
        @Test
        public fun testBurning(){
                val gen= newGenerator()

                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,0), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, SPLASH_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(0,252,6,0,0,252), Nature.ATT_ATT, 0, 0, SPLASH_ID)
                enemyPokemon.addEffect(BurnedStateCondition(enemyPokemon))
                val server=TestableServer(mePokemon,enemyPokemon)

                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                val factor=7.0/8.0
                simulator.attack().attack().assertNoDamage().assertNoDamage().assert(HPModifiedAssertion(factor)).execute(3)
        }
        @Test
        public fun assertBattleWithFlying(){
                val gen= newGenerator()

                val FLY_ID=19;
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, FLY_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,0), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, CUT_ID)
                val server=TestableServer(mePokemon,enemyPokemon)

                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.attack().attack().attack().attack().assertNoDamage().assertNoDamage().assertDamage( 68).assertDamage(77).execute(4)
        }
        @Test
        public fun assertBattleWithParalysis(){
                val gen= newGenerator()

                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, CUT_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, SPLASH_ID)
                gen.addDeterministicValue(ParalyzedStateCondition::class.java, true)
                mePokemon.addEffect(ParalyzedStateCondition(mePokemon))
                val server=TestableServer(mePokemon,enemyPokemon)
                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                simulator.attack().attack().assertNoDamage().assertNoDamage().execute(2)
                        

               
        }

        @Test
        public fun  assertBattleWithProtect(){
                val  PROTECT_ID=182;
                val mePokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,31), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, PROTECT_ID)
                val enemyPokemon= PokemonCreator.createPokemon(25, 100, intArrayOf(31,31,31,31,31,0), intArrayOf(252,252,6,0,0,0), Nature.ATT_ATT, 0, 0, CUT_ID)
                val gen= newGenerator()
                gen.addUnchangeableDeterminsticValue(ProtectionEffect::class.java,50)
                gen.addUnchangeableDeterminsticValue(PokemonEffectMove::class.java,true)
                val server=TestableServer(mePokemon,enemyPokemon)
                val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
                val numberTurns=4
                for(i in 1..numberTurns){
                        simulator.attack().attack().assertNoDamage().assertDamage(if (i==numberTurns) 77 else 0)
                }
              simulator.execute(2*numberTurns)
        }
    
}