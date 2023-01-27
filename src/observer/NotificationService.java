package observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<Calendar> observers;

    public NotificationService() {

        this.observers = new ArrayList<>();
    }

    public void addObserver(Calendar listener,Event event) {

        this.observers.add(listener);
        listener.addEvent(event);
    }

    public void removeObserver(Calendar listener) {
        this.observers.remove(listener);
    }

    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
        }

    public List<Calendar> getObservers() {
        return observers;
    }
}
