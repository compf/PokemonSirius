package compf.core.etc;

public interface RandomGenerator {

	public  boolean checkPerc(int upTo,Object callerInfo);

	public  int randomNumber(int fromInc, int toExc,Object callerInfo);
    public default int randomNumber(int toExc,Object callerInfo){
        return randomNumber(0,toExc,callerInfo);
    }
}
