package Model;



public class Moneda {
    private String koodi;          // Valuutan lyhyt koodi (esim. EUR, USD)
    private String nimi;           // Valuutan koko nimi (esim. Euro, Yhdysvaltain dollari)
    private double peruskurssi;    // Vaihtokurssi USD:n suhteen (1 USD = X valuuttaa)

    public Moneda(String koodi, String nimi, double peruskurssi) {
        this.koodi = koodi;
        this.nimi = nimi;
        this.peruskurssi = peruskurssi;
    }

    // Getterit
    public String getKoodi() { return koodi; }
    public String getNimi() { return nimi; }
    public double getPeruskurssi() { return peruskurssi; }

    /**
     * Muuntaa valuutan toiseksi valuutaksi
     * @param kohde Valuuta, johon muunnetaan
     * @param maara Muunnettava määrä
     * @return Muunnettu määrä kohdevaluutassa
     */
    public double muunna(Moneda kohde, double maara) {
        // Muunnetaan ensin USD:ksi (perusvaluutta)
        double maaraUSD = maara / this.peruskurssi;
        // Sitten muunnetaan kohdevaluutaksi
        return maaraUSD * kohde.getPeruskurssi();
    }

    @Override
    public String toString() {
        return koodi + " - " + nimi;
    }
}
