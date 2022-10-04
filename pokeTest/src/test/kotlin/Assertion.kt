

import compf.core.engine.BattleAction
public interface Assertion<T>{
    public fun check(value:T?):Boolean;
}
public abstract class ActionAssertion:Assertion<BattleAction>{
    
}
public class DamageAssertion(val minDamage:Int,val maxDamage:Int):ActionAssertion(){
public   override fun check(value:BattleAction?):Boolean
{
    if(value!!.Data==null )return true
    val damage=value!!.Data as Int
    return minDamage<=damage && damage<=maxDamage
}
override fun toString():String{
    return ""+minDamage + " to " +maxDamage;
}
}