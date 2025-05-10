package controller;

import model.Valuutta;
import model.Transaction;
import view.Nakyma;
import dao.ValuuttaDao;
import dao.TransactionDao;
import jakarta.persistence.EntityManager;
import dao.MariaDbJpaConnection;
import java.util.List;

public class Ohjain {
    private final Nakyma nakyma;
    private final ValuuttaDao valuuttaDao;
    private final TransactionDao transactionDao;

    public Ohjain(Nakyma nakyma) {
        this.nakyma = nakyma;
        EntityManager em = MariaDbJpaConnection.getInstance();
        this.valuuttaDao = new ValuuttaDao(em);
        this.transactionDao = new TransactionDao(em);
        alusta();
    }

    private void alusta() {
        List<Valuutta> valuutat = valuuttaDao.findAll();
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

            // Guardar la transacción en la base de datos
            Transaction transaction = new Transaction(lahto, kohde, maara, tulos);
            transactionDao.save(transaction);

        } catch (NumberFormatException e) {
            nakyma.getTulosKentta().setText("Virheellinen määrä!");
        }
    }
}