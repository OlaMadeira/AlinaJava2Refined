package homeworkApril30;

import object.Street;
import object.transport.Car;
import object.transport.Plane;

public class InterfaceLessonHW {
    public static void run() {
        int cash = 100000;
        Repairable[] repairables = new Repairable[] { new Car(), new Street(), new Plane() };
        for (Repairable repairable : repairables) {
            if (repairable instanceof Plane) {
                Plane currentPlane = (Plane)repairable;
                currentPlane.isNeedToRepair();
                currentPlane.repair(400);
                System.out.println(cash);
            }
        }
    }
}
