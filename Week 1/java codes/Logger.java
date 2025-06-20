public class Logger {
    
    private static Logger instance = null;

    // private constructor so other classes cant make objects
    private Logger() {
        System.out.println("Logger initialized");
    }

    // public static method to return the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // just a method to show logging message
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
