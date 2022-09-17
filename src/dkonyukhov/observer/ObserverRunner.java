package dkonyukhov.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        MessagesGenerator messagesGenerator = new MessagesGenerator();
        messagesGenerator.addMessage("message 1");

        Subscriber subscriber1 = new Subscriber("subscriber1");
        Subscriber subscriber2 = new Subscriber("subscriber2");

        messagesGenerator.addObserver(subscriber1);

        messagesGenerator.addMessage("message 2");

        messagesGenerator.addObserver(subscriber2);

        messagesGenerator.addMessage("message 3");

        messagesGenerator.removeMessage("message 1");

        messagesGenerator.reoveObserver(subscriber1);

        messagesGenerator.addMessage("message 4");
    }
}
