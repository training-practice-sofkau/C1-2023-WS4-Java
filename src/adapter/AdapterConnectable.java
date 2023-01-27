package adapter;

public class AdapterConnectable implements Connectable{

    private OldConsole console = new OldConsole();


    @Override
    public boolean isConnectedPc() {
        return console.isConnectedPs2();
    }

    @Override
    public void plugPc() {
        console.plugPs2();
    }

    @Override
    public void unplugPc() {
        console.unplugPs2();
    }
}
