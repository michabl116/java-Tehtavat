package Task_2; // Paketti Task_2 // Paquete Task_2

public class CarDriver { // Julkinen luokka CarDriver // Clase pública CarDriver
    public static void main(String[] args) { // Julkinen staattinen päämenetelmä // Método principal estático público
        Car myCar = new Car("Toyota Corolla", 50, 20); // Luo uusi auto // Crear un nuevo coche
        myCar.fillTank(); // Täytä tankki // Llenar el tanque

        for (int i = 0; i < 6; i++) { // Toista 6 kertaa // Repetir 6 veces
            myCar.accelerate(); // Kiihdytä autoa // Acelerar el coche
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h"); // Tulosta auton nopeus // Imprimir la velocidad del coche
        }

        while (myCar.getSpeed() > 0) { // Kunnes auton nopeus on 0 // Hasta que la velocidad del coche sea 0
            myCar.decelerate(15); // Hidasta autoa 15 km/h // Desacelerar el coche 15 km/h
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h"); // Tulosta auton nopeus // Imprimir la velocidad del coche
        }

        System.out.println(myCar.getTypeName() + ": tank capacity is " + myCar.getGasolineLevel() + " liters"); // Tulosta tankin kapasiteetti // Imprimir la capacidad del tanque
    }
}
