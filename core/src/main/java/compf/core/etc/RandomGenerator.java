package compf.core.etc;

public interface RandomGenerator {
    public  int getPerc(Class<?> caller);

	public  boolean checkPerc(int upTo,Class<?> caller);

	public  int randomNumber(int fromInc, int toExc,Class<?> caller);
    public default int randomNumber(int toExc,Class<?> caller){
        return randomNumber(0,toExc,caller);
    }
}
