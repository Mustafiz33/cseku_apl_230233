package view;

import model.*;

import java.util.List;

public class RestaurantView {
    private RestaurantModel restaurant;

    public RestaurantView(RestaurantModel restaurant) {
        this.restaurant = restaurant;
    }


    public void displayRestaurantName() {
        System.out.println("Restaurant Name: " + restaurant.getName());
    }


    public void displayMenu() {
        System.out.println("Menu:");
        for (MenuItemModel item : restaurant.getMenu().getMenuItems()) {
            System.out.println(item.getDetails());
        }
    }


    public void displayOrders(List<OrderModel> orders) {
        System.out.println("Orders:");
        for (OrderModel order : orders) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Customer: " + order.getCustomer().getDetails());
            System.out.println("Items:");
            for (OrderItemModel item : order.getOrderItems()) {
                System.out.println("- " + item.getMenuItem().getDetails() + ", Quantity: " + item.getQuantity());
            }
            System.out.println("Status: " + order.getStatus().getDescription());
        }
    }


    public void displayMessage(String message) {
        System.out.println(message);
    }
}
