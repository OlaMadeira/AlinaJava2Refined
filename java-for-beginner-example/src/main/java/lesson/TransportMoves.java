package lesson;

import object.Bus;
import object.Car;
import object.Truck;

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
