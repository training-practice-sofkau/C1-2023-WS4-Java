package singleton;

public class Printer {
    private static Printer instance;
    public String ink;

    private Printer (String ink){
        this.ink = ink;
    }

    public static Printer getInstance (String ink){
        if (instance == null){
            instance = new Printer(ink);
        }
        return instance;
    }

    public void print(){
        System.out.println("The printer is printing with ink: " + ink);
    }
}

