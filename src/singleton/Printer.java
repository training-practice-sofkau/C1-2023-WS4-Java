package singleton;

public class Printer {
    private static Printer instance;
    public Printer(){

    }

    public static Printer getInstance(){
        if(instance == null){
            instance = new Printer();
        }
        return instance;
    }

    public void print(String msg){
        System.out.println(msg);
    }
}
