package homework4.ex2.flyable;

public class Airplane implements Flyable {
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException();
        }
        System.out.println("самолет летит");
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
