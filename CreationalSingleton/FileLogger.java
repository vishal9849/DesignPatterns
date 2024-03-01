package CreationalSingleton;

public class FileLogger implements Logger {

    @Override
    public void logMessage(String message) {
        // Implementation for File based logging
        //..
        System.out.println("File Loggineg: " + message);
    }
}
