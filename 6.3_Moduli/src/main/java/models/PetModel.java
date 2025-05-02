package models;



public class PetModel {
    private double x, y;
    private double targetX, targetY;
    private boolean moving;

    public PetModel(double startX, double startY) {
        this.x = startX;
        this.y = startY;
        this.targetX = startX;
        this.targetY = startY;
        this.moving = false;
    }

    public void updatePosition() {
        if (!moving) return;

        double dx = targetX - x;
        double dy = targetY - y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        if (distance < 1) {
            moving = false;
        } else {
            double step = 2;
            x += step * dx / distance;
            y += step * dy / distance;
        }
    }

    public void setTarget(double targetX, double targetY) {
        this.targetX = targetX;
        this.targetY = targetY;
        this.moving = true;
    }

    public void stopMoving() {
        this.moving = false;
    }

    public double getX() { return x; }
    public double getY() { return y; }
}
