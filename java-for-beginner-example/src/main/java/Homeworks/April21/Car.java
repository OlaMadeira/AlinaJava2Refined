package Homeworks.April21;

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
