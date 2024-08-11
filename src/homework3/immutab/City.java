package homework3.immutab;

import java.util.Arrays;

public final class City {

    private final House[] houses;
    private final String nameCity;

    public City(House[] houses, String nameCity) {
        this.nameCity = nameCity;
        this.houses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            this.houses[i] = houses[i].clone();
        }
    }

    @Override
    public String toString() {
        return "City{" +
                "nameCity: " + nameCity +
                ", houses: " + Arrays.toString(houses) +
                '}';
    }

    public House[] getHouses() {
        House[] copyHouses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            copyHouses[i] = houses[i].clone();
        }
        return copyHouses;
    }

    public String getNameCity() {
        return nameCity;
    }
}
