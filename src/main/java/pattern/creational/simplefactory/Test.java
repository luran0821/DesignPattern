package pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
       /* VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("python");
        video.produce();*/

       //反射机制调用
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        video.produce();
    }
}
