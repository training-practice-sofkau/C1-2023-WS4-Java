package observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EventManager implements Receive {

    private List<Event> events;
    private List<Calendar> calendars;


    public List<Event> getEvents() {
        return events;
    }

    public EventManager() {
        this.events = new ArrayList<>();
    }

    @Override
    public void receive(Event e) {
        events.add(e);
        emit();
    }

    @Override
    public void emit() {
        for(Event e:events){
            e.notifyObserver();
        }
    }


}
