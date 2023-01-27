package strategy;

public class CreditCardStrategy implements PaymentStrategy{
    @Override
    public boolean pay(double amount, String accountReference) {
        double paymentChance = (Math.random() * 10);
        if (paymentChance < 2) {
            System.out.println("Facture has been paid using a credit card\n-- $"+amount+"have been paid from your account");
            return true;
        }
        System.out.println("The payment has been rejected by your bank");
        return false;
    }
}
