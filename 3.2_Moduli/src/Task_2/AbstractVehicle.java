package Task_2;

// Interfaz que define los métodos básicos de un vehículo
// Rajapinta, joka määrittelee ajoneuvon perusmenetelmät
interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

// Clase abstracta que implementa la interfaz Vehicle y proporciona una implementación básica
// Abstrakti luokka, joka toteuttaa Vehicle-rajapinnan ja tarjoaa perusimplementoinnin
abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected String color;
    protected int year;
    protected String brand;

    // Constructor que inicializa los atributos del vehículo
    // Konstruktori, joka alustaa ajoneuvon ominaisuudet
    public AbstractVehicle(String type, String fuel, String color, int year, String brand) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
        this.year = year;
        this.brand = brand;
    }

    // Méto que devuelve la información del vehículo
    // Metodi, joka palauttaa ajoneuvon tiedot
    @Override
    public String getInfo() {
        return "Type: " + type + ", Fuel: " + fuel + ", Color: " + color + ", Year: " + year + ", Brand: " + brand;
    }

    // Métodos abstractos que deben ser implementados por las subclases
    // Abstraktit metodit, jotka alaluokkien on toteutettava
    abstract void accelerate();
    abstract void brake();
}

// Clase que representa un coche y extiende AbstractVehicle
// Luokka, joka edustaa autoa ja laajentaa AbstractVehicle-luokkaa
class Car extends AbstractVehicle {
    private int doors;

    // Constructor que inicializa los atributos del coche
    // Konstruktori, joka alustaa auton ominaisuudet
    public Car(String type, String fuel, String color, int year, String brand, int doors) {
        super(type, fuel, color, year, brand);
        this.doors = doors;
    }

    // Implementación del méto start para el coche
    // start-metodin toteutus autolle
    @Override
    public void start() {
        System.out.println("Car start");
    }

    // Implementación del méto stop para el coche
    // stop-metodin toteutus autolle
    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    // Implementación del méto accelerate para el coche
    // accelerate-metodin toteutus autolle
    @Override
    void accelerate() {
        System.out.println("Car is accelerating...");
    }

    // Implementación del méto brake para el coche
    // brake-metodin toteutus autolle
    @Override
    void brake() {
        System.out.println("Car is braking...");
    }

    // Méto que devuelve la información del coche
    // Metodi, joka palauttaa auton tiedot
    @Override
    public String getInfo() {
        return super.getInfo() + ", Doors: " + doors;
    }
}

// Clase que representa una motocicleta y extiende AbstractVehicle
// Luokka, joka edustaa moottoripyörää ja laajentaa AbstractVehicle-luokkaa
class Motorcycle extends AbstractVehicle {
    private boolean hasSidecar;

    // Constructor que inicializa los atributos de la motocicleta
    // Konstruktori, joka alustaa moottoripyörän ominaisuudet
    public Motorcycle(String type, String fuel, String color, int year, String brand, boolean hasSidecar) {
        super(type, fuel, color, year, brand);
        this.hasSidecar = hasSidecar;
    }

    // Implementación del méto start para la motocicleta
    // start-metodin toteutus moottoripyörälle
    @Override
    public void start() {
        System.out.println("Motorcycle start");
    }

    // Implementación del méto stop para la motocicleta
    // stop-metodin toteutus moottoripyörälle
    @Override
    public void stop() {
        System.out.println("Motorcycle stop");
    }

    // Implementación del méto accelerate para la motocicleta
    // accelerate-metodin toteutus moottoripyörälle
    @Override
    void accelerate() {
        System.out.println("Motorcycle is accelerating...");
    }

    // Implementación del méto brake para la motocicleta
    // brake-metodin toteutus moottoripyörälle
    @Override
    void brake() {
        System.out.println("Motorcycle is braking...");
    }

    // Méto que devuelve la información de la motocicleta
    // Metodi, joka palauttaa moottoripyörän tiedot
    @Override
    public String getInfo() {
        return super.getInfo() + ", Has Sidecar: " + hasSidecar;
    }
}

// Clase que representa un autobús y extiende AbstractVehicle
// Luokka, joka edustaa bussia ja laajentaa AbstractVehicle-luokkaa
class Bus extends AbstractVehicle {
    private int capacity;

    // Constructor que inicializa los atributos del autobús
    // Konstruktori, joka alustaa bussin ominaisuudet
    public Bus(String type, String fuel, String color, int year, String brand, int capacity) {
        super(type, fuel, color, year, brand);
        this.capacity = capacity;
    }

    // Implementación del méto start para el autobús
    // start-metodin toteutus bussille
    @Override
    public void start() {
        System.out.println("Bus start");
    }

    // Implementación del méto stop para el autobús
    // stop-metodin toteutus bussille
    @Override
    public void stop() {
        System.out.println("Bus stop");
    }

    // Implementación del méto accelerate para el autobús
    // accelerate-metodin toteutus bussille
    @Override
    void accelerate() {
        System.out.println("Bus is accelerating...");
    }

    // Implementación del méto brake para el autobús
    // brake-metodin toteutus bussille
    @Override
    void brake() {
        System.out.println("Bus is braking...");
    }

    // Méto que devuelve la información del autobús
    // Metodi, joka palauttaa bussin tiedot
    @Override
    public String getInfo() {
        return super.getInfo() + ", Capacity: " + capacity;
    }
}
