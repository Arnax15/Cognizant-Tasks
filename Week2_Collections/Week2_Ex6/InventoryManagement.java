import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<Integer, Product> products;

    public InventoryManagement() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void removeProduct(int productId) {
        products.remove(productId);
    }

    public void updateProductQuantity(int productId, int newQuantity) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
        }
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Quantity: " + product.getQuantity());
        }
    }
}
