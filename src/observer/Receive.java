package observer;

import java.util.List;

public interface Receive {

    void receive(Event e);

    void emit();
}
