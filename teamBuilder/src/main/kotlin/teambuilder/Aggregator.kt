package teambuilder

import kotlin.math.abs

public interface Aggregator{
    public fun consume(newValue:Double);
    public fun produce():Double;
    public fun reset();
    fun aggregateAll(iterable:Iterable<Double>):Double{
        for(it in iterable){
            consume(it)
        }
        return produce()
    }
}
public class MaxAggregator:Aggregator{
    private var value:Double=Double.MIN_VALUE
    override fun consume(newValue: Double) {value=maxOf(newValue,value) }
    override fun reset(){
        value=0.0
    }
    override fun produce(): Double {return value }
    
}
class MinAggregrator :Aggregator{
    private var value:Double=Double.MAX_VALUE
    override fun consume(newValue: Double) {
       value= minOf(value,newValue)
    }

    override fun produce(): Double {
       return value
    }

    override fun reset() {
       value=Double.MAX_VALUE
    }

}
class HooverAggregator:Aggregator{
    private var allSum:Double=0.0
    private var values= mutableListOf<Double>()
    override fun consume(newValue: Double) {
        allSum+=newValue
        values.add(allSum)
    }

    override fun produce(): Double {
        var sum=0.0
       val mean=values.average()
        for(v in values){
            sum+= abs(mean-v)
        }
        return 0.5*sum/allSum
    }

    override fun reset() {
       values.clear()
        allSum=0.0
    }

}
class SumAggregator:Aggregator{
    private var value:Double=0.0
    override fun consume(newValue: Double) {
        value+=newValue
    }

    override fun produce(): Double {
        return value
    }

    override fun reset() {
       value=0.0
    }

}
public class MeanAggregator:Aggregator{
    private var values=ArrayList<Double>()
    override fun consume(newValue: Double) {values.add(newValue) }

    override fun produce(): Double {return values.sum()/values.size; }

    override fun reset() { values.clear()}
    
}