package Task_1;

public class SportsCar extends Car2 { // Luokka SportsCar, joka laajentaa Car2-luokkaa
    private final double ACCELERATION_RATE = 20; // Suurempi kiihtyvyys
    private final double DECELERATION_RATE = 15; // Suurempi hidastuvuus
    private final double FUEL_CONSUMPTION_RATE = 1.5; // Suurempi polttoaineenkulutus

    // Konstruktori, joka ottaa vastaan vain auton tyypin
    public SportsCar(String typeName) {
        super(typeName);
    }

    // Konstruktori, joka ottaa vastaan auton tyypin ja tankin kapasiteetin
    public SportsCar(String typeName, double tankCapacity) {
        super(typeName, tankCapacity);
    }

    // Konstruktori, joka ottaa vastaan auton tyypin, tankin kapasiteetin ja alkunopeuden
    public SportsCar(String typeName, double tankCapacity, double initialSpeed) {
        super(typeName, tankCapacity, initialSpeed);
    }

    // Metodi auton kiihdyttämiseen
    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) { // Tarkistaa, onko polttoainetta jäljellä
            double newSpeed = getSpeed() + ACCELERATION_RATE; // Lisää nopeutta kiihtyvyysarvon verran
            setSpeed(newSpeed); // Päivittää auton nopeuden
            consumeFuel(FUEL_CONSUMPTION_RATE); // Kuluttaa polttoainetta kiihtyessä
        } else {
            setSpeed(0); // Jos polttoainetta ei ole, nopeus asetetaan nollaan
        }
    }

    // Metodi auton hidastamiseen
    public void decelerate() {
        if (getGasolineLevel() > 0) { // Tarkistaa, onko polttoainetta jäljellä
            double newSpeed = Math.max(0, getSpeed() - DECELERATION_RATE); // Vähentää nopeutta hidastuvuusarvon verran
            setSpeed(newSpeed); // Päivittää auton nopeuden
        } else {
            setSpeed(0); // Jos polttoainetta ei ole, nopeus asetetaan nollaan
        }
    }

    // Metodi polttoaineen kulutukseen
    private void consumeFuel(double amount) {
        double newLevel = Math.max(0, getGasolineLevel() - amount); // Vähentää polttoainetta, mutta ei anna sen mennä alle nollan
        setGasolineLevel(newLevel); // Päivittää polttoaineen määrän
    }

    // Metodi nopeuden asettamiseen reflektiolla
    private void setSpeed(double speed) {
        try {
            java.lang.reflect.Field speedField = Car2.class.getDeclaredField("speed"); // Hakee "speed"-kentän Car2-luokasta
            speedField.setAccessible(true); // Asettaa kentän käytettäväksi
            speedField.set(this, speed); // Asettaa uuden nopeuden
        } catch (Exception e) {
            e.printStackTrace(); // Tulostaa virheen, jos sellainen tapahtuu
        }
    }

    // Metodi polttoainetason asettamiseen reflektiolla
    private void setGasolineLevel(double level) {
        try {
            java.lang.reflect.Field gasField = Car2.class.getDeclaredField("gasolineLevel"); // Hakee "gasolineLevel"-kentän Car2-luokasta
            gasField.setAccessible(true); // Asettaa kentän käytettäväksi
            gasField.set(this, level); // Asettaa uuden polttoainetason
        } catch (Exception e) {
            e.printStackTrace(); // Tulostaa virheen, jos sellainen tapahtuu
        }
    }
}