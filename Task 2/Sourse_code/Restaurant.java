import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name; // Name of the restaurant
    private Menu menu; // The menu containing available dishes
    private List<Order> orderList; // List of all orders placed in the restaurant

    public Restaurant(String name) {
        // Constructor to initialize the restaurant's name
        // Creates a new menu and an empty list for storing orders
    }

    public void addOrder(Order order) {
        // Adds a new order to the restaurant's order list
        // This method is called when a customer places an order
    }

    public List<Order> getOrders() {
        // Returns the list of all orders placed in the restaurant
        // This can be used to view all pending or completed orders
        return null; // Placeholder for the actual return value
    }

    public Menu getMenu() {
        // Returns the restaurant's menu
        // Used to access the list of available menu items
        return null; // Placeholder for the actual return value
    }
}
