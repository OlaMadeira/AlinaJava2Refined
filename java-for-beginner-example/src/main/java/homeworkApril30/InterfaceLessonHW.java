package homeworkApril30;

import object.Street;
import object.transport.Car;
import object.transport.Plane;

public class InterfaceLessonHW {
    public static void run() {
        int cash = 100000;
        Repairable[] repairables = new Repairable[]{new Car(), new Street(), new Plane()};
        for (Repairable repairableObject : repairables) {
            if (repairableObject instanceof Plane && ((Plane) repairableObject).isNeedRepair) {

                Plane currentPlane = (Plane) repairableObject;
                currentPlane.repair(100);
            }

        if ( repairableObject instanceof Car && ((Car) repairableObject).isNeedRepair){
            Car currentCar = (Car) repairableObject;
            currentCar.repair(20);
        }
            if ( repairableObject instanceof Street && repairableObject.isNeedToRepair()){
                Street currentStreet = (Street) repairableObject;
                currentStreet.repair(900);
            }

        }

    }
}
