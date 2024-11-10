import java.util.List;

public class Order {
    private int orderId; // Unique ID of the order
    private Customer customer; // Customer who placed the order
    private List<OrderItem> orderItems; // List of items in the order
    private OrderStatus status; // Current status of the order (e.g., PENDING, COMPLETED)

    public Order(int orderId, Customer customer) {
        // Constructor to initialize the order with an ID, customer, and set the initial status to PENDING
    }

    public void addOrderItem(OrderItem item) {
        // Adds a new item to the current order
    }

    public void removeOrderItem(OrderItem item) {
        // Removes an item from the current order
    }

    public double calculateTotal() {
        // Calculates and returns the total cost of all items in the order
        return 0; // Placeholder for the actual return value
    }

    public void updateStatus(OrderStatus status) {
        // Updates the status of the order (e.g., from PENDING to COMPLETED)
    }
}
