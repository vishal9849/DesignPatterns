package CreationalSingleton;

public class LoggerExample {

    public static void main(String[] args) throws InterruptedException {
        // Creating instance of logger implementations
        Logger fileLogger = new FileLogger();
        Logger consoleLogger = new ConsoleLogger();

        // Creating instance of LoggerManager with dependency injection;
        LoggerManager fileLoggerManager = LoggerManager.getInstance(fileLogger);
        LoggerManager consoleLoggerManager = LoggerManager.getInstance(consoleLogger);

        fileLoggerManager.log("This is a log message to a file");
        consoleLoggerManager.log("This is a log message to console.");
    }
}
