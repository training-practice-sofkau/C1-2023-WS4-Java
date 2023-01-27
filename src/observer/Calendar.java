package observer;


import java.sql.Timestamp;
import java.util.Map;
import java.util.TreeMap;

public class Calendar implements Receiver{

    Map<Timestamp, String> birthdays = new TreeMap<>();

    @Override
    public void receiveEvent(Timestamp date, String name){
        birthdays.put(date, name);
    }

    public void showBirthdays(){
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Birthdays registered:");
        System.out.println("---------------------");
        birthdays.forEach((date, name) -> System.out.println(name + " birthday is in: " +date));
    }
}
