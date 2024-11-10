public class CreditCardPayment implements Payment {
    private String cardNumber; // Credit card number
    private String cardHolderName; // Name of the cardholder
    private String expiryDate; // Expiry date of the card

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate) {
        // Constructor to initialize credit card payment details
    }

    @Override
    public void processPayment(double amount) {
        // Processes payment using the credit card
    }
}
