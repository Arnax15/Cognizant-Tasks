import java.util.Scanner;

public class NoteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a note: ");
        String note = scanner.nextLine();

        FileWriterDemo writer = new FileWriterDemo();
        writer.saveNoteToFile("note.txt", note);

        FileReaderDemo reader = new FileReaderDemo();
        reader.readNoteFromFile("note.txt");
    }
}
