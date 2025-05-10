package dao;

import model.Valuutta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class ValuuttaDao {

    private final EntityManager em;

    public ValuuttaDao(EntityManager em) {
        this.em = em;
    }

    // Obtener todas las monedas desde la base de datos
    public List<Valuutta> findAll() {
        TypedQuery<Valuutta> query = em.createQuery("SELECT v FROM Valuutta v", Valuutta.class);
        return query.getResultList();
    }
}