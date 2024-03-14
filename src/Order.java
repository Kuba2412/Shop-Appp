import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private final int orderId;
    private final List<Product> orderedProducts;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final LocalDateTime orderTime;

    public Order(int orderId, List<Product> orderedProducts, String firstName, String lastName, String email, LocalDateTime orderTime) {
        this.orderId = orderId;
        this.orderedProducts = orderedProducts;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.orderTime = orderTime;
    }

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

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
    public double getTotalAmount() {
        double total = 0;
        for (Product product : orderedProducts) {
            total += product.getPrice();
        }
        return total;
    }

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
}