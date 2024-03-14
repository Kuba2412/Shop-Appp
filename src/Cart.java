import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public List<Product> getCartItems() {
        return cartItems;
    }

    public void addToCart (Product product) {
        cartItems.add(product);
        System.out.println("Produkt dodany do koszyka: " + product.getName());
    }
    public void removeFromCart (Product product) {
        cartItems.remove(product);
        System.out.println("Produkt usunięty z koszyka: " + product.getName());
    }
    public void displayCart() {
        System.out.println("Zawartość koszyka:");
        for (Product product : cartItems) {
            System.out.println(product.getName() + product.getPrice() + " PLN");
        }
    }
    public double calculateTotal() {
        double total = 0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
    }
    public void  clearCart() {
        cartItems.clear();
        System.out.println("Koszyk wyczyszczony");
    }
}
