package strategy;

public class CreditCardStrategy implements PayStrategy{
    Integer number;
    String bank;
    String creditCardOwner;

    public CreditCardStrategy(Integer number, String bank, String creditCardOwner) {
        this.number = number;
        this.bank = bank;
        this.creditCardOwner = creditCardOwner;
    }

    @Override
    public void pay(Integer i) {
        System.out.println(i + " paid with Credit Card");
    }
}
