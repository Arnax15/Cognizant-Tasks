public class ContactManagementTest {
    public static void main(String[] args) {
        ContactManagement management = new ContactManagement();

        Contact contact1 = new Contact(1, "John Doe", "123-456-7890");
        Contact contact2 = new Contact(2, "Jane Doe", "987-654-3210");
        Contact contact3 = new Contact(3, "Bob Smith", "555-123-4567");

        management.addContact(contact1);
        management.addContact(contact2);
        management.addContact(contact3);

        System.out.println("Initial Contacts:");
        management.displayContacts();

        management.removeContact(2);

        System.out.println("After removing Contact 2:");
        management.displayContacts();
    }
}
