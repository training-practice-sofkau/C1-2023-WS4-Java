package observer;

import java.util.ArrayList;

public class Event {
    private String name;

    private ArrayList<Calendar> calendars;

    public Event(String name) {
        this.name = name;
        this.calendars = new ArrayList<>();
    }


    //TO-DO: Add an observer
    public void addObserver(Calendar c){
        calendars.add(c);
    }


    //TO-DO: Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void notifyObserver(){
        for(Calendar c: calendars){
            c.updateEvent(this);
        }
    }
    //


}
