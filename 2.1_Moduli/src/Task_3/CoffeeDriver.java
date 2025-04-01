package Task_3; // Paketti Task_3 // Paquete Task_3

public class CoffeeDriver { // Julkinen luokka CoffeeDriver // Clase pública CoffeeDriver
    public static void main(String[] args) { // Julkinen staattinen päämenetelmä // Métod principal estático público
        CoffeeMaker myCoffeeMaker = new CoffeeMaker(); // Luo uusi kahvinkeitin // Crear una nueva cafetera

        myCoffeeMaker.turnOn(); // Käynnistä kahvinkeitin // Encender la cafetera
        System.out.println("Coffee maker is on"); // Tulosta viesti // Imprimir mensaje

        myCoffeeMaker.setCoffeeType("espresso"); // Aseta kahvityyppi // Establecer tipo de café
        System.out.println("Coffee type is " + myCoffeeMaker.getCoffeeType()); // Tulosta kahvityyppi // Imprimir tipo de café

        myCoffeeMaker.setCoffeeAmount(50); // Aseta kahvin määrä // Establecer cantidad de café
        System.out.println("Coffee amount is " + myCoffeeMaker.getCoffeeAmount() + " ml"); // Tulosta kahvin määrä // Imprimir cantidad de café

        myCoffeeMaker.turnOff(); // Sammuta kahvinkeitin // Apagar la cafetera
        System.out.println("Coffee maker is off"); // Tulosta viesti // Imprimir mensaje
    }
}
