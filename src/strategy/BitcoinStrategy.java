package strategy;

public class BitcoinStrategy implements Strategy {

    public void pay (int amount) {
        System.out.println("The payment was charge using your Bitcoin wallet. The total was: " + amount);
    }

    @Override
    public String toString(){
        return "BitcoinStrategy";
    }
}
