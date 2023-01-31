package singleton;

public class Main {
    public static void main(String[] args) {
        Printer print = Printer.getInstance("value 1");
        Printer print1 = Printer.getInstance("value 2");
        Printer print2 = Printer.getInstance("value 3 ");
        Printer print3 = Printer.getInstance("value 4");
        print.print();
        System.out.println(print.getClass().equals(print1.getClass()));
        System.out.println(print.getClass().equals(print2.getClass()));
        System.out.println(print.getClass().equals(print3.getClass()));
    }
}
