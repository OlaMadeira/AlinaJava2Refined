package homeworkApril30;

import object.Street;
import object.transport.Car;
import object.transport.Plane;
import org.w3c.dom.ls.LSOutput;

public class InterfaceLessonHW {
    public static void run() {
        int cash = 100000;
        Repairable[] repairables = new Repairable[]{new Plane(), new Car(), new Street(),};
        for (Repairable repairableObject : repairables) {
            if (repairableObject instanceof Plane && ((Plane) repairableObject).isNeedRepair) {

                Plane currentPlane = (Plane) repairableObject;
                currentPlane.repair(cash);
                cash -= currentPlane.costOfRepair;
            }

            if (repairableObject instanceof Car && ((Car) repairableObject).isNeedRepair) {
                Car currentCar = (Car) repairableObject;
                currentCar.repair(cash);
                cash -= 10;

            }
            if (repairableObject instanceof Street && repairableObject.isNeedToRepair()) {
                Street currentStreet = (Street) repairableObject;
                currentStreet.repair(cash);
            }

        }
        System.out.println(cash);

    }
}
