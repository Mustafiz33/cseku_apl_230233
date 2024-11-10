public class Main {

    public static void main(String[] args) {
        // Create a new restaurant instance
        Restaurant restaurant = new Restaurant("The Gourmet Place");

        // Create a few menu items
        MenuItem pizza = new MenuItem(1, "Pizza", 10.0, "Main Course");
        MenuItem burger = new MenuItem(2, "Burger", 5.5, "Main Course");
        MenuItem soda = new MenuItem(3, "Soda", 2.0, "Beverage");

        // Add the menu items to the restaurant's menu
        restaurant.getMenu().addMenuItem(pizza);
        restaurant.getMenu().addMenuItem(burger);
        restaurant.getMenu().addMenuItem(soda);

        // Display the available menu items
        System.out.println("Menu items available in the restaurant:");
        for (MenuItem item : restaurant.getMenu().getMenuItems()) {
            System.out.println(item.getDetails() + " - Price: $" + item.getPrice());
        }

        // Create a customer
        Customer customer = new Customer(1, "John Doe", "john.doe@example.com");

        // Create an order for the customer
        Order order = new Order(101, customer);

        // Add items to the order
        order.addOrderItem(new OrderItem(pizza, 2));  // 2 Pizzas
        order.addOrderItem(new OrderItem(burger, 1)); // 1 Burger
        order.addOrderItem(new OrderItem(soda, 3));   // 3 Sodas

        // Display the total price of the order
        System.out.println("Total order cost: $" + order.calculateTotal());

        // Create a payment method (e.g., credit card payment)
        Payment payment = new CreditCardPayment("1234567890123456", "John Doe", "12/25");

        // Process the payment for the order
        payment.processPayment(order.calculateTotal());

        // Update the order status to 'Completed'
        order.updateStatus(OrderStatus.COMPLETED);
        System.out.println("Order status updated to: " + order.getStatus());

        // Add the order to the restaurant's order list
        restaurant.addOrder(order);

        // Display all orders
        System.out.println("\nList of all orders in the restaurant:");
        for (Order o : restaurant.getOrders()) {
            System.out.println("Order ID: " + o.getOrderId() + " | Customer: " + o.getCustomer().getName() +
                    " | Status: " + o.getStatus());
        }
    }
}
