package Model;

// Valuutta-luokka edustaa valuuttaa, jolla on tunnus, nimi ja kurssi.
public class Valuutta {
    // Muuttujat ovat yksityisiä ja lopullisia, joten niitä ei voi muuttaa luomisen jälkeen.
    private final String tunnus;
    private final String nimi;
    private final double kurssi;

    // Rakentaja, joka asettaa valuutan tunnuksen, nimen ja kurssin.
    public Valuutta(String tunnus, String nimi, double kurssi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
        this.kurssi = kurssi;
    }

    // Getterit, jotka palauttavat valuutan tunnuksen, nimen ja kurssin.
    public String getTunnus() { return tunnus; }
    public String getNimi() { return nimi; }
    public double getKurssi() { return kurssi; }

    // toString-metodi, joka palauttaa valuutan tunnuksen ja nimen merkkijonona.
    @Override
    public String toString() {
        return tunnus + " - " + nimi;
    }
}
