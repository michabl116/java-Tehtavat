package dao;

import datasource.TietokantaYhteys;
import Model.Valuutta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValuuttaDao {
    public ObservableList<Valuutta> haeKaikkiValuutat() {
        ObservableList<Valuutta> valuutat = FXCollections.observableArrayList();
        String kysely = "SELECT code, name, exchange_rate FROM currencies";

        try (Connection yhteys = TietokantaYhteys.getYhteys();
             PreparedStatement stmt = yhteys.prepareStatement(kysely);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                valuutat.add(new Valuutta(
                        rs.getString("code"),
                        rs.getString("name"),
                        rs.getDouble("exchange_rate")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Virhe haettaessa valuuttoja: " + e.getMessage());
        }

        return valuutat;
    }

    public double haeVaihtokurssi(String valuuttaKoodi) {
        String kysely = "SELECT exchange_rate FROM currencies WHERE code = ?";
        try (Connection yhteys = TietokantaYhteys.getYhteys();
             PreparedStatement stmt = yhteys.prepareStatement(kysely)) {
            stmt.setString(1, valuuttaKoodi);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("exchange_rate");
                }
            }
        } catch (SQLException e) {
            System.err.println("Virhe haettaessa vaihtokurssia: " + e.getMessage());
        }
        return -1; // Virhetilanteessa palautetaan -1
    }
}