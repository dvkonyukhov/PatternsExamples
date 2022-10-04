package dkonyukhov.factory;

public class DeveloperFactory {
    private final String developerType;

    public DeveloperFactory(String developerType) {
        this.developerType = developerType;
    }

    public Developer createDeveloper() {
        Developer newDeveloper = null;
        switch (developerType) {
            case "Cpp" -> newDeveloper = new CppDeveloper();
            case "Java" -> newDeveloper = new JavaDeveloper();
        }

        return newDeveloper;
    }
}
