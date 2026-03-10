package payment;

public abstract class PaymentProcessor {

    protected double amount;
    protected String currency;
    protected String customerId;

    public final void processPayment(double amount, String currency, String customerId) {
        this.amount = amount;
        this.currency = currency;
        this.customerId = customerId;

        validatePayment();
        authorize();
        capture();
        sendReceipt();
        logTransaction();
    }

    protected abstract void validatePayment();
    protected abstract void authorize();
    protected abstract void capture();

    protected void sendReceipt() {
        System.out.println("Receipt sent to " + customerId);
    }

    private void logTransaction() {
        System.out.println("Logged to database: " + amount);
    }
}