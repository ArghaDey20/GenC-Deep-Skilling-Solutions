public class TestLogger {
    public static void main(String[] args) {
        
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("This is the first log message.");
        log2.log("This is the second log message.");

        if (log1 == log2) {
            System.out.println("Same instance is used.");
        } else {
            System.out.println("Different instances were created.");
        }
    }
}
