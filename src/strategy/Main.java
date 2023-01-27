package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int exit = 0;
        Scanner s = new Scanner(System.in);
        while (exit == 0) {
            System.out.println("Please enter your method for payment");
            System.out.println("1. Paypal");
            System.out.println("2. Credit Card");
            System.out.println("3. Bitcoin");
            System.out.println("4. Exit");
            int option = s.nextInt();
            PayStrategy strategy;
            switch (option) {
                case 1:
                    strategy = new PaypalStrategy();
                    strategy.payment();
                    if (strategy.status()){exit = 1;}
                    break;


                case 2:
                    strategy = new CreditCardStrategy();
                    strategy.payment();
                    if (strategy.status()){exit = 1;}
                    break;


                case 3:
                    strategy = new BitcoinStrategy();
                    strategy.payment();
                    if (strategy.status()){exit = 1;}
                    break;


                case 4:
                    exit = 1;
                    break;

            }
        }
    }
}
