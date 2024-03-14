package design.patterns.creational.singleton;

public class ThreadSafeInit {
    private static ThreadSafeInit instance;

    private ThreadSafeInit() {
    }

    // this will reduce the performance because the cost of synchronized method
    public static synchronized ThreadSafeInit getInstance() {
        if (instance == null) {
            instance = new ThreadSafeInit();
        }
        return instance;
    }

    // This is cost effective. the synchronized block is used inside the if condition with
    // an additional check to ensure that only one instance of a singleton class is created
    public static ThreadSafeInit getInstanceUsingDoubleLocking() {
        if(instance == null) {
            synchronized (ThreadSafeInit.class) {
                if (instance == null) {
                    instance = new ThreadSafeInit();
                }
            }
        }
        return instance;
    }
}
