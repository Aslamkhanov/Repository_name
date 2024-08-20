package homework4.ex2.flyable;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException();
        } else {
            System.out.println("утка летит");
        }
    }

    public boolean isInjured() {
        return isInjured;
    }

}
