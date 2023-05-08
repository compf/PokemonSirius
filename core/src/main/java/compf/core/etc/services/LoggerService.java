package compf.core.etc.services;

public interface LoggerService {
    public void log(String text, Object callerInfo,Object... args);
    static Object[] empty=new Object[0];
    public default  void log(String text,Object callerInfo){
        log(text,callerInfo,empty);
    }
}
