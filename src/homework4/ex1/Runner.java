package homework4.ex1;

import homework4.ex1.auto.Auto;
import homework4.ex1.auto.Bus;
import homework4.ex1.auto.Car;
import homework4.ex1.car_wash.CarWash;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car(true, 1.8, 2, 5, true);
        Car car2 = new Car(true, 1.8, 2, 5, true);
        Car car3 = new Car(true, 1.8, 2, 5, true);
        Car car4 = new Car(true, 1.8, 2, 5, true);

        Bus bus1 = new Bus(true, 2.3, 3, 12, 130);
        Bus bus2 = new Bus(true, 2.3, 3, 12, 130);
        Bus bus3 = new Bus(true, 2.3, 3, 12, 130);
        Bus bus4 = new Bus(true, 2.3, 3, 12, 130);
        Bus bus5 = new Bus(true, 2.3, 3, 12, 130);
        Auto[] autos = {bus1, bus2, bus3, bus4, bus5, car1, car2, car3, car4};
        CarWash carWash = new CarWash();
        carWash.washTheCar(autos);
    }
}
