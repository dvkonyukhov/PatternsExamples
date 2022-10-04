package dkonyukhov.factory;

public class FactoryRunner {

    public static void main(String[] args) {

        Developer developerJava = new DeveloperFactory("Java").createDeveloper();
        Developer developerCpp = new DeveloperFactory("Cpp").createDeveloper();

        System.out.println(developerJava.makeJob());
        System.out.println(developerCpp.makeJob());
    }

}
