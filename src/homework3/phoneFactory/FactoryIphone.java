package homework3.phoneFactory;

public class FactoryIphone {
    public static Iphone createIphone() {
        Processor processor1 = new Processor(1000);
        Processor processor2 = new Processor(1000);
        Camera camera = new Camera(8);
        Frame frame = new Frame(60, 200, 10);
        Processor[] processors = {processor1, processor2};
        return new Iphone(processors, camera, frame);
    }

    public static void main(String[] args) {
        Iphone iphone = createIphone();
        iphone.iphoneCamera();
        iphone.infoProcessor();
    }
}
