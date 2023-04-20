import compf.core.etc.RealRandomGenerator;
public class DeterministicRandomGenerator: RealRandomGenerator(){
    private val deterministicMap:HashMap<Class<*>,Any> = HashMap()
    public fun addDeterministicValue(type:Class<*>,value:Any){
        deterministicMap.put(type, value);
    }
    public override fun  getPerc(caller: Class<*> ) :Int {
		return super.getPerc(caller);
	}

	public  override fun checkPerc( upTo:Int, caller:Class<*>): Boolean {
		return super.checkPerc(upTo, caller)
	}

	public  override fun  randomNumber( fromInc:Int,  toExc:Int,caller:Class<*> ):Int {
		return super.randomNumber(fromInc, toExc, caller)
	} 
}