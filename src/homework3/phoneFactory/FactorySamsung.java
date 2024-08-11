package homework3.phoneFactory;

public class FactorySamsung {
    public static Samsung createSamsung() {
        Processor processor = new Processor(1500);
        Camera camera = new Camera(16);
        Frame frame = new Frame(60, 200, 15);
        return new Samsung(processor, camera, frame);
    }

    public static void main(String[] args) {
        Samsung samsung = createSamsung();
        samsung.samsungCamera();
    }
}
