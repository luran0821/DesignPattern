package pattern.structural.adapter.objectadapter;

public class Test {
    public static void main(String[] args) {

        Target target = new ConcreateTarget();
        target.request();

        Target adaptertarget = new Adapter();
        adaptertarget.request();
    }
}
