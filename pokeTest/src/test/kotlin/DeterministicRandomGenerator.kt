

import compf.core.etc.services.RealRandomGeneratorService
public class DeterministicRandomGenerator: RealRandomGeneratorService(){
    private val deterministicMap:HashMap<Any,Any> = HashMap()
    public fun addDeterministicValue(callerInfo:Any,value:Any){
        deterministicMap.put(callerInfo, value);
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