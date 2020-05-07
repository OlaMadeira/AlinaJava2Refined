package homeworkApril30;

import object.Street;
import object.transport.Car;
import object.transport.Plane;

public class InterfaceLessonHW {
    public static void run() {
        int cash = 100000;
        Repairable[] repairables = new Repairable[]{new Car(), new Street(), new Plane()};
        for (Repairable repairableObject : repairables) {
            if (repairableObject instanceof Plane) {

                Plane currentPlane = (Plane) repairableObject;
                currentPlane.repair(4000);
            }

        if ( repairableObject instanceof Car){
            Car currentCar = (Car) repairableObject;
            currentCar.repair(400);
        }
            if ( repairableObject instanceof Street){
                Street currentStreet = (Street) repairableObject;
                currentStreet.repair(400);
            }

        }

    }
}
