package payment;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor processor = new CreditCardProcessor();
        processor.processPayment(5000, "USD", "cust123");

        processor = new PayPalProcessor();
        processor.processPayment(3000, "USD", "cust456");
    }
}