package strategy;

import java.util.Scanner;

public class CreditCardStrategy implements PayStrategy{



    @Override
    public void payment() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter card number: ");
        int cardNumber = s.nextInt();
        System.out.println("Enter expiration date 'mm/yy': ");
        String expirationDate = s.next();
        System.out.println("Enter security code: ");
        int securityCode = s.nextInt();
        //Credit Card details are validated
    }

    @Override
    public boolean status() {
        System.out.println("Credit card payment successful");
        return true;
    }
}
