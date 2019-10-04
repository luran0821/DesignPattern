package pattern.structural.adapter.classadapter;

public class ConcreateTarget implements Target {
    public void request() {
        System.out.println("ConcreateTarget目标方法");
    }
}
