package dao;



import jakarta.persistence.EntityManager;
import model.Transaction;

public class TransactionDao {

    private final EntityManager em;

    public TransactionDao(EntityManager em) {
        this.em = em;
    }

    public void save(Transaction transaction) {
        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();
    }
}
