package strategy;

public class Main {
    public static void main (String[] args){
        ShoppinCart shoppinCart = new ShoppinCart();
        
        shoppinCart.payBy(new BitcoinStrategy("difs@gmail.com", "123"), 5874311);
        shoppinCart.payBy(new CreditCardStrategy(128745632, "Pichincha", "Fabio"), 5874311);
        shoppinCart.payBy(new PaypalStrategy("email@gmail.com","123"), 5874311);
    }
}
