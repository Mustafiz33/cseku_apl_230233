package model;

public class CashPaymentModel implements PaymentModel {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}
