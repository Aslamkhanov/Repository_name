package homework3.phoneFactory;

public class Camera {
    private int numberOfMegaPixels;

    public Camera(int numberOfMegaPixels) {
        this.numberOfMegaPixels = numberOfMegaPixels;
    }

    public void photograph() {
        System.out.println("Сделано фото");
    }

    public int getNumberOfMegaPixels() {
        return numberOfMegaPixels;
    }

    public void setNumberOfMegaPixels(int numberOfMegaPixels) {
        this.numberOfMegaPixels = numberOfMegaPixels;
    }
}
