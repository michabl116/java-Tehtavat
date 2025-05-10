package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "valuutta") // Asegúrate de que la tabla en la base de datos se llame "currency"
public class Valuutta {

    @Id
    @Column(name = "tunnus") // Mapea la columna "tunnus"
    private String tunnus;

    @Column(name = "nimi")
    private String nimi;

    @Column(name = "kurssi")
    private double kurssi;

    // Constructor vacío requerido por JPA
    public Valuutta() {}

    public Valuutta(String tunnus, String nimi, double kurssi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
        this.kurssi = kurssi;
    }

    public String getTunnus() { return tunnus; }
    public String getNimi() { return nimi; }
    public double getKurssi() { return kurssi; }

    @Override
    public String toString() {
        return tunnus + " - " + nimi;
    }
}