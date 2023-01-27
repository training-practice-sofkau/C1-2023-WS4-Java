package singleton;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = Printer.getInstance();
        Printer printer2 = Printer.getInstance();

        printer1.print("I´m a printer");
        printer2.print("I´m the same printer");
        printer2.print("If you dont believe us, look at our memory reference:");
        System.out.println("Printer1:" + printer1);
        System.out.println("Printer2:" + printer2);

    }
}
