package strategy;

public class ShoppinCart {

    public void payBy(PayStrategy payStrategy, Integer integer) {
        payStrategy.pay(integer);
    }
}