import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class ContactWriter {
    public void saveContact(String fileName, Contact contact) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(contact);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
