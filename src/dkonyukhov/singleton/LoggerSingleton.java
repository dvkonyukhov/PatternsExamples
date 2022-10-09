package dkonyukhov.singleton;

public class LoggerSingleton {
    public static LoggerSingleton loggerSingleton;

    public static synchronized LoggerSingleton getSingleton() {
        if (loggerSingleton == null) {
            loggerSingleton = new LoggerSingleton();
        }
        return loggerSingleton;
    }

    private LoggerSingleton() {
    }

}
