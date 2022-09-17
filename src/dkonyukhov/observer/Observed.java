package dkonyukhov.observer;

public interface Observed {
    void addObserver(Observer observer);

    void reoveObserver(Observer observer);

    void notifyObservers();
}
