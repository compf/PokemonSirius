import compf.core.engine.pokemon.PokemonStat
import compf.core.engine.pokemon.effects.offensive.BoosterEnergyffect
import compf.core.engine.pokemon.effects.offensive.ProtosynthesisEffect
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EffectTest  {
    companion object{
        @BeforeAll
        @JvmStatic
        public fun init(){
            initAll()

        }
    }
    @Test
    fun testProtosynthesis(){
        MainTest.newGenerator()
        val me=PikachuCreator().create()
        val enemy=PikachuCreator().create()

        me.addEffect(BoosterEnergyffect(me))
        me.addEffect(ProtosynthesisEffect(me))
        val sim=createSimulator(me,enemy)
        sim.attack().attack().execute(2)
        assertEquals(324,me.getStat(PokemonStat.SPEED))

    }
}