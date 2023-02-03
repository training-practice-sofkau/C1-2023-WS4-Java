package adapter2;

public class ModernComputer implements Adapter{
    String modernPcController;

    @Override
    public String getModernPcController() {
        return this.modernPcController;
    }


    public String setModernPcController(String modernController) {
        return this.modernPcController = modernController;
    }

}
