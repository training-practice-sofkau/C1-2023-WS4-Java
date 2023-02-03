package singleton;

public class Printer {
    private static Printer instance;
    public String value;

    private Printer(String value){
        this.value = value;
    }

    public static Printer getInstance(String value){
        if(instance == null){
            instance = new Printer(value);
        }
        return instance;
    }

    public void print(){
        System.out.println(value);
    }
}
