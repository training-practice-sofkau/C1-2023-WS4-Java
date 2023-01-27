package strategy;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The restaurant opens\nYou enter to the restaurant");
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your email address");
        String emailAddress = scanner.nextLine();
        System.out.println("What menu would you like to order?\n-- 1. Pizza($30.000)\n-- 2. Burger($25.000)\n-- 3.Burrito($15.000)\n-- 4.Salad($10.000)");
        int orderCost = 0;
        switch (scanner.nextLine().toLowerCase()) {
            case "pizza": {
                orderCost += 30000;
            }
            case "burger": {
                orderCost += 25000;
            }
            case "burrito": {
                orderCost += 15000;
            }
            case "salad": {
                orderCost += 10000;
            }
            default: {
                System.out.println("Invalid option, you got kicked out of the restaurant");
            }
        }
        Facture tempFacture = new Facture(name, emailAddress, orderCost);
        System.out.println("What method would you like to use for the payment?\n-- 1. Credit Card (type 1)\n-- 2. Bitcoin (type 2)\n-- 3. Paypal (type 3)");
        PaymentStrategy paymentStrategy;
        switch (scanner.nextLine().toLowerCase()) {
            case "1":{
                paymentStrategy = new CreditCardStrategy();
                System.out.println("You have selected the credit card payment method");
            }
            case "2":{
                paymentStrategy = new BitcoinStrategy();
                System.out.println("You have selected the Bitcoin payment method");
            }
            case "3":{
                paymentStrategy = new PaypalStrategy();
                System.out.println("You have selected the Paypal payment method");
            }
            default: {
                paymentStrategy = new CreditCardStrategy();
                System.out.println("You didn't selected a valid payment method so the credit card payment method has been automatically selected");
            }
        }
        tempFacture.setPaymentStrategy(paymentStrategy);
        System.out.println("To pay please enter your account reference");
        String accountReference = scanner.nextLine();

    }
}
