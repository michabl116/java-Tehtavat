

package Task_1;

public class Car2 {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double tankCapacity;
    private boolean cruiseControlActive;
    private double targetSpeed;
    private final double MIN_CRUISE_SPEED = 30; // Minimum speed for cruise control
    private final double MAX_CRUISE_SPEED = 120; // Maximum speed for cruise control

    public Car2(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.tankCapacity = 100;
        cruiseControlActive = false;
        targetSpeed = 0;
    }

    public Car2(String typeName, double tankCapacity) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        cruiseControlActive = false;
        targetSpeed = 0;
    }

    public Car2(String typeName, double tankCapacity, double initialSpeed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = initialSpeed;
        this.gasolineLevel = tankCapacity;
        cruiseControlActive = false;
        targetSpeed = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
        } else {
            speed = 0;
        }
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
            }
        } else {
            speed = 0;
        }
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = tankCapacity;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }

    // Methods for cruise control
    public void setCruiseControlSpeed(double targetSpeed) {
        if (targetSpeed >= MIN_CRUISE_SPEED && targetSpeed <= MAX_CRUISE_SPEED) {
            this.targetSpeed = targetSpeed;
        } else {
            System.out.println("Target speed out of range.");
        }
    }

    public double getCruiseControlSpeed() {
        return targetSpeed;
    }

    public boolean turnOnCruiseControl() {
        if (targetSpeed >= MIN_CRUISE_SPEED && targetSpeed <= MAX_CRUISE_SPEED) {
            cruiseControlActive = true;
            adjustSpeedToTarget();
            return true;
        } else {
            System.out.println("Cannot activate cruise control. Target speed out of range.");
            cruiseControlActive = false;
            return false;
        }
    }

    public void turnOffCruiseControl() {
        cruiseControlActive = false;
    }

    public void adjustSpeedToTarget() {
        if (cruiseControlActive) {
            if (speed < targetSpeed) {
                accelerate();
            } else if (speed > targetSpeed) {
                decelerate((int) (speed - targetSpeed));
            }
            if (speed != targetSpeed) {
                System.out.println("Cannot reach target speed. Deactivating cruise control.");
                turnOffCruiseControl();
            }
        }
    }
}


