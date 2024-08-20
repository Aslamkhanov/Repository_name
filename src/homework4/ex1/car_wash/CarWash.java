package homework4.ex1.car_wash;

import homework4.ex1.auto.Auto;

public class CarWash {
    private static final int TARIFF_FOR_LARGE_CARS = 4000;
    private static final int TARIFF_FOR_SMALL_CARS = 2000;

    public int tariff(Auto auto) {
        if (auto.isCarCategories()) {
            System.out.println("Крупная машина, ваш тариф: " + TARIFF_FOR_LARGE_CARS);
            return TARIFF_FOR_LARGE_CARS;
        } else {
            System.out.println("Маломерная машина, ваш тариф: " + TARIFF_FOR_SMALL_CARS);
            return TARIFF_FOR_SMALL_CARS;
        }
    }

    public int wash(Auto auto) {
        if (auto.isCleanAuto()) {
            auto.setCleanAuto(false);
            System.out.println("Машина чистая");
            return tariff(auto);
        } else {
            System.out.println("Машина уже чистая");
        }
        return 0;
    }

    public int washTheCar(Auto... autos) {
        int totalCost = 0;
        for (Auto auto : autos) {
            totalCost += wash(auto);
        }
        System.out.println("Мэрия заплатит за мойку всех машин: " + totalCost);
        return totalCost;
    }
}
