package design.patterns.creational.singleton;

public class StaticBlockInit {
    private static StaticBlockInit instance;

    private StaticBlockInit() {
    }

    static {
        try {
            instance = new StaticBlockInit();
        } catch (Exception exception) {
            throw new RuntimeException("Exception occurred in creating static singleton");
        }
    }

    public static StaticBlockInit getInstance() {
        return instance;
    }
}
