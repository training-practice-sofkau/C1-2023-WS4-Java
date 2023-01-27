package adapter;

public class OlderConsoleAdapter {
    private OlderController olderController;

    public OlderConsoleAdapter(OlderController olderController){
        this.olderController = olderController;
    }

    public ModernController getController() {
        return new ModernController(
                olderController.getLTrigger(),
                olderController.getRTrigger(),
                olderController.getDirection(),
                olderController.isA(),
                olderController.isB(),
                olderController.isX(),
                olderController.isY()
        );
    }


}
