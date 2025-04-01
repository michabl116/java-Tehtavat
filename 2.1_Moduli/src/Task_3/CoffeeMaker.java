package Task_3; // Paketti Task_3 // Paquete Task_3

// Clase CoffeeMaker // Luokka CoffeeMaker
public class CoffeeMaker {
    private boolean isOn; // Yksityinen muuttuja laitteen tilalle // Variable privada para el estado del dispositivo
    private String coffeeType; // Yksityinen muuttuja kahvityypille // Variable privada para el tipo de café
    private int coffeeAmount; // Yksityinen muuttuja kahvin määrälle // Variable privada para la cantidad de café

    public CoffeeMaker() { // Julkinen konstruktori // Constructor público
        isOn = false; // Aseta laite pois päältä // Establecer el dispositivo como apagado
        coffeeType = "normal"; // Aseta oletuskahvityyppi // Establecer tipo de café por defecto
        coffeeAmount = 10; // Aseta oletuskahvimäärä // Establecer cantidad de café por defecto
    }

    public void turnOn() { // Julkinen menetelmä laitteen käynnistämiseksi // Méto público para encender el dispositivo
        isOn = true; // Aseta laite päälle // Establecer el dispositivo como encendido
    }

    public void turnOff() { // Julkinen menetelmä laitteen sammuttamiseksi // Méto público para apagar el dispositivo
        isOn = false; // Aseta laite pois päältä // Establecer el dispositivo como apagado
    }

    public void setCoffeeType(String type) { // Julkinen menetelmä kahvityypin asettamiseksi // Méto público para establecer el tipo de café
        if (isOn) { // Jos laite on päällä // Si el dispositivo está encendido
            coffeeType = type; // Aseta kahvityyppi // Establecer tipo de café
        }
    }

    public void setCoffeeAmount(int amount) { // Julkinen menetelmä kahvin määrän asettamiseksi // Méto público para establecer la cantidad de café
        if (isOn && amount >= 10 && amount <= 80) { // Jos laite on päällä ja määrä on välillä 10-80 // Si el dispositivo está encendido y la cantidad está entre 10-80
            coffeeAmount = amount; // Aseta kahvin määrä // Establecer cantidad de café
        }
    }

    public boolean isOn() { // Julkinen menetelmä laitteen tilan tarkistamiseksi // Méto público para verificar el estado del dispositivo
        return isOn; // Palauta laitteen tila // Devolver estado del dispositivo
    }

    public String getCoffeeType() { // Julkinen menetelmä kahvityypin tarkistamiseksi // Méto público para verificar el tipo de café
        return coffeeType; // Palauta kahvityyppi // Devolver tipo de café
    }

    public int getCoffeeAmount() { // Julkinen menetelmä kahvin määrän tarkistamiseksi // Méto público para verificar la cantidad de café
        return coffeeAmount; // Palauta kahvin määrä // Devolver cantidad de café
    }
}
