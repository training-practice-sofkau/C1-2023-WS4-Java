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

    public void printFacture(String order) {
        System.out.println("------------------------------------------");
        System.out.println("---------------your Facture---------------");
        System.out.println("------------------------------------------");
        System.out.println("---Name: "+this.clientName);
        System.out.println("---Email Address: "+this.clientEmailAddress);
        System.out.println("------------------------------------------");
        System.out.println("---Order:");
        System.out.println("------*"+order+"     "+this.amount);
        System.out.println("---Total Price: "+this.amount);
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
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
