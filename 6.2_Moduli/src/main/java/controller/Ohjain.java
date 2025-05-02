package controller;

import Model.Valuutta;
import View.Nakyma;

// Ohjain-luokka hallitsee näkymää ja valuuttojen muuntamista.
public class Ohjain {
    private final Nakyma nakyma;
    private final Valuutta[] valuutat;

    // Rakentaja, joka asettaa näkymän ja alustaa valuutat.
    public Ohjain(Nakyma nakyma) {
        this.nakyma = nakyma;
        this.valuutat = new Valuutta[]{
                new Valuutta("USD", "Yhdysvaltain dollari", 1.0),
                new Valuutta("EUR", "Euro", 0.93),
                new Valuutta("GBP", "Englannin punta", 0.80),
                new Valuutta("JPY", "Japanin jeni", 148.50)
        };
        alusta();
    }

    // Alustaa näkymän valikot ja asettaa muunnosnapin toiminnon.
    private void alusta() {
        // Lisää valuutat lähtö- ja kohdevalikkoihin.
        nakyma.getLahtoValikko().getItems().addAll(valuutat);
        nakyma.getKohdeValikko().getItems().addAll(valuutat);

        // Asettaa muunnosnapin toiminnon.
        nakyma.getMuunnaNappi().setOnAction(e -> muunna());
    }

    // Muuntaa annetun määrän lähtövaluutasta kohdevaluuttaan.
    private void muunna() {
        try {
            // Hakee käyttäjän syöttämän määrän.
            double maara = Double.parseDouble(nakyma.getMaaraKentta().getText());
            Valuutta lahto = nakyma.getLahtoValikko().getValue();
            Valuutta kohde = nakyma.getKohdeValikko().getValue();

            // Tarkistaa, että molemmat valuutat on valittu.
            if (lahto == null || kohde == null) {
                nakyma.getTulosKentta().setText("Valitse molemmat valuutat!");
                return;
            }

            // Laskee muunnoksen tuloksen ja asettaa sen tuloskenttään.
            double tulos = maara * (kohde.getKurssi() / lahto.getKurssi());
            nakyma.getTulosKentta().setText(String.format("%.2f", tulos));

        } catch (NumberFormatException e) {
            // Näyttää virheilmoituksen, jos syötetty määrä ei ole kelvollinen numero.
            nakyma.getTulosKentta().setText("Virheellinen määrä!");
        }
    }
}
