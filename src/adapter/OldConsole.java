package adapter;

import adapter.controllers.ModernControl;
import adapter.controllers.OldControl;

public class OldConsole implements Controllable {

    @Override
    public void readController(OldControl oldCont) {
        System.out.println("Now you can play");
    }

}
