package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notifier {
    Scanner inNumber = new Scanner(System.in);
    private List<Event> events;
    private List<Observer> calendars;

    public Notifier() {
        this.events = new ArrayList<>();
        this.calendars = new ArrayList<>();
    }

    public void addEvents(Event event) {
        this.events.add(event);
    }

    public void addCalendar(Observer cal) {
        showEvents();
        cal.addEvent(this.events.get(inNumber.nextInt()));
        this.calendars.add(cal);
    }

    public void addEventToCalendar(){
        showCalendars();
        Observer cal = this.calendars.get(inNumber.nextInt());
        showEvents();
        Event event = this.events.get(inNumber.nextInt());
        cal.addEvent(event);
        nofifyObserver(cal,event);
    }

    public void showEvents(){
        System.out.println("Which event you want to subscribe?: ");
        if(this.events.size() != 0){
            for (int i = 0; i < this.events.size(); i++) {
                System.out.println(i + ". Event: " + this.events.get(i));
            }
        }else {
            System.out.println("Event list is empty");
        }
    }

    public void showCalendars(){
        System.out.println("Which Calendar you want add a subscription?: ");
        if(this.calendars.size() != 0){
            for (int i = 0; i < this.calendars.size(); i++) {
                System.out.println(i + ". Calendar: " + this.calendars.get(i));
            }
        }else{
            System.out.println("Calendar list is empty");
        }
    }

    public void nofifyObserver(Observer observer,Event event){
        System.out.println("The calendar");
    }


}
