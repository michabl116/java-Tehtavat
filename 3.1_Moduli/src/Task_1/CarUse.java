package Task_1;
public class CarUse {
    // Main method to test the functionality of the SportsCar class
    public static void main(String[] args) {
        // Create a sports car with a fuel tank capacity of 80 liters and an initial speed of 0
        SportsCar mySportsCar = new SportsCar("Ferrari", 80, 0);

        // Print car details
        System.out.println("Car type: " + mySportsCar.getTypeName());
        System.out.println("Initial speed: " + mySportsCar.getSpeed() + " km/h");
        System.out.println("Initial fuel level: " + mySportsCar.getGasolineLevel() + " liters");

        // Accelerate the sports car 3 times
        mySportsCar.accelerate();
        mySportsCar.accelerate();
        mySportsCar.accelerate();
        System.out.println("Speed after acceleration: " + mySportsCar.getSpeed() + " km/h");
        System.out.println("Fuel level after acceleration: " + mySportsCar.getGasolineLevel() + " liters");

        // Decelerate the sports car
        mySportsCar.decelerate();
        System.out.println("Speed after deceleration: " + mySportsCar.getSpeed() + " km/h");

        // Refill the fuel tank
        mySportsCar.fillTank();
        System.out.println("Fuel level after refilling: " + mySportsCar.getGasolineLevel() + " liters");
    }
}
