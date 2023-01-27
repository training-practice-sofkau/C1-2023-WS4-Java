package strategy;

public class PaypalStrategy implements Strategy{

    public void pay (int amount) {
        System.out.println("The payment was charge using your Paypal wallet. The total was: " + amount);
    }

    @Override
    public String toString(){
        return "PaypalStrategy";
    }
}
