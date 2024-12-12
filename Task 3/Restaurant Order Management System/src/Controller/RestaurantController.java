package controller;

import model.Restaurant;
import model.Order;
import model.Menu;

public class RestaurantController {
    private Restaurant restaurant;

    public RestaurantController(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    // Add an order to the restaurant
    public void addOrder(Order order) {
        restaurant.addOrder(order);
    }

    // Retrieve the restaurant's menu
    public Menu getMenu() {
        return restaurant.getMenu();
    }

    // Display all orders for the restaurant
    public void displayOrders() {
        System.out.println("Current Orders for Restaurant: " + restaurant.getOrders().size());
        for (Order order : restaurant.getOrders()) {
            System.out.println(order); // Assuming Order has a meaningful toString method
        }
    }

    // Get the restaurant name
    public String getRestaurantName() {
        return restaurant.getMenu().toString();
    }

    // Set the restaurant name
    public void setRestaurantName(String name) {
        restaurant.setName(name);
    }
}
