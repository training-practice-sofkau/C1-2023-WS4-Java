package strategy;

public class PaypalStrategy implements PayStrategy{
    String email;
    String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(Integer i) {
        System.out.println(i + " paid with Paypal");
    }
}