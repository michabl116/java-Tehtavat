package Model;

public class Valuutta {
    private final String tunnus;
    private final String nimi;
    private final double kurssi;

    public Valuutta(String tunnus, String nimi, double kurssi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
        this.kurssi = kurssi;
    }

    // Getters metodit
    public String getTunnus() { return tunnus; }
    public String getNimi() { return nimi; }
    public double getKurssi() { return kurssi; }

    @Override
    public String toString() {
        return tunnus + " - " + nimi;
    }
}