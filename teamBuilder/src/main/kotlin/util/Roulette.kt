package util

import compf.core.etc.services.SharedInformation

class Roulette<T>(map: Map<T, Double>) {

    fun set(item:T,weight:Double=1.0){
        internDict[item]=weight
    }
    fun random(callerInfo:Any):T{
        val weightSum=internDict.values.sum().toInt()
        var sum=0.0
        for(k in internDict.keys){
            if(sum>SharedInformation.Instance.rng.randomNumber(weightSum,callerInfo)){
                return k
            }

            sum+=internDict.getOrDefault(k,0.0)
        }
        return internDict.keys.last()

    }
    private var internDict:MutableMap<T,Double> = mutableMapOf()

    init {
        this.internDict = map.toMutableMap()
    }
}