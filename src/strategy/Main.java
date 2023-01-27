package strategy;

public class Main {
    public static void main(String[] args) {

    PaymentService paymentService = new PaymentService();

    paymentService.setCost(200);
    paymentService.setStrategy(new CreditCardStrategy());
    paymentService.processOrder();

    paymentService.setCost(460);
    paymentService.setStrategy(new PaypalStrategy());
    paymentService.processOrder();

    paymentService.setCost(600);
    paymentService.setStrategy(new BitcoinStrategy());
    paymentService.processOrder();

    }
}

