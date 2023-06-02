package util

abstract class CountingStyleIterator<T> : Iterator<T> {
    private var hasAnyNext = true;
    private val numberIterators: Int;
    protected val iterators: Array<Iterator<Any>?>

     constructor(numberIterators: Int) {
        this.numberIterators = numberIterators
        this.iterators = arrayOfNulls<Iterator<Any>?>(numberIterators)

    }
     fun resetAll(){
        for (i in 0 until numberIterators) {
            reset(i)
            if(iterators[i]!!.hasNext()){
                assign(i,iterators[i]!!.next())
            }

        }
    }

    public abstract fun reset(index: Int);
    public abstract  fun assign(index:Int,value:Any)
    public abstract fun construct(): T;
    override fun hasNext(): Boolean {
        return hasAnyNext
    }

    override fun next(): T {
        var previous=construct()
        for (i in numberIterators-1 downTo 0) {

            if (!iterators[i]!!.hasNext()) {
                if(i==0){
                    hasAnyNext=false;
                }
               reset(i)
            }
            if(iterators[i]!!.hasNext()){
                assign(i,iterators[i]!!.next())
            }
            for(j in i+1 until numberIterators){
                reset(j)
                if(iterators[j]!!.hasNext()){
                    assign(j,iterators[j]!!.next())
                }

            }


        }
        if(!hasAnyNext){
            return previous
        }
        else{
            return construct()
        }

    }
}
