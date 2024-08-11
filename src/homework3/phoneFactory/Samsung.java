package homework3.phoneFactory;

public class Samsung {
    private Processor processor;
    private Camera camera;
    private Frame frame;

    public Samsung(Processor processor, Camera camera, Frame frame) {
        this.processor = processor;
        this.camera = camera;
        this.frame = frame;
    }

    public void samsungCamera() {
        camera.photograph();
    }

    public Processor getProcessor() {
        return processor;
    }

    public Camera getCamera() {
        return camera;
    }

    public Frame getFrame() {
        return frame;
    }

}
