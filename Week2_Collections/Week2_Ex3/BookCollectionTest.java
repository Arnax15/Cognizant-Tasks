public class BookCollectionTest {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        collection.addBook("Book 1");
        collection.addBook("Book 2");
        collection.addBook("Book 3");

        System.out.println("Initial Collection:");
        collection.displayBooks();

        collection.removeBook("Book 2");

        System.out.println("After removing Book 2:");
        collection.displayBooks();
    }
}
