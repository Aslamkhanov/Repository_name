package homework3.phoneFactory;

public class Iphone {
    private Processor[] processors;
    private Camera camera;
    private Frame frame;

    public Iphone(Processor[] processors, Camera camera, Frame frame) {
        this.processors = processors;
        this.camera = camera;
        this.frame = frame;
    }

    public void iphoneCamera() {
        camera.photograph();
    }

    public void infoProcessor() {
        for (Processor processor : processors) {
            System.out.println("Процессор с частотой: " + processor.getFrequency() + " Mhz");
        }
    }

    public Processor[] getProcessors() {
        return processors;
    }

    public Camera getCamera() {
        return camera;
    }

    public Frame getFrame() {
        return frame;
    }
}
