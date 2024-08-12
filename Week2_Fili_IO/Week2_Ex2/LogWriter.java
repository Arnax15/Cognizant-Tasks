import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class LogWriter {
    public void writeLog(String fileName, String logMessage) {
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(logMessage + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
