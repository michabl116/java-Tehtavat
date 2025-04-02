package Task_1;

public class VehicleDemo {
    public static void feedVehicle(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        System.out.println(vehicle.getInfo()); // Imprimir el resultado de getInfo / Tulosta getInfo:n tulos
    }

    public static void main(String[] args) {
        Vehicle car = new Car("Sedan", "Gasoline", "Red");
        car.start();
        car.stop();
        System.out.println(car.getInfo()); // Imprimir el resultado de getInfo / Tulosta getInfo:n tulos

        Vehicle motorcycle = new Motorcycle("Sport", "Gasoline", "Blue");
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo()); // Imprimir el resultado de getInfo / Tulosta getInfo:n tulos

        Vehicle bus = new Bus("City", "Diesel", "Yellow");
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo()); // Imprimir el resultado de getInfo / Tulosta getInfo:n tulos

        // Usando el méto feedVehicle / Käytä feedVehicle-menetelmää
        feedVehicle(new Car("SUV", "Electric", "Green"));
        feedVehicle(new Motorcycle("Cruiser", "Gasoline", "Black"));
        feedVehicle(new Bus("Tour", "Diesel", "White"));
    }
}
