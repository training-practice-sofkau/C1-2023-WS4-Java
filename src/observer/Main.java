package observer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Event e1= new Event("prueba");
        Event e2= new Event("prueba2");
        Event e3= new Event("prueba3");
        Event e4= new Event("Cinema at 3 pm");

        EventManager eventMa1= new EventManager();

        Calendar c1=new Calendar();
        Calendar c2=new Calendar();
        Calendar c3=new Calendar();

        //Adding observers to event
        e1.addObserver(c1);
        e2.addObserver(c2);
        e3.addObserver(c2);
        e3.addObserver(c3);
        e4.addObserver(c3);

        //Propagate changes
        eventMa1.receive(e1);
        eventMa1.receive(e2);
        eventMa1.receive(e3);
        eventMa1.receive(e4);


        //Show calendars
        c1.displayEvents();
        c2.displayEvents();
        c3.displayEvents();




    }

}
