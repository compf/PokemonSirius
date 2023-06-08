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
        resetFrom(0)
    }

    public abstract fun reset(index: Int);
    public abstract  fun assign(index:Int,value:Any)
    public abstract fun construct(): T;
    override fun hasNext(): Boolean {
        return hasAnyNext
    }
    private fun resetFrom(start:Int){
        for (i in start until numberIterators ){
            reset(i)
            assign(i,iterators[i]!!.next())
        }
    }

    override fun next(): T {
        for (i in numberIterators-1 downTo 0) {

            if (!iterators[i]!!.hasNext()) {
                if(i==0){
                    hasAnyNext=false;
                }
               resetFrom(i)
            }
            else{
                assign(i,iterators[i]!!.next())
                resetFrom(i+1)
                return construct()
            }



        }
        return construct()


    }
}
