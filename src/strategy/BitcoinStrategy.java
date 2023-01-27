package strategy;

class BitcoinStrategy implements PaymentStrategy {
    private String btcAddress;
    private String password;


    @Override
    public void collectPaymentDetails() {
        btcAddress = "btcAddress";
        password = "password";
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(double amount) {
        System.out.println("You paid: " + amount + " Using Bitcoin");
    }
}
