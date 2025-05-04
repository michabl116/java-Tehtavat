package controller;

import Model.Valuutta;
import dao.ValuuttaDao;
import View.Nakyma;
import javafx.collections.ObservableList;

public class Ohjain {
    private final Nakyma nakyma;
    private final ValuuttaDao valuuttaDao;

    public Ohjain(Nakyma nakyma) {
        this.nakyma = nakyma;
        this.valuuttaDao = new ValuuttaDao();
        alusta();
    }

    private void alusta() {
        // Lataa valuutat tietokannasta
        ObservableList<Valuutta> valuutat = valuuttaDao.haeKaikkiValuutat();

        // DEBUG: Tulosta ladatut valuutat
        System.out.println("Ladatut valuutat: " + valuutat.size());

        nakyma.getLahtoValikko().setItems(valuutat);
        nakyma.getKohdeValikko().setItems(valuutat);

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

            double lahtoKurssi = valuuttaDao.haeVaihtokurssi(lahto.getTunnus());
            double kohdeKurssi = valuuttaDao.haeVaihtokurssi(kohde.getTunnus());

            if (lahtoKurssi == -1 || kohdeKurssi == -1) {
                nakyma.getTulosKentta().setText("Valuuttaa ei löytynyt tietokannasta.");
                return;
            }

            double tulos = (maara / lahtoKurssi) * kohdeKurssi;
            nakyma.getTulosKentta().setText(String.format("%.2f", tulos));

        } catch (NumberFormatException e) {
            nakyma.getTulosKentta().setText("Virheellinen määrä!");
        }
    }
}