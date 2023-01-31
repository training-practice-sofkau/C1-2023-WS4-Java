package adapter;

public class Main {
    public static void main(String[] args) {
        Connectable pc1 = new ModernComputer();
        pc1.plugPc();
        System.out.println(pc1.isConnectedPc());

        OldConsole old1 = new OldConsole();
        old1.plugPs2();
        System.out.println(old1.isConnectedPs2());

        AdapterConnectable adapterOld1 = new AdapterConnectable(old1);
        adapterOld1.plugPc();
        System.out.println(adapterOld1.isConnectedPc());
    }
}
