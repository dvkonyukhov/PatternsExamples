package dkonyukhov.strategy;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();

        person.setActivity(new Playing());
        person.doActivity();

        person.setActivity(new Working());
        person.doActivity();

        person.setActivity(new Sleeping());
        person.doActivity();
    }
}
