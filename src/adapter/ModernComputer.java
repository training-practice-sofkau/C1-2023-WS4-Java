package adapter;

public class ModernComputer implements Connectable{
    private boolean connectorPc;

    public boolean isConnectedPc() {
        return connectorPc;
    }

    @Override
    public void plugPc() {
        connectorPc = true;
    }

    @Override
    public void unplugPc() {
        connectorPc = true;
    }


}
