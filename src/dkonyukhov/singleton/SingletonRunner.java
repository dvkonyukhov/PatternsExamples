package dkonyukhov.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(LoggerSingleton.getSingleton());
        }
    }
}
