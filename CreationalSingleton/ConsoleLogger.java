package CreationalSingleton;

public class ConsoleLogger implements Logger {

    @Override
    public void logMessage(String message) {
        // Implementation for console-based loggging
        // ...
        System.out.println("Console Loggine: "+ message);
    }
}
