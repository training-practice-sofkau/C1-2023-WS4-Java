package observer;

import java.sql.Timestamp;

public interface Receiver {
    public void receiveEvent(Timestamp date, String name);
}
