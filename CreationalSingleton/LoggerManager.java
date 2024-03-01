package CreationalSingleton;

public class LoggerManager {
    private Logger logger;
    private static volatile LoggerManager instance;

    private LoggerManager(Logger logger) {
        this.logger = logger;
    }

    public static LoggerManager getInstance(Logger logger) {
        LoggerManager result = instance;
        if(result == null) {
            synchronized (LoggerManager.class) {
                result = instance;
                if (result == null) {
                    instance = new LoggerManager(logger);
                }
//                Class.forName();
            }
        }
            return instance;
    }

//    public static LoggerManager getInstance(Logger logger) {
//        if (instance == null) {
//            instance = new LoggerManager(logger);
//        }
//        return instance;
//    }

    public void log(String message) {
        logger.logMessage(message);
    }
}
