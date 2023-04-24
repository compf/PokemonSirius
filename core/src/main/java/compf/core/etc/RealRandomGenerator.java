package compf.core.etc;

import java.util.Random;

public class RealRandomGenerator implements RandomGenerator {
    private Random RNG=new Random();


	public  boolean checkPerc(int upTo,Object callerInfo) {
		return randomNumber(0, 100, callerInfo) <= upTo;
	}

	public  int randomNumber(int fromInc, int toExc,Object callerInfo) {
		return RNG.nextInt(toExc - fromInc) + fromInc;
	}
}
