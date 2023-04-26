

import compf.core.etc.services.RealRandomGeneratorService
public class DeterministicRandomGenerator: RealRandomGeneratorService(){
    private val deterministicMap:HashMap<Any,Any> = HashMap()
    public fun addDeterministicValue(callerInfo:Any,value:Any){
        deterministicMap.put(callerInfo, value);
    }
    public fun addTempDeterministicValue(callerInfo:Any,value:Any,callback:(() -> Unit)){
        addDeterministicValue(callerInfo, value)
        callback()
        removeDeterministicValue(callerInfo)
    }
    public fun removeDeterministicValue(callerInfo:Any){
        deterministicMap.remove(callerInfo)
    }


	public  override fun checkPerc( upTo:Int, callerInfo:Any): Boolean {
        if(deterministicMap.containsKey(callerInfo)){
            return deterministicMap.get(callerInfo) as Boolean
        }
        return super.checkPerc(upTo, callerInfo)
	}

	public  override fun  randomNumber( fromInc:Int,  toExc:Int,callerInfo:Any ):Int {
        if(deterministicMap.containsKey(callerInfo)){
            return deterministicMap.get(callerInfo) as Int
        }
        return super.randomNumber(fromInc, toExc, callerInfo)
	} 
}