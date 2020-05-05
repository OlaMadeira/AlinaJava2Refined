package object.transport;

import homeworkApril30.Repairable;

public class Car implements EngineVehicle, SaleObject, Repairable
{
    private boolean isCarEngineEnable = false;
    public boolean isNeedRepair = true;


    @Override
    public void start()
    {
        isCarEngineEnable = true;
    }

    @Override
    public void stop()
    {
        isCarEngineEnable = false;
    }

    @Override
    public void setSpeed()
    {

    }

    @Override
    public boolean isOn()
    {
        return isCarEngineEnable;
    }

    @Override
    public int getCurrentPrice()
    {
        return 100;
    }

    @Override
    public void repair(int cash) {
        if (cash>10) {
            System.out.println("Отремонтировано");
            isNeedRepair = false;
        }
        else {
            System.out.println("Недостаточно денег");
        }

    }

    @Override
    public boolean isNeedToRepair() {
        return false;
    }
}
