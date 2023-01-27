package strategy;

import java.util.Scanner;

public class PaypalStrategy implements PayStrategy{


    @Override
    public void payment() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Paypal email: ");
        String email = s.nextLine();
        System.out.println("Enter Paypal password: ");
        String password = s.nextLine();

    }

    @Override
    public boolean status() {
        System.out.println("Paypal payment successful");
        return true;
    }
}
