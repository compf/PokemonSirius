package compf.core.etc.services;

import java.util.Arrays;

public class DefaultLoggerService  implements LoggerService{
    @Override
    public void log(String text, Object callerInfo, Object... args) {
        System.out.println(text+ Arrays.toString(args));
    }
}
