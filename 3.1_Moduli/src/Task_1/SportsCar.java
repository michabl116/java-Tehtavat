package Task_1;

public class SportsCar extends Car {

    // Konstruktori SportsCar-luokalle, joka perii Car-luokan.
    // Constructor de la clase SportsCar, que hereda de la clase Car.
    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        // Tarkistetaan, onko bensaa jäljellä.
        // Verificamos si hay gasolina disponible.
        if (getGasolineLevel() > 0) {
            // Kutsutaan kahdesti Car-luokan accelerate-metodia, jotta auto kiihtyy nopeammin.
            // Llamamos dos veces al método accelerate() de Car para que el auto acelere más rápido.
            super.accelerate();
            super.accelerate();
        }
    }

    @Override
    public void decelerate(int amount) {
        // Kutsutaan Car-luokan decelerate-metodia, mutta hidastetaan kaksi kertaa enemmän.
        // Llamamos al método decelerate() de Car, pero desaceleramos el doble.
        super.decelerate(amount * 2);
    }
}
