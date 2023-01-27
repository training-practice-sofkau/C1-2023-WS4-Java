package singleton;

import java.util.Scanner;

public class MainSingleton {
    public static void main(String[] args) {

        Scanner inkInput = new Scanner(System.in);
        System.out.println("Type the ink you will use: (BW/COLOR) ");
        String ink1 = inkInput.nextLine();

        Printer printer = Printer.getInstance(ink1);
        printer.print();

        System.out.println("Want to create a new printer? Type the ink again: (BW/COLOR) ");
        String ink2 = inkInput.nextLine();

        Printer printer2 = Printer.getInstance(ink2);
        printer2.print();
        if (printer2.ink != ink2){
        System.out.println("Sorry, you're not allowed to create a new printer," +
                " so your should use the previous one, with ink: " + printer.ink);
        }
        else {
            System.out.println("The Singleton implementation, is not working, let me check... jaja");
        }
    }
}
