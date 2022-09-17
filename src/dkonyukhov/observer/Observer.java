package dkonyukhov.observer;

import java.util.List;

public interface Observer {
    void processEvent(List<String> messages);
}
