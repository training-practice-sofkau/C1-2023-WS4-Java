package observer;

public class Main {
    public static void main(String[] args) {

        //Calendar myCalendar = new Calendar();

        //myCalendar.addEvent(new Event("Sofka Grades", "28/03/2023", "28/03/2023"));
        Event event1 = new Event("Graduation","today","tomorrow");
        //Event event1 = new Event("Graduation", "Today", "Tomorrow");
        event1.getNotificationService().addObserver(new Calendar("Julian@gmail.com"), event1);
        event1.getNotificationService().addObserver(new Calendar("Juan@gmail.com"), event1);
        System.out.println(event1.getNotificationService().getObservers());


        event1.setName("Change event name");
        event1.setEndTime("Next month");




    }
}
