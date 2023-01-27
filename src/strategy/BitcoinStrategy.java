package strategy;

class BitcoinStrategy implements PaymentStrategy {
    private String btcAddress;
    private String password;

    public BitcoinStrategy(String btcAddress, String password){
        this.btcAddress = btcAddress;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("You paid: " + amount + " Using Bitcoin");
    }
}
