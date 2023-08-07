

import compf.core.engine.Player
import compf.core.engine.PokemonBattle.PokemonComparator
import compf.core.engine.pokemon.EVDistribution
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.effects.RandomSwapPokemonEffect
import compf.core.engine.pokemon.effects.moveSpecific.ProtectionEffect
import compf.core.engine.pokemon.effects.stateConditions.BurningStateCondition
import compf.core.engine.pokemon.effects.stateConditions.ParalyzedStateCondition
import compf.core.engine.pokemon.moves.Move
import compf.core.engine.pokemon.moves.PokemonEffectMove
import compf.core.engine.pokemon.moves.Schedule
import compf.core.etc.CallerInformation
import compf.core.etc.services.SharedInformation
import compf.core.etc.services.learnset.StubLearnsetService
import compf.core.etc.services.logging.NoLoggerService
import compf.core.etc.services.move.DefaultMoveService
import compf.core.etc.services.pokemon.DefaultPokedexEntryService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
public class TestInstance(public val simulator: SimpleBattleSimulator,public val server: TestableServer,public val mePokemon:Pokemon,public val enemyPokemon: Pokemon){

}
public fun createInstance(mePokemon: Pokemon,enemyPokemon:Pokemon):TestInstance{
        val server=TestableServer(mePokemon,enemyPokemon)
        val simulator=SimpleBattleSimulator(server,mePokemon,enemyPokemon)
        return TestInstance(simulator,server,mePokemon,enemyPokemon)
}
public fun createInstance(mePlayer: Player,enemPlayer:Player):TestInstance{
        val server=TestableServer(mePlayer,enemPlayer)
        val simulator=SimpleBattleSimulator(server)
        return TestInstance(simulator,server,mePlayer.getPokemon(0),enemPlayer.getPokemon(0))
}
public fun createSimulator(mePokemon: Pokemon,enemyPokemon:Pokemon):SimpleBattleSimulator{
        return createInstance(mePokemon, enemyPokemon).simulator
}
public fun createSimulator(mePlayer: Player,enemPlayer:Player):SimpleBattleSimulator{
        return createInstance(mePlayer, enemPlayer).simulator
}
fun initAll(){
        SharedInformation.Instance.init(
                DefaultPokedexEntryService("pikachu.json"),
                DefaultMoveService("moves.json"),null,
                StubLearnsetService(),
                NoLoggerService()
        )
}
public open class MainTest{
        companion object{
                @BeforeAll
                @JvmStatic
                public fun init(){
                       initAll()

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

        val pkmn= PikachuCreator().create()
        assertEquals(274, pkmn.getStat(0))
        assertEquals(209, pkmn.getStat(1));
        assertEquals(116, pkmn.getStat(2));
        assertEquals(136, pkmn.getStat(3));
        assertEquals(136, pkmn.getStat(4));
        assertEquals(216, pkmn.getStat(5));
        }
        val CUT_ID=15;
        val SPLASH_ID=150;
        @Test
        public fun assertSimpleBattleRandomPriority(){
                newGenerator()
                val mePokemon= PikachuCreator().cutMove().create()
                val enemyPokemon= PikachuCreator().create()
                createSimulator(mePokemon, enemyPokemon).attack().attack().assertNoDamage().assertDamage(77).execute(2)
        }
        @Test
        public fun assertBattleWithDifferentSpeed(){
               newGenerator()
                val mePokemon= PikachuCreator().cutMove().create()
                val enemyPokemon= PikachuCreator().setEV(EVDistribution.ATT_SPEED).create()

                 val simulator=createSimulator(mePokemon, enemyPokemon)
                simulator.attack().attack().assertNoDamage().assertDamage(77).execute(2)
        }
        @Test
        public fun testBurning(){
                newGenerator()

                val mePokemon= PikachuCreator().create()
                val enemyPokemon= PikachuCreator().create()
                enemyPokemon.addEffect(
                        BurningStateCondition(
                                enemyPokemon
                        )
                )
                val simulator=createSimulator(mePokemon,enemyPokemon)
                val factor=7.0/8.0
                simulator.attack().attack().assertNoDamage().assertNoDamage().assert(HPModifiedAssertion(factor)).execute(3)
        }
        @Test
        public fun assertBattleWithFlying(){
                newGenerator()

                val FLY_ID=19;
                val mePokemon= PikachuCreator().setEV(EVDistribution.ATT_SPEED).setMoveId(FLY_ID).create()
                val enemyPokemon= PikachuCreator().cutMove().create()

                val simulator=createSimulator(mePokemon,enemyPokemon)
                simulator.attack().attack().attack().attack().assertNoDamage().assertNoDamage().assertDamage( 69).assertDamage(77).execute(4)
        }
        @Test
        public fun assertBattleWithParalysis(){
                val gen= newGenerator()

                val mePokemon= PikachuCreator().cutMove().create()
                val enemyPokemon= PikachuCreator().create()
                gen.addDeterministicValue(ParalyzedStateCondition::class.java, true)
                mePokemon.addEffect(
                        ParalyzedStateCondition(
                                mePokemon
                        )
                )

                val simulator=createSimulator(mePokemon, enemyPokemon)
                simulator.attack().attack().assertNoDamage().assertNoDamage().execute(2)
                        

               
        }

        @Test
        public fun  assertBattleWithProtect(){
                val  PROTECT_ID=182;
                val mePokemon= PikachuCreator().setMoveId(PROTECT_ID).setEV(EVDistribution.ATT_SPEED).create()
                val enemyPokemon= PikachuCreator().cutMove().create()
                val gen= newGenerator()
                gen.addUnchangeableDeterminsticValue(ProtectionEffect::class.java,50)
                gen.addUnchangeableDeterminsticValue(PokemonEffectMove::class.java,true)

                val simulator=createSimulator(mePokemon, enemyPokemon)
                val numberTurns=5
                for(i in 1..numberTurns){
                        simulator.attack().attack().assertNoDamage().assertDamage(if (i==numberTurns) 77 else 0)
                }
              simulator.execute(2*numberTurns)
        }

        @Test
        fun testForcedSwitching(){
               var gen= newGenerator()
                gen.addUnchangeableDeterminsticValue(PokemonEffectMove::class.java,true)
                gen.addUnchangeableDeterminsticValue(RandomSwapPokemonEffect::class.java,1)
                 val WHIRLWIND_ID=18
                val me=Player(0,"Me", arrayOf(PikachuCreator().setMoveId(WHIRLWIND_ID).setEV(EVDistribution.ATT_SPEED).create(),null,null,null,null,null))

                val enemyPokemons= arrayOf(PikachuCreator().create(),PikachuCreator().setLevel(1).create(),null,null,null,null)
                val enemy=Player(1,"Enemy",enemyPokemons)
                createSimulator(me,enemy).attack().attack().assertNoDamage().assertNoDamage().execute(2)
                assertEquals(1,enemy.getPokemon(0).level)
        }
    
}