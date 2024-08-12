import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/employee_db";
        String username = "root";
        String password = "password";

        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
            return null;
        }
    }
}
