import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderDemo {
    public void readNoteFromFile(String fileName) {
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
