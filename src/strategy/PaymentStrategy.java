package strategy;

public class PaymentStrategy {
    private Strategy strategy;

    public void processPayment(Strategy strategy, int amount){
        strategy.pay(amount);
    }
}
