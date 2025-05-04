package controller;

import View.ConversorView;
import dao.ValuuttaDao;
import Model.Moneda;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ConversorController {
    private ConversorView nakyma;
    private ValuuttaDao valuuttaDao;

    public ConversorController(ConversorView nakyma) {
        this.nakyma = nakyma;
        this.valuuttaDao = new ValuuttaDao();
        kayttoliittymaKuuntelijat();
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
     * Suorittaa valuutanmuunnoksen consultando la base de datos
     */
    private void muunnaValuutta() {
        try {
            Moneda lahde = nakyma.getLahdeValinta().getValue();
            Moneda kohde = nakyma.getKohdeValinta().getValue();
            double maara = Double.parseDouble(nakyma.getSyoteKentta().getText());

            double rateLahde = valuuttaDao.haeVaihtokurssi(lahde.getKoodi());
            double rateKohde = valuuttaDao.haeVaihtokurssi(kohde.getKoodi());

            if (rateLahde == -1 || rateKohde == -1) {
                nakyma.getTulosKentta().setText("Virhe: Valuutta ei löydy");
                return;
            }

            // Calculamos el resultado usando la tasa de conversión de la base de datos
            double tulos = (maara / rateLahde) * rateKohde;
            nakyma.getTulosKentta().setText(String.format("%.2f", tulos));
        } catch (NumberFormatException e) {
            nakyma.getTulosKentta().setText("Virheellinen syöte");
        } catch (NullPointerException e) {
            nakyma.getTulosKentta().setText("Valitse valuutat");
        }
    }
}