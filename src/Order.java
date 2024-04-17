import java.time.ZonedDateTime;
import java.util.List;

/**
 * Klasa reprezentująca zamówienie w sklepie internetowym.
 */

public class Order {
    private final int orderId;     // Identyfikator zamówienia
    private final List<Product> orderedProducts;     // Lista zamówionych produktów
    private final String firstName;     // Imię klienta
    private final String lastName;     // Nazwisko Klienta
    private final String email;     // Email klienta
    private final ZonedDateTime orderTime;     // Data i czas zamówienia

    /**
     * Konstruktor klasy Order.
     * @param orderId Identyfikator zamówienia.
     * @param orderedProducts Lista zamówionych produktów.
     * @param firstName Imię klienta.
     * @param lastName Nazwisko klienta.
     * @param email Email klienta.
     * @param orderTime Data i czas zamówienia.
     */

    public Order(int orderId, List<Product> orderedProducts, String firstName, String lastName, String email, ZonedDateTime orderTime) {
        this.orderId = orderId;
        this.orderedProducts = orderedProducts;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.orderTime = orderTime;
    }

    // Metody i gettery

    /**
     * Oblicza łączną wartość zamówienia.
     * @return Łączna wartość zamówienia.
     */

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public ZonedDateTime getOrderTime() {
        return orderTime;
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product product : orderedProducts) {
            total += product.getPrice();
        }
        return total;
    }

    /**
     * Zwraca tekstową reprezentację zamówienia.
     * @return Tekstowa reprezentacja zamówienia.
     */

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderedProducts=" + orderedProducts +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", orderTime=" + orderTime +
                '}';
    }

    public void setTotalAmount(double totalAmount) {
    }
}