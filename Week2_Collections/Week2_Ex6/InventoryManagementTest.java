public class InventoryManagementTest {
    public static void main(String[] args) {
        InventoryManagement management = new InventoryManagement();

        Product product1 = new Product(1, "Product 1", 10);
        Product product2 = new Product(2, "Product 2", 20);
        Product product3 = new Product(3, "Product 3", 30);

        management.addProduct(product1);
        management.addProduct(product2);
        management.addProduct(product3);

        System.out.println("Initial Products:");
        management.displayProducts();

        management.removeProduct(2);

        System.out.println("After removing Product 2:");
        management.displayProducts();

        management.updateProductQuantity(1, 15);

        System.out.println("After updating Product 1 quantity:");
        management.displayProducts();
    }
}
