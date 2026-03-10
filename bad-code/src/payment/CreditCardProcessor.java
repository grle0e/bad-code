package payment;

public class CreditCardProcessor extends PaymentProcessor {

    @Override
    protected void validatePayment() {
        if (amount > 10000) {
            throw new RuntimeException("Credit card limit exceeded");
        }
    }

    @Override
    protected void authorize() {
        System.out.println("Credit card authorized");
    }

    @Override
    protected void capture() {
        System.out.println("Credit card captured");
    }
}