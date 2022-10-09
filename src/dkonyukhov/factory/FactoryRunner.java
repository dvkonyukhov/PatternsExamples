package dkonyukhov.factory;

public class FactoryRunner {

    public static void main(String[] args) {

        Developer developerJava = new DeveloperFactory(DeveloperType.JAVA).createDeveloper();
        Developer developerCpp = new DeveloperFactory(DeveloperType.CPP).createDeveloper();

        System.out.println(developerJava.makeJob());
        System.out.println(developerCpp.makeJob());
    }

}
