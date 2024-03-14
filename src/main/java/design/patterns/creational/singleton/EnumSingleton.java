package design.patterns.creational.singleton;

public enum EnumSingleton {

    INSTANCE;

    //Java ensures that any enum value is instantiated only once in a Java program
    public static void doSomethingFromSingleton() {
        //do the Singleton behaviour here
    }
}
