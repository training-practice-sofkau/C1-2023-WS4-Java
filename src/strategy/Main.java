package strategy;

public class Main {
    public static void main(String[] args) {

    PaymentService paymentService = new PaymentService();

    System.out.println();
    paymentService.setCost(200);
    paymentService.setStrategy(new CreditCardStrategy());
    paymentService.processOrder();
    System.out.println();

    paymentService.setCost(460);
    paymentService.setStrategy(new PaypalStrategy());
    paymentService.processOrder();
    System.out.println();

    paymentService.setCost(600);
    paymentService.setStrategy(new BitcoinStrategy());
    paymentService.processOrder();
    System.out.println();
    }
}

