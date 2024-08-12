public class CustomerAccountsTest {
    public static void main(String[] args) {
        CustomerAccounts accounts = new CustomerAccounts();

        Customer customer1 = new Customer(1, "John Doe", "john.doe@example.com");
        Customer customer2 = new Customer(2, "Jane Doe", "jane.doe@example.com");
        Customer customer3 = new Customer(3, "Bob Smith", "bob.smith@example.com");

        accounts.addCustomer(customer1);
        accounts.addCustomer(customer2);
        accounts.addCustomer(customer3);

        System.out.println("Initial Customers:");
        accounts.displayCustomers();

        accounts.removeCustomer(2);

        System.out.println("After removing Customer 2:");
        accounts.displayCustomers();
    }
}
