package teambuilder
public interface Aggregator{
    public fun consume(newValue:Double);
    public fun produce():Double;
    public fun reset();
}
public class MaxAggregator:Aggregator{
    private var value:Double=0.0;
    override fun consume(newValue: Double) {value=maxOf(newValue,value) }
    override fun reset(){
        value=0.0
    }
    override fun produce(): Double {return value }
    
}
public class MeanAggregator:Aggregator{
    private var values=ArrayList<Double>()
    override fun consume(newValue: Double) {values.add(newValue) }

    override fun produce(): Double {return values.sum()/values.size; }

    override fun reset() { values.clear()}
    
}