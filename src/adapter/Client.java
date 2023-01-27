package adapter;

public class Client {
    public static void main(String[] args) {
        ModernConsole console = new ModernConsole();

        ModernController modernController = new ModernController(
                0.9,
                0.0,
                0.1,
                true,
                false,
                false,
                false
        );

        console.addControllerInput(modernController);
        //console.getControllerInput().forEach(ModernController::getAnaloginput);

        OlderController olderController = new OlderController(
                1,
                0,
                1,
                false,
                false,
                false,
                true
        );
        //console.setControllerInput(olderController); wont work

        OlderConsoleAdapter olderConsoleAdapter = new OlderConsoleAdapter(olderController);
        console.addControllerInput(olderConsoleAdapter.getController());

        console.getControllerInput().forEach(ModernController::getAnaloginput);
    }
}
