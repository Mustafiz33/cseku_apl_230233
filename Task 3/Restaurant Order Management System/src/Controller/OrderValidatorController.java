package controller;

import model.OrderValidator;
import model.Order;

public class OrderValidatorController {
    private OrderValidator orderValidator;

    public OrderValidatorController() {
        this.orderValidator = new OrderValidator();
    }

    // Method to validate an order
    public boolean validateOrder(Order order) {
        boolean isValid = orderValidator.validateOrder(order);
        if (isValid) {
            System.out.println("Order is valid.");
        } else {
            System.out.println("Order is invalid. It must contain at least one item.");
        }
        return isValid;
    }
}
