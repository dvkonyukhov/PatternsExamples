package dkonyukhov.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagesGenerator implements Observed {
    List<String> messages = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public void addMessage(String message){
        messages.add(message);
        notifyObservers();
    }

    public void removeMessage(String message){
        messages.remove(message);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void reoveObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers
             ) {
            observer.processEvent(messages);
        }
    }
}
