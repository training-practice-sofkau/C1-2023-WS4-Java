package singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Printer printer1 = Printer.getInstance();
        Printer printer2 = Printer.getInstance();

        printer1.print("Here's the printer number one");
        printer2.print("Here's the printer number two");
        System.out.println();

        System.out.println("Do we have the same reference? " + (printer1 == printer2));
    }
}
