package observer;

import java.util.ArrayList;

public class Observer {
    private ArrayList<Event> events;
    private String name;

    public Observer(String name){
        this.name = name;
        this.events = new ArrayList<>();
    }

    //
    public void addEvent(Event e){
        this.events.add(e);

    }

    public void updateEvent(Event e){
        if(!this.events.contains(e)){
            addEvent(e);
        }
    }

    public void getNofification(String noti){
        System.out.println("You have a new");
    }

    public void displayEvents(){
        System.out.println("Events: "+this.events.toString());
    }
}
