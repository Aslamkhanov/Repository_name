package homework3.immutab;

public class House {
    private String street;
    private int houseNumber;

    public House(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "street: " + street +
                ", houseNumber: " + houseNumber +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public House clone() {
        return new House(this.street, this.houseNumber);
    }
}
