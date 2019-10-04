package pattern.creational.factorymethod;

public class FEVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new FEVideo();
    }
}
