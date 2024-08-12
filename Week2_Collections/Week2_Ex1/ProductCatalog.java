import java.util.HashSet;
import java.util.Set;

public class ProductCatalog {
    private Set<String> products;

    public ProductCatalog() {
        products = new HashSet<>();
    }

    public void addProduct(String productName) {
        products.add(productName);
    }

    public void removeProduct(String productName) {
        products.remove(productName);
    }

    public boolean searchProduct(String productName) {
        return products.contains(productName);
    }

    public void displayProducts() {
        for (String product : products) {
            System.out.println(product);
        }
    }
}
