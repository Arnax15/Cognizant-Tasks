public class ProductCatalogTest {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct("Product 1");
        catalog.addProduct("Product 2");
        catalog.addProduct("Product 3");

        System.out.println("Initial Catalog:");
        catalog.displayProducts();

        catalog.removeProduct("Product 2");

        System.out.println("After removing Product 2:");
        catalog.displayProducts();

        System.out.println("Searching for Product 3: " + catalog.searchProduct("Product 3"));
    }
}
