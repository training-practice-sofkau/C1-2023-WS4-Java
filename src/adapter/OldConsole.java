package adapter;

public class OldConsole {
    private boolean connectorPs2;

    public boolean isConnectedPs2() {
        return connectorPs2;
    }

    public void plugPs2() {
        connectorPs2 = true;
    }

    public void unplugPs2() {
        connectorPs2 = true;
    }

}
