package Main;

import model.*;
import controller.*;
import view.*;

public class Main {
    public static void main(String[] args) {

        RestaurantModel restaurant = new RestaurantModel("Gourmet Place");


        MenuItemModel pizza = new MenuItemModel(1, "Pizza", 12.99, "Main Course");
        MenuItemModel pasta = new MenuItemModel(2, "Pasta", 9.99, "Main Course");
        restaurant.getMenu().addMenuItem(pizza);
        restaurant.getMenu().addMenuItem(pasta);


        RestaurantView restaurantView = new RestaurantView(restaurant);
        restaurantView.displayRestaurantName();
        restaurantView.displayMenu();

        CustomerModel customer = new CustomerModel(101, "Alice", "alice@example.com");
        restaurantView.displayCustomerDetails(customer);


        OrderModel order = new OrderModel(1, customer);
        order.addOrderItem(new OrderItemModel(pizza, 2));
        order.addOrderItem(new OrderItemModel(pasta, 1));


        OrderValidatorModel validator = new OrderValidatorModel();
        OrderProcessorModel processor = new OrderProcessorModel(validator);
        processor.processOrder(order);


        restaurantView.displayOrderDetails(order);


        PaymentModel payment = new CreditCardPaymentModel("1234-5678-9876-5432", "Alice", "12/25");
        payment.processPayment(order.calculateTotal());
        restaurantView.displayPaymentProcessing(payment, order.calculateTotal());


        OrderModel invalidOrder = new OrderModel(2, customer);
        OrderItemModel invalidItem = new OrderItemModel(pizza, 0);
        invalidOrder.addOrderItem(invalidItem);

        processor.processOrder(invalidOrder);
        restaurantView.displayOrderDetails(invalidOrder);


        restaurantView.displayMessage("Test completed successfully.");
    }
}
