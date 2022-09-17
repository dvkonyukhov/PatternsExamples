package dkonyukhov.strategy;

public class Sleeping implements Activity{
    @Override
    public void doIt() {
        System.out.println("Sleeping");
    }
}
