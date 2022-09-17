package dkonyukhov.strategy;

public class Person {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void doActivity() {
        activity.doIt();
    }
}
