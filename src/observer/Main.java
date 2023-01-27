package observer;

import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        Event event = new Event();

        Calendar calendar1 = new Calendar();
        Calendar calendar2 = new Calendar();

        event.addCalendar(calendar1);
        event.addCalendar(calendar2);

        event.emitEvent(new Timestamp(123, 6, 15, 0,0,0, 0), "Paulita");
        event.emitEvent(new Timestamp(123, 3, 20, 0,0,0, 0), "Isan");
        event.emitEvent(new Timestamp(123, 10, 11, 0,0,0, 0), "Larry");

        calendar1.showBirthdays();

    }
}
