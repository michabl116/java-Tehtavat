package dao;

import Model.Moneda;
import datasource.TietokantaYhteys;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValuuttaDao {
    public ObservableList<Moneda> haeKaikkiValuutat() {
        ObservableList<Moneda> valuutat = FXCollections.observableArrayList();
        String kysely = "SELECT koodi, nimi,  peruskurssi FROM currencies";

        try (Connection yhteys = TietokantaYhteys.getYhteys();
             PreparedStatement stmt = yhteys.prepareStatement(kysely);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                valuutat.add(new Moneda(
                        rs.getString("Koodi"),
                        rs.getString("nimi"),
                        rs.getDouble("peruskurssi")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Virhe haettaessa valuuttoja: " + e.getMessage());
        }

        return valuutat;
    }

    public double haeVaihtokurssi(String valuuttaKoodi) {
        String kysely = "SELECT peruskurssi FROM currencies WHERE koodi = ?";
        try (Connection yhteys = TietokantaYhteys.getYhteys();
             PreparedStatement stmt = yhteys.prepareStatement(kysely)) {
            stmt.setString(1, valuuttaKoodi);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("peruskurssi");
                }
            }
        } catch (SQLException e) {
            System.err.println("Virhe haettaessa vaihtokurssia: " + e.getMessage());
        }
        return -1; // Virhetilanteessa palautetaan -1
    }
}