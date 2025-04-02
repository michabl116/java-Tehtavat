package Task_1;

interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

class Car implements Vehicle {
    private String Type;
    private String Fuel;
    private String Color;

    public Car(String type, String fuel, String color) {
        this.Type = type;
        this.Fuel = fuel;
        this.Color = color;
    }
    @Override
    public void start() {
        System.out.println("Car start"); // Iniciar coche / Käynnistä auto
    }
    @Override
    public void stop() {
        System.out.println("Car stop"); // Detener coche / Pysäytä auto
    }
    @Override
    public String getInfo() {
        return "Type: " + Type + ", Fuel: " + Fuel + ", Color: " + Color;
    }
}

class Motorcycle implements Vehicle {
    private String Type;
    private String Fuel;
    private String Color;

    public Motorcycle(String type, String fuel, String color) {
        this.Type = type;
        this.Fuel = fuel;
        this.Color = color;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle start"); // Iniciar motocicleta / Käynnistä moottoripyörä
    }
    @Override
    public void stop() {
        System.out.println("Motorcycle stop"); // Detener motocicleta / Pysäytä moottoripyörä
    }
    @Override
    public String getInfo() {
        return "Type: " + Type + ", Fuel: " + Fuel + ", Color: " + Color;
    }
}

class Bus implements Vehicle {
    private String Type;
    private String Fuel;
    private String Color;

    public Bus(String type, String fuel, String color) {
        this.Type = type;
        this.Fuel = fuel;
        this.Color = color;
    }

    @Override
    public void start() {
        System.out.println("Bus start"); // Iniciar autobús / Käynnistä bussi
    }
    @Override
    public void stop() {
        System.out.println("Bus stop"); // Detener autobús / Pysäytä bussi
    }
    @Override
    public String getInfo() {
        return "Type: " + Type + ", Fuel: " + Fuel + ", Color: " + Color;
    }
}
