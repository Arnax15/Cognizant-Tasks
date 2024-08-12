import java.util.TreeSet;

public class UserRegistration {
    private TreeSet<String> users;

    public UserRegistration() {
        users = new TreeSet<>();
    }

    public void registerUser(String userName) {
        users.add(userName);
    }

    public void removeUser(String userName) {
        users.remove(userName);
    }

    public void displayUsers() {
        for (String user : users) {
            System.out.println(user);
        }
    }
}
