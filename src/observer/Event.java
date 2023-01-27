package observer;

import java.util.ArrayList;

public class Event {
    private String name;
    private String location;
    private String startTime;
    private String endTime;

    private ArrayList<Calendar> calendars;

    public Event(String name, String location, String startTime, String endTime) {
        this.name = name;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.calendars = new ArrayList<>();
    }

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
