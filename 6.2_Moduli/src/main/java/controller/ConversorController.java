package controller;



import Model.Moneda;
import View.ConversorView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ConversorController {
    private ConversorView nakyma;
    private ObservableList<Moneda> valuutat;

    public ConversorController(ConversorView nakyma) {
        this.nakyma = nakyma;
        alustaValuutat();
        kayttoliittymaKuuntelijat();
    }

    /**
     * Alustaa käytettävissä olevat valuutat
     */
    private void alustaValuutat() {
        valuutat = FXCollections.observableArrayList(
                new Moneda("EUR", "Euro", 0.93),
                new Moneda("USD", "Yhdysvaltain dollari", 1.0),
                new Moneda("GBP", "Englannin punta", 0.79),
                new Moneda("JPY", "Japanin jeni", 151.67),
                new Moneda("SEK", "Ruotsin kruunu", 10.72),
                new Moneda("NOK", "Norjan kruunu", 10.83),
                new Moneda("DKK", "Tanskan kruunu", 6.94),
                new Moneda("RUB", "Venäjän rupla", 92.58)
        );

        // Lisätään valuutat valintalistoihin
        nakyma.getLahdeValinta().setItems(valuutat);
        nakyma.getKohdeValinta().setItems(valuutat);
    }

    /**
     * Asettaa käyttöliittymän kuuntelijat
     */
    private void kayttoliittymaKuuntelijat() {
        nakyma.getMuunnaNappi().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                muunnaValuutta();
            }
        });
    }

    /**
     * Suorittaa valuutanmuunnoksen
     */
    private void muunnaValuutta() {
        try {
            Moneda lahde = nakyma.getLahdeValinta().getValue();
            Moneda kohde = nakyma.getKohdeValinta().getValue();
            double maara = Double.parseDouble(nakyma.getSyoteKentta().getText());

            double tulos = lahde.muunna(kohde, maara);
            nakyma.getTulosKentta().setText(String.format("%.2f", tulos));
        } catch (NumberFormatException e) {
            nakyma.getTulosKentta().setText("Virheellinen syöte");
        } catch (NullPointerException e) {
            nakyma.getTulosKentta().setText("Valitse valuutat");
        }
    }
}
