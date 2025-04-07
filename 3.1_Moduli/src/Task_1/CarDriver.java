package Task_1;
public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("toyota");
        myCar.fillTank();

        for (int i = 0; i < 8; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

System.out.println();

        SportsCar mySportsCar = new SportsCar("ferrari");
        mySportsCar.fillTank();
        System.out.println("SportsCar");
        for (int i = 0; i < 8; i++) {
            mySportsCar.accelerate();
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }
        while (mySportsCar.getSpeed() > 0) {
            mySportsCar.decelerate(15);
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }

    }
}