import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriterDemo {
    public void saveNoteToFile(String fileName, String note) {
        try (FileWriter fw = new FileWriter(fileName);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(note);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
