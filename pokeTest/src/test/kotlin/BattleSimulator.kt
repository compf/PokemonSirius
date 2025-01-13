
import compf.core.engine.*
import compf.core.engine.PlayerInput.SwitchPokemonInput
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.pokemon.effects.BattleEffect
import compf.core.etc.services.SharedInformation
import compf.core.networking.BattleClient
import compf.core.networking.SimpleIOInterface
import org.apache.logging.log4j.LogManager
import java.util.concurrent.Semaphore
import java.util.concurrent.TimeUnit

public class SimulationBattleIO : SimpleIOInterface {
    private val MyLogger = LogManager.getLogger()
    private val battle: PokemonBattle
    val actions: ArrayList<BattleAction> = ArrayList<BattleAction>();

    constructor(player: Player, battle: PokemonBattle) {
        this.player = player;
        this.battle = battle
        //TestFinishedSemaphore.acquireTimeout(1, 10, TimeUnit.SECONDS)
        //BattleStartedSemaphore.acquireTimeout(1, 10, TimeUnit.SECONDS)
    }

    override fun message(msg: String?) {

    }




    private val queue: ArrayDeque<PlayerInput> = ArrayDeque<PlayerInput>()
    override  fun update(result: BattleRoundResult) {

        MyLogger.debug("Received updates " + result.Actions?.size)
        if (result.Actions == null) return;
        for (act in result.Actions) {

            SharedInformation.Instance.getLoggerService()
                .log("added an action " + act.Kind + act.Data, SimulationBattleIO::class)
            actions.add(act)
            SharedInformation.Instance.getLoggerService()
                .log("balance down " + balanceCounter + " " + player!!.playerId, SimulationBattleIO::class)
            balanceCounter--
        }


        battleEnded(0)
    }

    override fun battleEnded(player: Int) {}
    public val player: Player
    public var balanceCounter = 0
    public fun addInput(input: PlayerInput) {
        queue.addLast(input)

    }

    public fun addInputDefault(sourcePlayerId: Short) {
        for(pkmn in battle.iterator(battle.getPlayerById(sourcePlayerId),0,player.getPokemon(0).moves[0].target)){
            queue.addLast(PlayerInput.AttackInput(0, 0, pkmn.player.playerId, 0, player!!.playerId))
        }



    }

    override fun requestPlayerInput(tuple: Tuple<Short, BattleState>): PlayerInput? {
        MyLogger.debug("requestplayerinput  " + queue.size + " " + player!!.playerId)

        if (queue.isEmpty()) {
            MyLogger.debug("empty queue " + player!!.playerId)
            return null
        } else {
            return queue.removeFirst()
        }
    }


    override fun switchPokemon(tuple: Tuple<Short, BattleState>): Short {
        return 0
    }
}

public class TimeoutSemaphore(permits: Int) : Semaphore(permits) {
    public fun acquireTimeout(permits: Int, timeout: Long, unit: TimeUnit) {
        val result = this.tryAcquire(permits, timeout, unit)
        if (!result) {
            throw IllegalStateException("Semaphore expired")
        }
    }
}

public class SimpleBattleSimulator {

    companion object {
        private var lastPortNumber = 0
        private fun getNextPortNumber(): Int {
            return lastPortNumber++;
        }

        private val MyLogger = LogManager.getLogger()
    }
    fun hasEffect(effect: Class<out BattleEffect>):Boolean{
        return server.hasEffect(effect)
    }
    constructor(server: TestableServer) {
        this.server = server
        this.meIO = server.meIO
        this.enemyIO = server.enemyIO
    }

    public constructor(server: TestableServer, me: Pokemon, enemy: Pokemon) : this(server) {

        this.meIO.player.team[0] = me
        this.enemyIO.player.team[0] = enemy
    }

    private val rootAssertion: GroupedAssertion = ThisOrderAssertion()
    private var tempAssertion = rootAssertion;

    private var meAttacking = true;
    private var meClient: BattleClient? = null;
    private var enemyClient: BattleClient? = null;
    private val server: TestableServer;
    private val meIO: SimulationBattleIO;
    private val enemyIO: SimulationBattleIO;
    public fun attack(playerId: Int): SimpleBattleSimulator {
        MyLogger.debug("attack " + meAttacking)
        val io = if (playerId == 0) meIO else enemyIO;
        val targetPlayerId: Short = if (playerId == 0) 1 else 0;
        io.addInputDefault(targetPlayerId)
        MyLogger.debug("attack finnished " + playerId)

        return this
    }

    public fun attack(): SimpleBattleSimulator {
        attack(if (meAttacking) 0 else 1)
        meAttacking = !meAttacking
        return this
    }
    fun switch(to:Int):SimpleBattleSimulator{
        if(meAttacking){
           meIO.addInput(SwitchPokemonInput(0,0,1))
        }else {
            enemyIO.addInput(SwitchPokemonInput(1,0,1))
        }
        meAttacking = !meAttacking
        return this


    }

    public fun assert(assertion: Assertion): SimpleBattleSimulator {
        tempAssertion.addAssertion(assertion)
        meIO.balanceCounter++;
        enemyIO.balanceCounter++;
        return this
    }

    public fun assertNoDamage(): SimpleBattleSimulator {
        return assertDamage(0)
    }

    public fun assertDamage(exact: Int): SimpleBattleSimulator {
        assert(DamageAssertion(exact))
        MyLogger.debug("assert damage " + exact)
        return this
    }


    public fun execute(expectedNumberOfActions: Int) {
        val MAX_ITERATIONS=10
        var counter=0


        while (counter<=expectedNumberOfActions ||  counter<MAX_ITERATIONS && !rootAssertion.check(meIO.actions)) {
            server.run(0)
            counter++;
        }

        MyLogger.debug("test finnished");
        val success = rootAssertion.check(meIO.actions)
        if (!success) {
            throw Exception("Assertion not successful")
        }


    }

}
