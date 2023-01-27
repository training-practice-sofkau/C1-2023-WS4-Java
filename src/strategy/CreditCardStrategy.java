package strategy;

public class CreditCardStrategy implements Strategy {

    @Override
    public void pay (int amount) {
        System.out.println("The payment was charge to your Credit Card. The total was: " + amount);
    }

    @Override
    public String toString(){
        return "CreditCardStrategy";
    }
}
