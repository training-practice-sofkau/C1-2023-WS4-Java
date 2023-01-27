package strategy;

public class Main {
    public static void main(String[] args) {

        PaymentStrategy creditCard = new CreditCardStrategy("Juan Guillermo", "74896552378", "855", "04/28");
        PaymentStrategy paypal = new PaypalStrategy("juan@sofka.com", "Sofkiano.2023");
        PaymentStrategy bitcoin = new BitcoinStrategy("1BNyGhyUrtvb78YhxDhTTT", "btcWallet.1569875");

        creditCard.pay(500);
        paypal.pay(400);
        bitcoin.pay(0.01);
    }
}

