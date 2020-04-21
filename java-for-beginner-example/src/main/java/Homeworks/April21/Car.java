package Homeworks.April21;

import Homeworks.April21.TransportMeans;

public class Car extends TransportMeans {
   public String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("Движение началось для автомобиля");
    }


}
