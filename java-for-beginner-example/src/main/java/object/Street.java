package object;

import homeworkApril30.Repairable;

public class Street implements Repairable
{
    private String name;

    public Street() {
    }

    public Street(String streetName)
    {
        this.name = streetName;
    }

    public String toString()
    {
        return "Street{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public void repair(int cash) {
        System.out.println("На ремонт улицы не хватает денег");
    }

    @Override
    public boolean isNeedToRepair() {
        return false;
    }
}
