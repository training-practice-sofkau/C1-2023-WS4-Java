package strategy;

public class BitcoinStrategy implements PayStrategy{
    String email;
    String user;

    public BitcoinStrategy(String email, String user) {
        this.email = email;
        this.user = user;
    }

    @Override
    public void pay(Integer i) {
        System.out.println(i + " paid with Bitcoin");
    }
}
