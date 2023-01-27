import observer.Calendar;
import observer.Event;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        Event event1 = new Event("Graduation Sofka");

        event1.addObserver(calendar);

        event1.notifyObserver();

        calendar.displayEvents();





    }
}