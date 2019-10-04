package pattern.structural.adapter.objectadapter;

public class ConcreateTarget implements Target {
    public void request() {
        System.out.println("ConcreateTarget目标方法");
    }
}
