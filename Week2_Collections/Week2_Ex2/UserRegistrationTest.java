public class UserRegistrationTest {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();

        registration.registerUser("Alice");
        registration.registerUser("Bob");
        registration.registerUser("Charlie");

        System.out.println("Registered Users:");
        registration.displayUsers();

        registration.removeUser("Bob");

        System.out.println("After removing Bob:");
        registration.displayUsers();
    }
}
