package Homeworks.April21;

public class Automobile extends TransportMeans {
   public String name;

    public Automobile(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("Движение началось для автомобиля");
    }


}
