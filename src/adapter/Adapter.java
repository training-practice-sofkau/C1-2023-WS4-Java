package adapter;

import adapter.controllers.ModernControl;
import adapter.controllers.OldControl;

public class Adapter {
    private static ModernControl modernControl = new ModernControl(10);
    private static OldControl oldControl = new OldControl(5);

    public static void main(String[] args) {
        OldConsole oldConsole = new OldConsole();
        //ModernConsole modernConsole = new ModernConsole();
        ModernConsoleAdapter moderConsole = new ModernConsoleAdapter();

        System.out.println("Old console with old controller test: ");
        oldConsole.readController(oldControl);

        System.out.println("Modern console with old controller test: ");
        //modernConsole.play();
        moderConsole.readController(oldControl);
    }
}
