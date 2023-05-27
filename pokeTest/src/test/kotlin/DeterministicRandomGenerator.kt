

import compf.core.etc.services.random.RealRandomGeneratorService
import java.util.*
import kotlin.collections.HashMap

public class DeterministicRandomGenerator: RealRandomGeneratorService(){
    private val deterministicMap:HashMap<Any, Queue<Any>> = HashMap()
    public fun addDeterministicValue(callerInfo:Any,value:Any){
        deterministicMap.computeIfAbsent(callerInfo){LinkedList()}.add(value)
    }
    public fun addUnchangeableDeterminsticValue(callerInfo: Any,value: Any){
        deterministicMap.computeIfAbsent(callerInfo){NoShrinkingQueue()}.add(value)
    }
    private fun dequeueValueByKey(key:Any):Any{
        return deterministicMap[key]!!.remove()
    }

	public  override fun checkPerc( upTo:Int, callerInfo:Any): Boolean {
       val result=dequeueValueByKey(callerInfo)
        return result as Boolean
	}

	public  override fun  randomNumber( fromInc:Int,  toExc:Int,callerInfo:Any ):Int {
        val result=dequeueValueByKey(callerInfo)
        return result as Int
	} 
}

/**
 * A linked list where no elements can be removed.
 * If remove methods are called, they do not change anything
 */
class NoShrinkingQueue : Queue<Any>{
    private val list=LinkedList<Any>()
    override fun add(element: Any): Boolean {
        return list.add(element)
    }

    override fun addAll(elements: Collection<Any>): Boolean {
       return list.addAll(elements)
    }

    override fun clear() {
        // do nothing
    }

    override fun iterator(): MutableIterator<Any> {
        return list.iterator()
    }

    override fun remove(): Any {
      return list.element() // DO NOT REMOVE THE ELEMENT!!!!
    }

    override fun retainAll(elements: Collection<Any>): Boolean {
        return false // do nothing
    }

    override fun removeAll(elements: Collection<Any>): Boolean {
        return false // do nothing
    }

    override fun remove(element: Any?): Boolean {
        return false // do nothing
    }

    override fun isEmpty(): Boolean {
        return list.isEmpty()
    }

    override fun poll(): Any {
        return remove()
    }

    override fun element(): Any {
       return list.element()
    }

    override fun peek(): Any {
       return list.peek()
    }

    override fun offer(e: Any?): Boolean {
        return list.offer(e)
    }

    override fun containsAll(elements: Collection<Any>): Boolean {
        return list.containsAll(elements)
    }

    override fun contains(element: Any?): Boolean {
        return  list.contains(element)
    }

    override val size: Int
        get(){
            return list.size
        }
}
