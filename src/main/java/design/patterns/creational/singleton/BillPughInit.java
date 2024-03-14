package design.patterns.creational.singleton;

public class BillPughInit {

    private BillPughInit() {}

    private static class SingltonHelper {
        private static final BillPughInit INSTANCE = new BillPughInit();
    }

    public static BillPughInit getInstance() {
        return SingltonHelper.INSTANCE;
    }
}
