package homework4.ex1.auto;

public class Bus extends Auto {
    private final int maxNumberOfPassengers;

    public Bus(boolean cleanAuto, double width, double height, double length, int maxNumberOfPassengers) {
        super(cleanAuto, width, height, length);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }
}
