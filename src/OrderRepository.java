import java.util.ArrayList;
import java.util.List;


public class OrderRepository {

    private List<Order> orderList;

    public OrderRepository() {
        this.orderList = new ArrayList<>();
    }

    public void saveOrder(Order order) {
        orderList.add(order);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orderList);
    }
}
 
