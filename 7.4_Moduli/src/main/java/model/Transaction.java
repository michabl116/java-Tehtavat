package model;



import jakarta.persistence.*;

@Entity
@Table(name = "valuutta_transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    private Long id;

    @ManyToOne
    @JoinColumn(name = "source_currency", nullable = false)
    private Valuutta sourceCurrency;

    @ManyToOne
    @JoinColumn(name = "target_currency", nullable = false)
    private Valuutta targetCurrency;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "result", nullable = false)
    private double result;

    public Transaction() {}

    public Transaction(Valuutta sourceCurrency, Valuutta targetCurrency, double amount, double result) {
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.amount = amount;
        this.result = result;
    }

    public Long getId() { return id; }
    public Valuutta getSourceCurrency() { return sourceCurrency; }
    public Valuutta getTargetCurrency() { return targetCurrency; }
    public double getAmount() { return amount; }
    public double getResult() { return result; }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", sourceCurrency=" + sourceCurrency.getTunnus() +
                ", targetCurrency=" + targetCurrency.getTunnus() +
                ", amount=" + amount +
                ", result=" + result +
                '}';
    }
}
