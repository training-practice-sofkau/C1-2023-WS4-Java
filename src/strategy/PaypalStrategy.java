package strategy;

class PaypalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        email = "...";
        password = "...";
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(double amount) {
        System.out.println("You paid: " + amount + " Using Paypal");
    }
}