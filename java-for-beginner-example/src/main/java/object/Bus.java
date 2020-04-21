package object;

public class Bus extends TransportMeans {
    public String name;

    public Bus(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("Движение началось для автобуса");
    }


}
