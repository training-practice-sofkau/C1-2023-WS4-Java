package observer;

public class Main {

    public static void main(String[] args) {

        Event e1= new Event("prueba");
        Event e2= new Event("prueba2");
        Event e3= new Event("prueba3");

        EventManager eventMa1= new EventManager();

        Calendar c1=new Calendar();
        Calendar c2=new Calendar();

        e1.addObserver(c1);
        e2.addObserver(c2);
        e3.addObserver(c2);

        eventMa1.recive(e1);
        eventMa1.recive(e2);
        eventMa1.recive(e3);


        c1.displayEvents();
        c2.displayEvents();




    }

}
