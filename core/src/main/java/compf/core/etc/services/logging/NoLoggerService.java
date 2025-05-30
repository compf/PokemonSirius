package compf.core.etc.services.logging;

public class NoLoggerService implements LoggerService{
    @Override
    public void log(String text, Object callerInfo, Object... args) {
        if(callerInfo instanceof  Boolean){
            new DefaultLoggerService().log(text,callerInfo);
        }
    }
}
