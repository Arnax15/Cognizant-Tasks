import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.ClassNotFoundException;

public class ContactReader {
    public Contact readContact(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Contact) ois.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("File not found:
