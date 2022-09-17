package dkonyukhov.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void processEvent(List<String> messages) {
        System.out.println(name + " recieved messages: " + messages);
    }
}
