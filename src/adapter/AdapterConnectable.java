package adapter;

public class AdapterConnectable implements Connectable{
    private  OldConsole plug;

    public AdapterConnectable(OldConsole plug) {
        this.plug = plug;
    }

    @Override
    public boolean isConnectedPc() {
        return plug.isConnectedPs2();
    }

    @Override
    public void plugPc() {
        plug.plugPs2();
    }

    @Override
    public void unplugPc() {
        plug.unplugPs2();
    }
}
