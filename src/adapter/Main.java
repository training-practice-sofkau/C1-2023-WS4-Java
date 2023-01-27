package adapter;

public class Main {
    public static void main(String[] args) {
        Connectable pc1 = new ModernComputer();
        pc1.plugPc();
        System.out.println(pc1.isConnectedPc());

        Connectable old1 = new AdapterConnectable();
        old1.plugPc();
        System.out.println(old1.isConnectedPc());



        AdapterConnectable adpter = new AdapterConnectable();


    }
}
