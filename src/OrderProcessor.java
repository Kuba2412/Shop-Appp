import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    private final List<Order> orderList;

    public OrderProcessor() {
        this.orderList = new ArrayList<>();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void processOrder(Cart cart, String firstName, String lastName, String email) {
        List<Product> cartItems =
                cart.getCartItems();
        if (!cartItems.isEmpty()) {
            int orderId =
                    orderList.size() + 1;
            LocalDateTime orderTime = LocalDateTime.now();
            Order newOrder = new Order(orderId, cartItems, firstName, lastName, email, orderTime);
            orderList.add(newOrder);

            cart.clearCart();
            System.out.println("Zamówienie pomyślnie zaakceptowane. Numer zamówienia: " + orderId);
            generateInovice(newOrder);
        } else {
            System.out.println("Koszyk jest pusty :(.");
        }
    }

    private void generateInovice(Order order) {
        System.out.println("Faktura dla zamówienia nr.: " + order.getOrderId());
        System.out.println("Klient: " + order.getFirstName() + order.getLastName() + order.getEmail());
        System.out.println("Szczegóły zamówienia: ");
        for (Product product : order.getOrderedProducts()) {
            System.out.println(product.getName() + product.getPrice() + " PLN");
        }
        System.out.println("Całkowita kwota: " + order.getTotalAmount());
        System.out.println("Data zamówienia: " + order.getOrderTime());
    }

    public void displayOrders() {
        if (!orderList.isEmpty()) {
            System.out.println("Lista zamówień: ");
            for (Order order : orderList) {
                System.out.println(order);
            }
        } else {
            System.out.println("Brak zamówień.");
        }
    }
}
