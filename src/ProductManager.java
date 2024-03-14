import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private final List<Product> productList;

    public ProductManager() {
        this.productList = new ArrayList<>();

    }

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Dodany produkt: " + product.getName());
    }

    public void removeProduct(int productId) {
        for (Product product : productList) {
            if (product.getId() == productId) {
                productList.remove(product);
                System.out.println("Usunięty produkt: " + product.getName());
                return;
            }
        }
        System.out.println("Produkt " + productId + " nie znaleziono.");
    }

    public void updateProduct(Product updatedProduct) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == updatedProduct.getId()) {
                productList.set(i, updatedProduct);
                System.out.println("Zaktualizowany produkt: " + updatedProduct.getName());
                return;
            }
        }
        System.out.println("Produkt " + updatedProduct.getId() + " nie znaleziono.");
    }

    public void displayProduct() {
        System.out.println("Lista produktów:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

}
