package adapter2;

public class FromOldToNew implements Adapter{
    OldConsole oldConsole;

    //ModernComputer modernComputer;

    public FromOldToNew(OldConsole oldConsole) {
        this.oldConsole = oldConsole;
        //this.modernComputer = modernComputer;
    }

    @Override
    public String getModernPcController() {
        // you can do all the transformation steps if you need it.
        return  this.oldConsole.getOldConsoleController() + " looks like a pc Controller";
    }

}
