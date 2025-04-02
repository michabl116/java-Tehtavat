package Task_2;

public class Demo {
    public static void main(String[] args) {
        // Crear un objeto Car y llamar a sus métodos
        // Luo Car-objekti ja kutsu sen metodeja
        Car car = new Car("Sedan", "Gasoline", "Red", 2020, "Toyota", 4);
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
        System.out.println(car.getInfo());

        // Crear un objeto Motorcycle y llamar a sus métodos
        // Luo Motorcycle-objekti ja kutsu sen metodeja
        Motorcycle motorcycle = new Motorcycle("Cruiser", "Gasoline", "Black", 2019, "Harley-Davidson", true);
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());

        // Crear un objeto Bus y llamar a sus métodos
        // Luo Bus-objekti ja kutsu sen metodeja
        Bus bus = new Bus("Coach", "Diesel", "Blue", 2021, "Mercedes-Benz", 50);
        bus.start();
        bus.accelerate();
        bus.brake();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}
