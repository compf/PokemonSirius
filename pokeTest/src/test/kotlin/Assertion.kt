import compf.core.engine.BattleAction

public interface Assertion {
    public fun check(toCheck: Any): Boolean
}

public abstract class ActionAssertion : Assertion {}

public class DamageAssertion(val minDamage: Int, val maxDamage: Int) : ActionAssertion() {
    public override fun check(toCheck: Any): Boolean {
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
                    if(!compAssertionsMap.containsKey(comp)){
                        compAssertionsMap.set(comp, HashSet())
                    } 
                    compAssertionsMap[comp]?.add(assertion);
                    if(!assertionCompMap.containsKey(assertion)){
                        assertionCompMap.set(assertion, HashSet())
                    } 
                    assertionCompMap[assertion]?.add(comp);
                }
            }
        }
        for(ass in assertionCompMap ){
            if(ass.value.size > 1){
                var atLeastOneWithMoreThanOneAssertions=false;
                for(cmp in ass.value ){
                    atLeastOneWithMoreThanOneAssertions = atLeastOneWithMoreThanOneAssertions || ((compAssertionsMap[cmp])!!.size>1);
                }
                if(!atLeastOneWithMoreThanOneAssertions){
                    println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                    return false
                }
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
                return false;
            }
            else if(!(assertionList[i] is GroupedAssertion) && !assertionList[i].check(compList[i])){
                return false;
            }
        }
        return true;
    }
    
}
