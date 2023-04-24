package compf.core.etc.services;

import java.util.Random;

public class RealRandomGeneratorService implements RandomGeneratorService {
    private Random RNG=new Random();


	public  boolean checkPerc(int upTo,Object callerInfo) {
		return randomNumber(0, 100, callerInfo) <= upTo;
	}

	public  int randomNumber(int fromInc, int toExc,Object callerInfo) {
		return RNG.nextInt(toExc - fromInc) + fromInc;
	}
}
