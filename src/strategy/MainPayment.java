package strategy;

import java.util.Scanner;
import java.util.*;

public class MainPayment {
    private static PaymentStrategy paymentManager = new PaymentStrategy();
    private static int amount;
    private static Strategy paymentMethod;
    public static void main(String[] args) {
        amount = paymentAmount();
        paymentMethod = paymentMethod();

        paymentManager.processPayment(paymentMethod, amount);
        
    }


    private static Strategy paymentMethod(){
        Scanner pmInp = new Scanner(System.in);
        System.out.println("Select the method you prefer to make the payment:\n" +
                "1. Credit Card.\n" +
                "2. Paypal\n" +
                "3. Bitcoin\n");
        String paymentSelection = pmInp.nextLine();
        Strategy paymentMethod;
        switch (paymentSelection){
            case "1":
                paymentMethod = new CreditCardStrategy();
                break;
            case "2":
                paymentMethod = new PaypalStrategy();
                break;
            case "3":
                paymentMethod = new BitcoinStrategy();
                break;
            default:
                paymentMethod = null;
        }
        return paymentMethod;
    }

    private static int paymentAmount(){
        Scanner pmAmo = new Scanner(System.in);
        System.out.println("Enter the amount to pay: ");
        int paymentAmount = Integer.parseInt(pmAmo.nextLine());

        return paymentAmount;
    }
}
