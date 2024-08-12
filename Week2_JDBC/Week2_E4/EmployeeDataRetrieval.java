public void addEmployee(Connection conn, String name, String position, double salary) {
    try (PreparedStatement pstmt = conn.prepareStatement("INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)")) {
        pstmt.setString(1, name);
        pstmt.setString(2, position);
        pstmt.setDouble(3, salary);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error adding employee: " + e.getMessage());
    }
}

public void updateEmployee(Connection conn, int id, String name, String position, double salary) {
    try (PreparedStatement pstmt = conn.prepareStatement("UPDATE employees SET name = ?, position = ?, salary = ? WHERE id = ?")) {
        pstmt.setString(1, name);
        pstmt.setString(2, position);
        pstmt.setDouble(3, salary);
        pstmt.setInt(4, id);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error updating employee: " + e.getMessage());
    }
}

public void deleteEmployee(Connection conn, int id) {
    try (PreparedStatement pstmt = conn.prepareStatement("DELETE FROM employees WHERE id = ?")) {
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error deleting employee: " + e.getMessage());
    }
}

public static void main(String[] args) {
    JDBCConnection jdbcConn = new JDBCConnection();
    Connection conn = jdbcConn.getConnection();

    EmployeeDataRetrieval employeeData = new EmployeeDataRetrieval();

    employeeData.addEmployee(conn, "John Doe", "Software Engineer", 50000.0);
    employeeData.addEmployee(conn, "Jane Smith", "Marketing Manager", 60000.0);

    employeeData.updateEmployee(conn, 1, "John Doe", "Senior Software Engineer", 70000.0);

    employeeData.deleteEmployee(conn, 2);

    employeeData.getEmployees(conn);
}
