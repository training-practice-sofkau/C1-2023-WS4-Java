package adapter;


import adapter.controllers.OldControl;

public class Main {
    private static OldControl oldControl = new OldControl(5);

    public static void main(String[] args) {


        OldConsole oldConsole = new OldConsole();
        ModernConsoleAdapter modernConsole = new ModernConsoleAdapter();

        System.out.println();
        System.out.println("Old console with old controller test: ");
        oldConsole.readController(oldControl);

        System.out.println();
        System.out.println("Modern console with old controller test: ");
        modernConsole.readController(oldControl);
    }
}
