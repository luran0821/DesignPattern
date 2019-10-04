package pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
       VideoFactory videoFactory = new PythonVideoFactory();
       Video video = videoFactory.getVideo();
       video.produce();
    }
}
