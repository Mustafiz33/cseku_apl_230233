package controller;

import model.OrderProcessor;
import model.Order;
import model.OrderValidator;

public class OrderProcessorController {
    private OrderProcessor orderProcessor;

    public OrderProcessorController(OrderValidator orderValidator) {
        this.orderProcessor = new OrderProcessor(orderValidator);
    }


    public void processOrder(Order order) {
        System.out.println("Starting order processing...");
        orderProcessor.processOrder(order);
    }


    public void setOrderValidator(OrderValidator newValidator) {
        orderProcessor = new OrderProcessor(newValidator);
        System.out.println("OrderValidator has been updated.");
    }
}
