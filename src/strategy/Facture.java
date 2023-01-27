package strategy;

public class Facture {
    private final String clientName;
    private final String clientEmailAddress;
    private final double amount;
    private boolean isCanceled;
    private PaymentStrategy paymentStrategy;

    public Facture(String clientName, String clientEmailAddress, double amount) {
        this.clientName = clientName;
        this.clientEmailAddress = clientEmailAddress;
        this.amount = amount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void cancelFacture(String accountReference) {
        this.isCanceled = paymentStrategy.pay(this.amount, accountReference);
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientEmailAddress() {
        return clientEmailAddress;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isCanceled() {
        return isCanceled;
    }
}
