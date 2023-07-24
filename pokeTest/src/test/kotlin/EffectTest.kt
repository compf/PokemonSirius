
import compf.core.engine.pokemon.EVDistribution
import compf.core.engine.pokemon.PokemonStat
import compf.core.engine.pokemon.effects.BattleEffectFactory
import compf.core.engine.pokemon.effects.EffectName
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

        me.addEffect(BattleEffectFactory.createItemEffect(EffectName.BoosterEnergy,me))
        me.addEffect(BattleEffectFactory.createAbilityEffect(EffectName.Protosynthesis,me))
        val sim=createSimulator(me,enemy)
        sim.attack().attack().execute(2)
        assertEquals(324,me.getStat(PokemonStat.SPEED))

    }
    @Test
    fun testFocusSlash(){
        MainTest.newGenerator()
        val me=PikachuCreator().setLevel(1).create()
        val enemy=PikachuCreator().cutMove().create()
        me.addEffect(BattleEffectFactory.createItemEffect(EffectName.FocusSlash,me) )
        val sim=createSimulator(me,enemy)
        sim.attack().attack().execute(2)
        assertEquals(1,me.currHP)
    }
    @Test
    fun testLifeOrb(){
        MainTest.newGenerator()
        val me=PikachuCreator().cutMove().setEV(EVDistribution.ATT_SPEED).create();
        val enemy=PikachuCreator().create()
        me.addEffect(BattleEffectFactory.createItemEffect(EffectName.LifeOrb,me) )
        val sim=createSimulator(me,enemy)
        val res=sim.attack().attack().assertDamage(100).assertNoDamage().execute(2)
        assertEquals((0.9*me.maxHP).toInt(),me.currHP)
    }
}