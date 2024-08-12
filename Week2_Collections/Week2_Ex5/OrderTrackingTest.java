public class OrderTrackingTest {
    public static void main(String[] args) {
        OrderTracking tracking = new OrderTracking();

        Order order1 = new Order(1, "Order 1 details");
        Order order2 = new Order(2, "Order 2 details");
        Order order3 = new Order(3, "Order 3 details");

        tracking.addOrder(order1);
        tracking.addOrder(order
