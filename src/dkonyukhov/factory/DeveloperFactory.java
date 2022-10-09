package dkonyukhov.factory;

public class DeveloperFactory {
    private final DeveloperType developerType;

    public DeveloperFactory(DeveloperType developerType) {
        this.developerType = developerType;
    }

    public Developer createDeveloper() {
        Developer newDeveloper = null;
        switch (developerType) {
            case CPP -> newDeveloper = new CppDeveloper();
            case JAVA -> newDeveloper = new JavaDeveloper();
        }

        return newDeveloper;
    }
}
