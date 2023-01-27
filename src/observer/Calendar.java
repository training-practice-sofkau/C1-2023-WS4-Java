package observer;

import java.util.ArrayList;

public class Calendar {
    private ArrayList<Event> events;

    public Calendar(){
        events = new ArrayList<>();
    }

    //
    public void addEvent(Event e){
        events.add(e);

    }

    public void updateEvent(Event e){
        if(!events.contains(e)){
            addEvent(e);
        }
    }

    public void displayEvents(){
        for(Event e: events){
            System.out.println("Event: "+e.getName());

        }
        System.out.println();
    }
}
