import java.util.LinkedList;

public class OrderTracking {
    private LinkedList<Order> orders;

    public OrderTracking() {
        orders = new LinkedList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order processOrder() {
        return orders.removeFirst();
    }

    public void displayOrders() {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId() + ", Order Details: " + order.getOrderDetails());
        }
    }
}
