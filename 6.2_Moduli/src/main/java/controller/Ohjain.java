package controller;

import Model.Valuutta;
import View.Nakyma;

public class Ohjain {
    private final Nakyma nakyma;
    private final Valuutta[] valuutat;

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

    private void alusta() {

        nakyma.getLahtoValikko().getItems().addAll(valuutat);
        nakyma.getKohdeValikko().getItems().addAll(valuutat);


        nakyma.getMuunnaNappi().setOnAction(e -> muunna());
    }

    private void muunna() {
        try {
            double maara = Double.parseDouble(nakyma.getMaaraKentta().getText());
            Valuutta lahto = nakyma.getLahtoValikko().getValue();
            Valuutta kohde = nakyma.getKohdeValikko().getValue();

            if (lahto == null || kohde == null) {
                nakyma.getTulosKentta().setText("Valitse molemmat valuutat!");
                return;
            }

            double tulos = maara * (kohde.getKurssi() / lahto.getKurssi());
            nakyma.getTulosKentta().setText(String.format("%.2f", tulos));

        } catch (NumberFormatException e) {
            nakyma.getTulosKentta().setText("Virheellinen määrä!");
        }
    }
}