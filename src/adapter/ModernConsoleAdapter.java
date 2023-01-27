package adapter;

import adapter.controllers.ModernControl;
import adapter.controllers.OldControl;

public class ModernConsoleAdapter implements Controllable{

    private final ModernConsole modernConsole = new ModernConsole();

    @Override
    public void readController(OldControl oldControl) {
        ModernControl modernControl = convertOldContToModernCont(oldControl);
        modernConsole.play(modernControl);
    }

    private ModernControl convertOldContToModernCont(OldControl oldCont){
        return new ModernControl(oldCont.getButton()*2);
    }
}
