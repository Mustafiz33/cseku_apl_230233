package model;

import java.util.ArrayList;
import java.util.List;

public class OrderModel {
    private int orderId;
    private Customer customer;
    private List<OrderItem> orderItems;
    private OrderStatus status;

    public OrderModel(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderItems = new ArrayList<>();
        this.status = OrderStatus.PENDING;
    }


    public void addOrderItem(OrderItem item) {
        orderItems.add(item);
    }


    public void removeOrderItem(OrderItem item) {
        orderItems.remove(item);
    }


    public double calculateTotal() {
        return orderItems.stream().mapToDouble(OrderItem::calculateItemTotal).sum();
    }


    public void updateStatus(OrderStatus status) {
        this.status = status;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
