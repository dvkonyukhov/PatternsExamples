package dkonyukhov.decorator;

public abstract class DeveloperDecorator implements Developer{
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }
}
