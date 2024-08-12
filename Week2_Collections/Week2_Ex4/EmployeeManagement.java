import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                employees.remove(employee);
                break;
            }
        }
    }

    public void updateEmployee(int employeeId, String newAddress) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                employee.setAddress(newAddress);
                break;
            }
        }
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Address: " + employee.getAddress());
        }
    }
}
