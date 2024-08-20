package homework4.ex1.auto;

public class Car extends Auto {
    private final boolean cruiseControl;

    public Car(boolean cleanAuto, double width, double height, double length, boolean cruiseControl) {
        super(cleanAuto, width, height, length);
        this.cruiseControl = cruiseControl;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }
}
