package payment;

public class PayPalProcessor extends PaymentProcessor {

    @Override
    protected void validatePayment() {
        if (!currency.equals("USD")) {
            throw new RuntimeException("PayPal supports only USD");
        }
    }

    @Override
    protected void authorize() {
        System.out.println("PayPal authorized");
    }

    @Override
    protected void capture() {
        System.out.println("PayPal captured");
    }
}