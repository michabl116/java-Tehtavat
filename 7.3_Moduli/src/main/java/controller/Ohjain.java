package controller;

import model.Valuutta;
import view.Nakyma;
import dao.ValuuttaDao;
import jakarta.persistence.EntityManager;
import java.util.List;
import dao.MariaDbJpaConnection;

public class Ohjain {
    private final Nakyma nakyma;
    private final ValuuttaDao valuuttaDao;

    public Ohjain(Nakyma nakyma) {
        this.nakyma = nakyma;
        EntityManager em = MariaDbJpaConnection.getInstance(); // Obtener EntityManager
        this.valuuttaDao = new ValuuttaDao(em); // Inicializar DAO
        alusta();
    }

    private void alusta() {
        // Obtener monedas desde la base de datos
        List<Valuutta> valuutat = valuuttaDao.findAll();

        // Agregar monedas a los ComboBox
        nakyma.getLahtoValikko().getItems().addAll(valuutat);
        nakyma.getKohdeValikko().getItems().addAll(valuutat);

        // Asegurar que el botón de conversión funcione
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