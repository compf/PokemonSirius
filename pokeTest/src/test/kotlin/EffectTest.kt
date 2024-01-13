
import MainTest.Companion.newGenerator
import compf.core.engine.Player
import compf.core.engine.pokemon.EVDistribution
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.PokemonStat
import compf.core.engine.pokemon.effects.BattleEffectFactory
import compf.core.engine.pokemon.effects.EffectName
import compf.core.engine.pokemon.effects.EffectParam
import compf.core.engine.pokemon.effects.PokemonBattleEffect
import compf.core.engine.pokemon.effects.defensive.AssaultVestItem
import compf.core.engine.pokemon.effects.defensive.LeftoverItemEffect
import compf.core.engine.pokemon.effects.offensive.StealthRockEffect
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.Bean
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
    @Bean(name=[EffectName.Protosynthesis,EffectName.BoosterEnergy])
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
    @Bean(name=[EffectName.FocusSlash])
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
    @Bean(name=[EffectName.LifeOrb])
    fun testLifeOrb(){
        MainTest.newGenerator()
        val me=PikachuCreator().cutMove().setEV(EVDistribution.ATT_SPEED).create();
        val enemy=PikachuCreator().create()
        me.addEffect(BattleEffectFactory.createItemEffect(EffectName.LifeOrb,me) )
        val sim=createSimulator(me,enemy)
        val res=sim.attack().attack().assertDamage(100).assertNoDamage().execute(2)
        assertEquals((0.9*me.maxHP).toInt(),me.currHP)
    }
    @Test
    @Bean(name=[EffectName.EjectPack])
    fun testEjectPack(){
        class DelayedStatDecrease(pkmn: Pokemon?) : PokemonBattleEffect(pkmn) {
            override fun roundEnding(param: EffectParam?) {
                modifyStats(param,pokemon,pokemon,1,-1)
                disable()
            }
        }
        var gen= newGenerator()

        val me= Player(0,"Me", arrayOf(PikachuCreator().setEV(EVDistribution.ATT_SPEED).create(),null,null,null,null,null))

        val enemyPokemons= arrayOf(PikachuCreator().create(),PikachuCreator().setLevel(1).create(),null,null,null,null)
        enemyPokemons[0]!!.addEffect(BattleEffectFactory.createItemEffect(EffectName.EjectPack,enemyPokemons[0]))
        enemyPokemons[0]!!.addEffect(DelayedStatDecrease(enemyPokemons[0]))
        val enemy= Player(1,"Enemy",enemyPokemons)
       val sim= createSimulator(me,enemy)

           sim.attack().attack().assertNoDamage().assertNoDamage().execute(2)

        Assertions.assertEquals(1, enemy.getPokemon(0).level)
    }

    @Test
    @Bean(name=[EffectName.StealthRock])
    fun testStealthRock() {
        var gen= newGenerator()
        val STEALTH_ROCK_ID=446

        val me= Player(0,"Me", arrayOf(PikachuCreator().setMoveId(STEALTH_ROCK_ID).setEV(EVDistribution.ATT_SPEED).create(),null,null,null,null,null))

        val enemyPokemons= arrayOf(PikachuCreator().create(),PikachuCreator().setLevel(1).create(),null,null,null,null)
        val enemy= Player(1,"Enemy",enemyPokemons)
        val sim= createSimulator(me,enemy)

        sim.attack().attack().attack().assertNoDamage().assertNoDamage().assert(HPModifiedAssertion(0.8333)).switch(1).execute(3)

        assert(enemy.getPokemon(0).currHP<enemy.getPokemon(0).maxHP)
    }

    @Test
    @Bean(name=[EffectName.AssaultVest])
    fun testAssaultVest() {
        var gen= newGenerator()
        val STEALTH_ROCK_ID=446
        val THUNDERBOLT_ID=85
        val me=PikachuCreator().setMoveId(THUNDERBOLT_ID).setEV(EVDistribution.ATT_SPEED).create()
        val enemy=PikachuCreator().setMoveId( STEALTH_ROCK_ID).create()
        enemy.addEffect(AssaultVestItem(enemy))
        val sim= createSimulator(me,enemy)

        sim.attack().attack().assertDamage(39).assertNoDamage().execute(2)
         assert(!sim.hasEffect(StealthRockEffect::class.java), { "Stealth rock effect may not be activated" })


    }
    @Test
    @Bean(name=[EffectName.Leftovers])
    fun testLeftOvers() {
        var gen= newGenerator()
        val me=PikachuCreator().create()
        val enemy=PikachuCreator().create()
        me.modifyCurrHp(me.currHP-1)
        me.addEffect(LeftoverItemEffect(me))
        val sim= createSimulator(me,enemy)

        sim.attack().assertNoDamage().attack().assertNoDamage().assert(HPModifiedAssertion(1.175)) .execute(3)
        assert(me.currHP>1) { "HP is ${me.currHP}" }


    }
}