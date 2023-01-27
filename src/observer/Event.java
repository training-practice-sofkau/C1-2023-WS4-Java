package observer;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Event {

    private List<Receiver> calendars = new ArrayList<>();

    public void addCalendar(Receiver calendar){
        this.calendars.add(calendar);
    }

    public void emitEvent(Timestamp date, String name){
        for (Receiver calendar : calendars){
            calendar.receiveEvent(date, name);
        }
        System.out.println("Calendar updated");
    }
}
