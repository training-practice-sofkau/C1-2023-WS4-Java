package observer;

import java.util.ArrayList;
import java.util.List;

class Calendar {
    private List<Event> events;
    private String email;

    public Calendar(String email) {

        this.events = new ArrayList<>();
        this.email = email;

    }

    public void addEvent(Event event) {
        this.events.add(event);

    }

    public void removeEvent(Event event) {
        this.events.remove(event);

    }

    public void update(String message) {
        System.out.println(message);
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "email=" + email +
                ", events='" + events + '\'' +
                '}';
    }
}
