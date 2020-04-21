package Homeworks.April21;

public class Truck extends TransportMeans {
    public String name;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("Движение началось для грузовика");
    }


}
