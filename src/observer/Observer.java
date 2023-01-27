package observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private ArrayList<Event> events;
    private String name;

    public Observer(String name){
        this.name = name;
        this.events = new ArrayList<>();
    }

    //
    public void addEvent(Event e){
        if(!this.events.contains(e)){
            this.events.add(e);
        }else {
            System.out.println("This calendar is already subscribed to that event");
        }

    }

    public void updateEvent(Event e){
        if(!this.events.contains(e)){
            addEvent(e);
        }
    }


    public List<Event> displayEvents(){
        return this.events;
    }

    @Override
    public String toString() {
        return "Observer{ " +
                "name='" + name + '\'' +
                " }";
    }
}
