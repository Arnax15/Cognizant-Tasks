import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessorApp {
    public static void main(String[] args) {
        LargeFileReader reader = new LargeFileReader();
        reader.readLargeFile("large_file.txt");

        List<String> processedData = new ArrayList<>();
        // Process the data (e.g., filtering records, calculating totals)
        processedData.add("Processed data 1");
        processedData.add("Processed data 2");
        processedData.add("Processed data 3");

        LargeFileWriter writer = new LargeFileWriter();
        writer.writeProcessedData("processed_data.txt", processedData);

        try {
            reader.readLargeFile("non-existent-file.txt");
        } catch (Exception e) {
            System.err.println("Error reading from non-existent file: " + e.getMessage());
        }

        try {
            writer.writeProcessedData("restricted_file.txt", processedData);
        } catch (Exception e) {
            System.err.println("Error writing to restricted file: " + e.getMessage());
        }
    }
}
