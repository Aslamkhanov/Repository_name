package homework4.ex1.auto;

public abstract class Auto {
    protected boolean cleanAuto;
    protected double width;
    protected double height;
    protected double length;

    public Auto(boolean cleanAuto, double width, double height, double length) {
        this.cleanAuto = cleanAuto;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public boolean isCarCategories() {
        return length > 6 || height > 2.5 || width > 2;
    }

    public boolean isCleanAuto() {
        return cleanAuto;
    }

    public void setCleanAuto(boolean cleanAuto) {
        this.cleanAuto = cleanAuto;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}
