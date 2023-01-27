package strategy;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BitcoinStrategy implements PayStrategy{
    @Override
    public void payment() {
        Scanner s = new Scanner(System.in);
        System.out.println("Connecting to wallet...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Wallet connected");
        try {
            System.out.println("Sign transaction...");
            while (s.nextLine().length() != 0) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        } finally {

        }
    }

    @Override
    public boolean status() {
        System.out.println("Bitcoin payment successful");
        return true;
    }
}
