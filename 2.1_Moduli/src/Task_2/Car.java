package Task_2; // Paketti Task_2 // Paquete Task_2

public class Car { // Julkinen luokka Car // Clase pública Car
    private double speed; // Yksityinen nopeus // Velocidad privada
    private double gasolineLevel; // Yksityinen bensiinimäärä // Nivel de gasolina privado
    private String typeName; // Yksityinen tyyppinimi // Nombre de tipo privado
    private double tankCapacity; // Yksityinen tankin kapasiteetti // Capacidad del tanque privada

    public Car(String typeName) { // Julkinen konstruktori // Constructor público
        speed = 0; // Aseta nopeus nollaan // Establecer velocidad a cero
        gasolineLevel = 0; // Aseta bensiinimäärä nollaan // Establecer nivel de gasolina a cero
        this.typeName = typeName; // Aseta tyyppinimi // Establecer nombre de tipo
        this.tankCapacity = 100; // Oletusarvo // Valor por defecto
    }

    public Car(String typeName, double tankCapacity) { // Julkinen konstruktori // Constructor público
        speed = 0; // Aseta nopeus nollaan // Establecer velocidad a cero
        gasolineLevel = 0; // Aseta bensiinimäärä nollaan // Establecer nivel de gasolina a cero
        this.typeName = typeName; // Aseta tyyppinimi // Establecer nombre de tipo
        this.tankCapacity = tankCapacity; // Aseta tankin kapasiteetti // Establecer capacidad del tanque
    }

    public Car(String typeName, double tankCapacity, double initialSpeed) { // Julkinen konstruktori // Constructor público
        this.typeName = typeName; // Aseta tyyppinimi // Establecer nombre de tipo
        this.tankCapacity = tankCapacity; // Aseta tankin kapasiteetti // Establecer capacidad del tanque
        this.speed = initialSpeed; // Aseta alkunopeus // Establecer velocidad inicial
        this.gasolineLevel = tankCapacity; // Oletetaan, että tankki on täynnä alussa // Asumimos que el tanque está lleno al inicio
    }

    public void accelerate() { // Julkinen kiihdytysmenetelmä // Método público para acelerar
        if (gasolineLevel > 0) // Jos bensiinimäärä on suurempi kuin 0 // Si el nivel de gasolina es mayor que 0
            speed += 10; // Lisää nopeutta 10 km/h // Aumentar velocidad en 10 km/h
        else // Muuten // De lo contrario
            speed = 0; // Aseta nopeus nollaan // Establecer velocidad a cero
    }

    void decelerate(int amount) { // Yksityinen hidastusmenetelmä // Método privado para desacelerar
        if (gasolineLevel > 0) { // Jos bensiinimäärä on suurempi kuin 0 // Si el nivel de gasolina es mayor que 0
            if (amount > 0) // Jos määrä on suurempi kuin 0 // Si la cantidad es mayor que 0
                speed = Math.max(0, speed - amount); // Vähennä nopeutta // Reducir velocidad
        } else // Muuten // De lo contrario
            speed = 0; // Aseta nopeus nollaan // Establecer velocidad a cero
    }

    double getSpeed() { // Julkinen menetelmä nopeuden saamiseksi // Métod público para obtener la velocidad
        return speed; // Palauta nopeus // Devolver velocidad
    }

    String getTypeName() { // Julkinen menetelmä tyyppinimen saamiseksi // Méto público para obtener el nombre de tipo
        return typeName; // Palauta tyyppinimi // Devolver nombre de tipo
    }

    void fillTank() { // Julkinen menetelmä tankin täyttämiseksi // Méto público para llenar el tanque
        gasolineLevel = tankCapacity; // Aseta bensiinimäärä tankin kapasiteettiin // Establecer nivel de gasolina a la capacidad del tanque
    }

    double getGasolineLevel() { // Julkinen menetelmä bensiinimäärän saamiseksi // Méto público para obtener el nivel de gasolina
        return gasolineLevel; // Palauta bensiinimäärä // Devolver nivel de gasolina
    }
}
