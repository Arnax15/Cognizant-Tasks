import java.util.ArrayList;
import java.util.List;

public class OrderProcessing {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        // add sample orders

        OrderFilter amountFilter = order -> order.getOrderAmount() > 1000;
        OrderProcessor statusProcessor = order -> order.setStatus("Processed");

        processOrders(orders, amountFilter, statusProcessor);
    }

    public static void processOrders(List<Order> orders, OrderFilter filter, OrderProcessor processor) {
        for (Order order : orders) {
            if (filter.filter(order)) {
                processor.process(order);
            }
        }
    }
}
