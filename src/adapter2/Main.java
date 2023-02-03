package adapter2;

public class Main {
    public static void main (String[] args){
        OldConsole play1 = new OldConsole();
        play1.setOldConsoleController("Ps1 Controller");

        System.out.println("Your old controller is: " + play1.getOldConsoleController());

        ModernComputer modernPc = new ModernComputer();
        modernPc.setModernPcController("Pc Controller");

        System.out.println("Your pc controller is: " + modernPc.getModernPcController());

        Adapter adaptador = new FromOldToNew(play1);
        //System.out.println(adaptador.getModernPcController());
        System.out.println(modernPc.setModernPcController(adaptador.getModernPcController()));

        System.out.println("Your pc controller is: " + modernPc.getModernPcController());
    }
}
