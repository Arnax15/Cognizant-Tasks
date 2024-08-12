import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LargeFileWriter {
    public void writeProcessedData(String outputFileName, List<String> processedData) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String data : processedData) {
                bw.write(data + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
