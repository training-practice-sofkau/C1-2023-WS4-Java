package strategy;

public class PaypalStrategy implements PaymentStrategy{
    @Override
    public boolean pay(double amount, String accountReference) {
        double paymentChance = (Math.random() * 10);
        if (paymentChance < 5) {
            System.out.println("Facture has been paid using PayPal\n-- $"+amount+" have been paid from your account");
            return true;
        }
        System.out.println("The payment has been rejected by the PayPal system");
        return false;
    }
}
