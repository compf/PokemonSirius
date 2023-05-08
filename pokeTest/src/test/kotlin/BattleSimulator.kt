import com.badlogic.gdx.utils.Queue
import compf.core.engine.BattleRoundResult
import compf.core.engine.BattleState
import compf.core.engine.Player
import compf.core.engine.PlayerInput
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.BattleRule
import compf.core.engine.BattleAction
import compf.core.engine.NetworkMessage
import compf.core.engine.NetworkMessageKind
import compf.core.engine.Tuple
import compf.core.etc.services.SharedInformation
import compf.core.networking.IOInterface
import compf.core.networking.BattleClient
import compf.core.networking.SharedPipe
import compf.core.networking.BattleServer
import compf.core.networking.Pipe
import compf.core.networking.SimpleIOInterface
import java.util.concurrent.Semaphore
import java.util.concurrent.TimeUnit
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*

public  class SimulationBattleIO : SimpleIOInterface {
    private val MyLogger=LogManager.getLogger()

    val actions: ArrayList<BattleAction> =ArrayList<BattleAction>();
   constructor(player:Player){
    this.player=player;
       //TestFinishedSemaphore.acquireTimeout(1, 10, TimeUnit.SECONDS)
       //BattleStartedSemaphore.acquireTimeout(1, 10, TimeUnit.SECONDS)
   }
   override fun handle(msg: NetworkMessage) :NetworkMessage? {
    return when (msg.Kind) {
         NetworkMessageKind.RequestInput -> {
            return NetworkMessageKind.ReplyInput.createMessage(requestPlayerInput(( msg.Data as Tuple<Short,BattleState>)));

         }
         NetworkMessageKind.SwitchPokemon->{
            return NetworkMessageKind.ReplyInput
            .createMessage(switchPokemon(( msg.Data as Tuple<Short, BattleState> )));
         }
            
         NetworkMessageKind.Update->{
            update( msg.Data as BattleRoundResult);
            return null;
         }
          
         NetworkMessageKind.BattleEnded->{
            battleEnded( msg.Data as Int);
            return null;
         }
        else ->
            return null;

    }
   }
   private val queue: Queue<PlayerInput> = Queue<PlayerInput>()
    fun update(result: BattleRoundResult) {
       
       MyLogger.debug("Received updates "+result.Actions?.size)
       if(result.Actions==null)return;
       for(act in  result.Actions){

           SharedInformation.Instance.getLoggerService().log("added an action " +act.Kind + act.Data,SimulationBattleIO::class)
           actions.add(act)
           SharedInformation.Instance.getLoggerService().log("balance down "+balanceCounter +" " +player!!.playerId,SimulationBattleIO::class)
           balanceCounter--
       }

       if(balanceCounter==0){
          
       }
       battleEnded(0)
   }
   public  fun battleEnded(player:Int){}
   public val player:Player
   public var balanceCounter=0
   public fun addInput(input: PlayerInput) {
       queue.addLast(input)

   }
   public fun addInputDefault() {
       queue.addLast(PlayerInput.AttackInput(0, 0, 1, 0, player!!.playerId))

   }

    fun requestPlayerInput(tuple:Tuple<Short, BattleState>): PlayerInput? {
       MyLogger.debug("requestplayerinput  " + queue.size +" "+player!!.playerId)

       if (queue.isEmpty) {
           MyLogger.debug("empty queue "+player!!.playerId)
           return null
       } else {
           return queue.removeLast()
       }
   }

   

    fun switchPokemon(tuple:Tuple<Short, BattleState> ): Short {
       return 0
   }
}
public class TimeoutSemaphore(permits:Int):Semaphore(permits){
    public fun acquireTimeout(permits:Int,timeout:Long,unit:TimeUnit){
        val result=this.tryAcquire(permits,timeout, unit)
        if(!result){
            throw IllegalStateException("Semaphore expired")
        }
    }
}
public class SimpleBattleSimulator {
   
    companion object{
        private var lastPortNumber=0
        private fun getNextPortNumber():Int{
            return lastPortNumber++;
        }
        private val MyLogger=LogManager.getLogger()
    }
   
    public constructor(server:TestableServer,me:Pokemon,enemy:Pokemon) {      
         this.server=server
         this.meIO=server.meIO
         this.enemyIO=server.enemyIO
        this.meIO.player.team[0]=me
        this.enemyIO.player.team[0]=enemy
    }

    private val  rootAssertion:GroupedAssertion=ThisOrderAssertion()
    private var tempAssertion=rootAssertion;
   
    private var meAttacking=true;
    private var meClient:BattleClient?=null;
    private var enemyClient:BattleClient?=null;
    private val server:BattleServer;
    private val meIO:SimulationBattleIO;
    private val enemyIO:SimulationBattleIO;
    public fun attack(playerId:Int):SimpleBattleSimulator{
        MyLogger.debug("attack " +meAttacking)
        val io= if (playerId==0)  meIO else enemyIO;
        io.addInputDefault()
        MyLogger.debug("attack finnished " +playerId)
        
        return this
    }
    public fun attack():SimpleBattleSimulator{
        attack( if (meAttacking)  0 else 1)
        meAttacking=!meAttacking
        return this
    }
    public fun assert(assertion:Assertion):SimpleBattleSimulator{
        tempAssertion.addAssertion(assertion)
        meIO.balanceCounter++;
        enemyIO.balanceCounter++;
        return this
    }
    public fun assertNoDamage():SimpleBattleSimulator{
        return assertDamage(0, 0)
    }
    public fun assertDamage(min:Int,max:Int):SimpleBattleSimulator{
        assert(DamageAssertion(min,max))
        MyLogger.debug("assert damage "+min)
        return this
    }
    public fun anyOrder():SimpleBattleSimulator{
        rootAssertion.addAssertion(AnyOrderAssertion());
        tempAssertion=rootAssertion.getLast();
        return this;
    }
    public fun thisOrder():SimpleBattleSimulator{
        rootAssertion.addAssertion(ThisOrderAssertion());
        tempAssertion=rootAssertion.getLast();
        return this;
    }
   
    public fun execute(expectedNumberOfActions:Int){
       
       while(meIO.actions.size<expectedNumberOfActions){
        server.run(0)
       }
      
        MyLogger.debug("test finnished");
        val success=rootAssertion.check(meIO.actions)
        if(!success){
            throw Exception("Assertion not successful")
        }
       
        
    }
    
}
