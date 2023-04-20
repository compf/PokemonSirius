package compf.core.etc;

import java.util.Random;

public class RealRandomGenerator implements RandomGenerator {
    private Random RNG=new Random();
    public  int getPerc(Class<?> caller) {
		return RNG.nextInt(101);
	}

	public  boolean checkPerc(int upTo,Class<?> caller) {
		return getPerc(caller) <= upTo;
	}

	public  int randomNumber(int fromInc, int toExc,Class<?> caller) {
		return RNG.nextInt(toExc - fromInc) + fromInc;
	}
}
