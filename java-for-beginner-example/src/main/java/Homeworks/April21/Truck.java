package Homeworks.April21;

import Homeworks.April21.TransportMeans;

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
