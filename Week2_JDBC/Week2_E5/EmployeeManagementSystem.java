import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        JDBCConnection jdbcConn = new JDBCConnection();
        Connection conn = jdbcConn.getConnection();

        EmployeeDataRetrieval employeeData = new EmployeeDataRetrieval();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1.
