package Homeworks.April21;

import Homeworks.April21.Bus;
import Homeworks.April21.Car;
import Homeworks.April21.Truck;

public class TransportMoves {
    public static void transportMoves() {
        Car car = new Car("Жигули");
        car.drive();
        car.stop();

        Truck truck = new Truck("Фура");
        truck.drive();
        truck.stop();

        Bus bus = new Bus("Маршрутка");
        bus.drive();
        bus.stop();

    }
}