package Task_4;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla", 50, 20);
        myCar.fillTank();
        System.out.println(myCar.getTypeName() + ": tank capacity is " + myCar.getGasolineLevel() + " liters");


        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }


        myCar.setCruiseControlSpeed(80);
        if (myCar.turnOnCruiseControl()) {
            System.out.println("Cruise control activated at " + myCar.getCruiseControlSpeed() + " km/h.");
        } else {
            System.out.println("Could not activate cruise control.");
        }


        for (int i = 0; i < 10; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            myCar.adjustSpeedToTarget();
        }

        // Deactivate cruise control
        myCar.turnOffCruiseControl();
        System.out.println("Cruise control deactivated.");


        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}
