package observer;

public class Main {
    public static void main(String[] args) {

        Event event1 = new Event("Graduation","today","tomorrow");

        event1.getNotificationService().addObserver(new Calendar("Julian@gmail.com"), event1);
        event1.getNotificationService().addObserver(new Calendar("Juan@gmail.com"), event1);
        System.out.println(event1.getNotificationService().getObservers());


        event1.setName("Change event name");
        event1.setEndTime("Next month");
    }
}
