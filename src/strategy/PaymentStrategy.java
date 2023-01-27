package strategy;

public interface PaymentStrategy {
    boolean pay(double amount, String accountReference);
}
