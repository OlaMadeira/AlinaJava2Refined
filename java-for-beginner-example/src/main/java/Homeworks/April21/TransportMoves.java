package Homeworks.April21;

public class TransportMoves {
    public static void transportMoves() {
        Automobile automobile = new Automobile("Жигули");
        automobile.drive();
        automobile.stop();

        Truck truck = new Truck("Фура");
        truck.drive();
        truck.stop();

        Bus bus = new Bus("Маршрутка");
        bus.drive();
        bus.stop();

    }
}
