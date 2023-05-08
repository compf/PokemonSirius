import compf.core.engine.BattleAction
import compf.core.etc.services.SharedInformation

public interface Assertion {
    public fun check(toCheck: Any): Boolean
}

public abstract class ActionAssertion : Assertion {
    protected abstract fun isDataValid(toCheck:Any):Boolean;
}
public class HPModifiedAssertion(val factor:Double):ActionAssertion() {
    protected override fun isDataValid(toCheck:Any):Boolean{
        val action =toCheck as BattleAction;
        return action.Data!=null && action.Data.toString().contains(" ")
    }
    public override fun check(toCheck: Any): Boolean {
        if(!this.isDataValid(toCheck))return false
        val action =toCheck as BattleAction;
       val splitted= action.Data.toString().split(" ")
       if(splitted.size<2)return false
       val from =splitted[0].toDouble()
       val to=splitted[1].toDouble()
        SharedInformation.Instance.getLoggerService().log("hp assertion " +from +" "+to,SimpleBattleSimulator::class)
       val EPSILON=2.0/from
       return Math.abs((to/from)-factor)<EPSILON

    }
    override fun toString(): String {
        return "Hp reduce "+factor;
    }
}

public class DamageAssertion(val minDamage: Int, val maxDamage: Int) : ActionAssertion() {
    protected override fun isDataValid(toCheck:Any):Boolean{
        val action =toCheck as BattleAction;
        return action.Data!=null && action.Data.toString().toIntOrNull()!=null
    }
    public override fun check(toCheck: Any): Boolean {
        if(!this.isDataValid(toCheck))return false
        val value = toCheck as BattleAction
        if (value!!.Data == null) return true
        val damage = value!!.Data as Int
        return minDamage <= damage && damage <= maxDamage
    }
    override fun toString(): String {
        return "" + minDamage + " to " + maxDamage
    }
}
public abstract class GroupedAssertion :Assertion{
    protected val assertionList:ArrayList<Assertion> =ArrayList()
    public  fun addAssertion(assertion:Assertion){
        assertionList.add(assertion)
    }   
    public fun getLast():GroupedAssertion{
        return assertionList.last() as GroupedAssertion;
    }

}
public class AnyOrderAssertion: GroupedAssertion(){
    public override fun check(toCheck:Any):Boolean{
        val compList=toCheck as ArrayList<Any>
        val compAssertionsMap=HashMap<Any,HashSet<Assertion>>()
        val assertionCompMap=HashMap<Assertion,HashSet<Any>>()
        for(comp in compList){
            for(assertion in assertionList){
                if(assertion.check(comp)){
                    SharedInformation.Instance.getLoggerService().log("Assertion " +assertion +" satisfied by "+(comp as BattleAction).Data,SimpleBattleSimulator::class )
                    if(!compAssertionsMap.containsKey(comp)){
                        compAssertionsMap.set(comp, HashSet())
                    } 
                    compAssertionsMap[comp]?.add(assertion);
                    if(!assertionCompMap.containsKey(assertion)){
                        assertionCompMap.set(assertion, HashSet())
                    } 
                    assertionCompMap[assertion]?.add(comp);
                }
                else{
                    SharedInformation.Instance.getLoggerService().log("Assertion " +assertion +" failed by "+(comp as BattleAction).Data,SimpleBattleSimulator::class )

                }
            }
        }
        for(ass in assertionCompMap ){
            if(ass.value.size ==0){
                return false;
            }
        }
        return true;
       
    }
  
}
public class ThisOrderAssertion: GroupedAssertion(){
    public override fun check(toCheck:Any):Boolean{
        val compList=toCheck as ArrayList<Any>
        for(i in 0 until assertionList.size){
            if(assertionList[i] is GroupedAssertion && !assertionList[i].check(compList)) {
                SharedInformation.Instance.getLoggerService().log("Assertion " +assertionList[i] +" failed by list" ,ThisOrderAssertion::class)
                return false;
            }
            else if(!(assertionList[i] is GroupedAssertion) && !assertionList[i].check(compList[i])){
                SharedInformation.Instance.getLoggerService().log("Assertion " +assertionList[i] +" failed by "+(compList[i] as BattleAction).Data ,ThisOrderAssertion::class)
                return false;
            }
        }
        return true;
    }
    
}
