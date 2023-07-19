package util

import compf.core.etc.services.SharedInformation
import kotlin.random.Random

class KotlinRandomService(val callerInformation: Any): Random() {
    override fun nextBits(bitCount: Int): Int {
        return Default.nextBits(bitCount)
    }

    override fun nextInt(): Int {
        return SharedInformation.Instance.rng.randomNumber(Int.MAX_VALUE,callerInformation)
    }

    override fun nextInt(from: Int, until: Int): Int {
        return SharedInformation.Instance.rng.randomNumber(from,until,callerInformation)
    }

    override fun nextInt(until: Int): Int {
        return SharedInformation.Instance.rng.randomNumber(until,callerInformation)
    }

    override fun nextBoolean(): Boolean {
       return  SharedInformation.Instance.rng.checkPerc(50,callerInformation)
    }
}