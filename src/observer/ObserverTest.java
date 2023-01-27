package observer;

import java.util.Scanner;

public class ObserverTest {
    static Scanner inputNumber = new Scanner(System.in);
    static Scanner inputText = new Scanner(System.in);
    static Notifier notifier = new Notifier();
    public static void main(String[] args) {


        Event event1 = new Event("Wedding","Bogota","15:00","16:00");
        Event event2 = new Event("MasterClass","GoogleMeet","08:30","10:00");
        Event event3 = new Event("Assessment","GoogleMeet","17:45","18:00");
        Event event4 = new Event("Launch","Mall","12:00","14:00");
        notifier.addEvents(event1);
        notifier.addEvents(event2);
        notifier.addEvents(event3);
        notifier.addEvents(event4);

        int op = 0;
        do{
            System.out.println("""
--Choose an option--
1. Create a new Event
2. Create a new Calendar
3. Add event to calendar
4. See al the events
        """);
            op = inputNumber.nextInt();
            switch (op) {
                case 1 -> createEvent();
                case 2 -> createObserver();
                case 3 -> notifier.addEventToCalendar();
                case 4 -> notifier.showEvents();
                case 5 -> System.out.println("--Closing program--");
                default -> System.out.println("Wrong option");
            }

        }while (op != 5);
    }
    public static void createEvent(){
        System.out.println("Enter the event name: ");
        String name = inputText.nextLine();
        System.out.println("Enter the event location: ");
        String location = inputText.nextLine();
        System.out.println("Enter the event start hour: ");
        String startHour = inputText.nextLine();
        System.out.println("Enter the event finish hour: ");
        String endHour = inputText.nextLine();
        Event event = new Event(name,location,startHour, endHour);
        notifier.addEvents(event);
        System.out.println("--Event created successfully--");
    }

    public static void createObserver(){
        System.out.println("Enter the Observer name: ");
        String name = inputText.nextLine();
        Observer observer = new Observer(name);
        notifier.addCalendar(observer);
        System.out.println("--Observer created successfully--");
    }

}
