public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        Employee employee1 = new Employee(1, "John Doe", "123 Main St");
        Employee employee2 = new Employee(2, "Jane Doe", "456 Elm St");
        Employee employee3 = new Employee(3, "Bob Smith", "789 Oak St");

        management.addEmployee(employee1);
        management.addEmployee(employee2);
        management.addEmployee(employee3);

        System.out.println("Initial Employees:");
        management.displayEmployees();

        management.removeEmployee(2);

        System.out.println("After removing Employee 2:");
        management.displayEmployees();

        management.updateEmployee(1, "New Address");

        System.out.println("After updating Employee 1:");
        management.displayEmployees();
    }
}
