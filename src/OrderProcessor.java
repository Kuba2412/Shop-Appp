import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa obsługująca przetwarzanie zamówień w sklepie internetowym.
 */

public class OrderProcessor {
    private final List<Order> orderList;     // Lista wszystkich zamówień

    /**
     * Konstruktor klasy OrderProcessor.
     */

    public OrderProcessor() {
        this.orderList = new ArrayList<>();
    }



    /**
     * Przetwarza nowe zamówienie.
     *
     * @param cart      Koszyk zawierający produkty do zamówienia.
     * @param firstName Imię klienta.
     * @param lastName  Nazwisko klienta.
     * @param email     Email klienta.
     */

    public void processOrder(Cart cart, String firstName, String lastName, String email) {
        List<Product> cartItems = cart.getCartItems();
        if (!cartItems.isEmpty()) {
            int orderId = orderList.size() + 1;
            ZonedDateTime orderTime = ZonedDateTime.now();
            Order newOrder = new Order(orderId, cartItems, firstName, lastName, email, orderTime);
            orderList.add(newOrder);

            cart.clearCart();
            System.out.println("Zamówienie pomyślnie zaakceptowane. Numer zamówienia: " + orderId);
            generateInvoice(newOrder);
        } else {
            System.out.println("Koszyk jest pusty.");
        }
    }
    // Pozostałe metody i gettery

    /**
     * Generuje fakturę dla danego zamówienia.
     *
     * @param order Zamówienie, dla którego generowana jest faktura.
     */

    private void generateInvoice(Order order) {
        System.out.println("Faktura dla zamówienia nr.: " + order.getOrderId());
        System.out.println("Klient: " + order.getFirstName() + " " + order.getLastName() + ", " + order.getEmail());
        System.out.println("Szczegóły zamówienia: ");
        for (Product product : order.getOrderedProducts()) {
            System.out.println(product.getName() + " - " + product.getPrice() + " PLN");
        }
        System.out.println("Całkowita kwota: " + order.getTotalAmount() + " PLN");
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