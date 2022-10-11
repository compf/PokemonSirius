import com.badlogic.gdx.utils.Queue
import compf.core.engine.BattleRoundResult
import compf.core.engine.BattleState
import compf.core.engine.Player
import compf.core.engine.PlayerInput
import compf.core.engine.pokemon.Pokemon
import compf.core.engine.BattleRule
import compf.core.engine.BattleAction
import compf.core.networking.IOInterface
import compf.core.networking.BattleClient
import compf.core.networking.SharedPipe
import compf.core.networking.BattleServer
import compf.core.networking.Pipe
import java.util.concurrent.Semaphore
import java.util.concurrent.TimeUnit
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
    }
    private val myPokemon:Pokemon;
    private val enemyPokemon:Pokemon;
    private var mePlayer:Player?=null;
    private var enemyPlayer:Player?=null;
    public constructor(server:BattleServer,me:Pokemon,enemy:Pokemon) {
    

         mePort=SimpleBattleSimulator.getNextPortNumber()
         enemyPort=SimpleBattleSimulator.getNextPortNumber()
        myPokemon=me;
        enemyPokemon=enemy;
         mePipe=SharedPipe.getOrCreatePipe(mePort)
         meIO=SimulationBattleIO()
        

         enemyPipe=SharedPipe.getOrCreatePipe(enemyPort)
         enemyIO=SimulationBattleIO()
      
         this.server=server
    }
    public inner class SimulationBattleIO : IOInterface {
         val actions:ArrayList<BattleAction> =ArrayList<BattleAction>();

        public val TestFinishedSemaphore: TimeoutSemaphore = TimeoutSemaphore(0)
        public val InputProvidedSemaphore:TimeoutSemaphore=TimeoutSemaphore(0)
        public val AllInitializedSemaphore:TimeoutSemaphore=TimeoutSemaphore(0)

        constructor(){
            //TestFinishedSemaphore.acquireTimeout(1, 10, TimeUnit.SECONDS)
            //BattleStartedSemaphore.acquireTimeout(1, 10, TimeUnit.SECONDS)
        }
        override fun message(p0: String) {}
        private val queue: Queue<PlayerInput> = Queue<PlayerInput>()
        override fun update(result: BattleRoundResult) {
            
            println("add actions !!!!!!!!!!!!!! "+result.Actions.size)
            if(result.Actions==null)return;
            for(act in  result.Actions){
                if(act.Kind!= BattleAction.ActionKind.Move)continue

                println("newaction " +act.Kind + act.Data)
                actions.add(act)
                println("balance down "+balanceCounter +" " +player!!.playerId)
                balanceCounter--
            }
    
            if(balanceCounter==0){
                TestFinishedSemaphore.release()
            }
            endBattle()
        }
        public override fun endBattle(){}
        public var player:Player?=null
        public var balanceCounter=0
        public fun addInput(input: PlayerInput) {
            AllInitializedSemaphore.acquireTimeout(1,10, TimeUnit.SECONDS)
            AllInitializedSemaphore.release()
            queue.addLast(input)
  
        }
        public fun addInputDefault() {
            AllInitializedSemaphore.acquireTimeout(1,10, TimeUnit.SECONDS)
            AllInitializedSemaphore.release()
            queue.addLast(PlayerInput.AttackInput(0, 0, 1, 0, player!!.playerId))

        }

        override fun requestPlayerInput(pkmn: Short, state: BattleState): PlayerInput? {
            InputProvidedSemaphore.acquireTimeout(1,10, TimeUnit.SECONDS)
            InputProvidedSemaphore.release();
            println("requestplayerinput  " + queue.size +" "+player!!.playerId)

            if (queue.isEmpty) {
                println("empty queue "+player!!.playerId)
               
                

                return null
            } else {
                return queue.removeLast()
            }
        }

        

        override fun switchPokemon(p0: BattleState, p1: Short): Short {
            return 0
        }
    }
    private val  rootAssertion:GroupedAssertion=ThisOrderAssertion()
    private var tempAssertion=rootAssertion;
    private val meIO:SimulationBattleIO;
    private val enemyIO:SimulationBattleIO;
    private var meAttacking=true;
    private var meClient:BattleClient?=null;
    private var enemyClient:BattleClient?=null;
    private val mePipe:Pipe;
    private val enemyPipe:Pipe;
    private val mePort:Int;
    private val enemyPort:Int
    private val server:BattleServer;

    public fun attack(playerId:Int):SimpleBattleSimulator{
        println("attack " +meAttacking)
        val io= if (playerId==0)  meIO else enemyIO;
        io.addInputDefault()
        println("attack finnished " +playerId)
        
        return this
    }
    public fun attack():SimpleBattleSimulator{
        attack( if (meAttacking)  0 else 1)
        meAttacking=!meAttacking
        return this
    }
    public fun assertDamage(min:Int,max:Int):SimpleBattleSimulator{
        tempAssertion.addAssertion(DamageAssertion(min, max))
        meIO.balanceCounter++;
        enemyIO.balanceCounter++;
        println("assert damage "+min)
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
    public fun init():SimpleBattleSimulator{
      
        val rule=BattleRule(2,1,1,1)
        val meWaitThread=Thread({->
            meClient=BattleClient(rule,"Me",arrayOf(myPokemon),mePipe,meIO)
           mePlayer=meClient!!.player
           meIO.player=mePlayer
           meIO.AllInitializedSemaphore.release()
           
        });
        meWaitThread.start()
     
        val enemyWaitThread=Thread({->
            enemyClient=BattleClient(rule,"Enemy",arrayOf(enemyPokemon),enemyPipe,enemyIO)
            enemyPlayer=enemyClient!!.player
            enemyIO.player=enemyPlayer
            enemyIO.AllInitializedSemaphore.release()
        });
        enemyWaitThread.start()

        val serverWaitThread=Thread({->
            server.waitForConnection(SharedPipe.getOrCreatePipe(mePort))
            println("First connection")
            server.waitForConnection(SharedPipe.getOrCreatePipe(enemyPort))
        })
        serverWaitThread.start()

     
        println("joined dasdsdsadweqde")
        
        println("Waiting ahhlo")
        return this
       
    }
    public fun execute(){
        meIO.InputProvidedSemaphore.release();
        enemyIO.InputProvidedSemaphore.release();
        println("Waiting for testwddscdvfvfdvd")
        meIO.TestFinishedSemaphore.acquireTimeout(1,30, TimeUnit.SECONDS)
        enemyIO.TestFinishedSemaphore.acquireTimeout(1,30, TimeUnit.SECONDS)
        println("test finnished");
        val success=rootAssertion.check(meIO.actions)
        if(!success){
            throw Exception("Assertion not successful")
        }
       
        
    }
    
}
