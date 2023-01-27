package adapter;

import java.util.ArrayList;
import java.util.List;

public class ModernConsole {
    private List<ModernController> controllerInput;

    public ModernConsole() {
        this.controllerInput = new ArrayList<>();
    }

    public void addControllerInput(ModernController controllerInput) {
        System.out.println("Modern controller plugged!!");
        this.controllerInput.add(controllerInput);
    }

    public List<ModernController> getControllerInput() {
        return controllerInput;
    }
}
