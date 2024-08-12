public class LogApp {
    public static void main(String[] args) {
        LogWriter writer = new LogWriter();
        writer.writeLog("log.txt", "Log message 1");
        writer.writeLog("log.txt", "Log message 2");
        writer.writeLog("log.txt", "Log message 3");

        LogReader reader = new LogReader();
        reader.readLogs("log.txt");

        try {
            reader.readLogs("non-existent-file.txt");
        } catch (Exception e) {
            System.err.println("Error reading from non-existent file: " + e.getMessage());
        }
    }
}
