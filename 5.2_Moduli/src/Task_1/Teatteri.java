package Task_1; // Paquetin nimi

import java.util.Random;

class Lippu { // Lipputen varausta hallitseva luokka
    private int saatavillaPaikat; // Saatavilla olevien paikkojen määrä

    public Lippu(int paikat) {
        this.saatavillaPaikat = paikat;
    }

    public synchronized boolean varaaLiput(int pyydetytLiput) {
        if (pyydetytLiput <= saatavillaPaikat) {
            saatavillaPaikat -= pyydetytLiput;
            return true; // Varaus onnistui
        } else {
            return false; // Ei tarpeeksi paikkoja jäljellä
        }
    }

    public int getSaatavillaPaikat() {
        return saatavillaPaikat;
    }
}

class Asiakas extends Thread { // Asiakasta edustava säie
    private final Lippu järjestelmä;
    private final int pyydetytLiput;

    public Asiakas(Lippu järjestelmä, String nimi, int pyydetytLiput) {
        super(nimi);
        this.järjestelmä = järjestelmä;
        this.pyydetytLiput = pyydetytLiput;
    }

    @Override
    public void run() {
        // Täällä kutsutaan jo synkronoitua metodia
        if (järjestelmä.varaaLiput(pyydetytLiput)) {
            System.out.println(getName() + " varasi " + pyydetytLiput + " lippua.");
        } else {
            System.out.println(getName() + " ei voinut varata " + pyydetytLiput + " lippua.");
        }
    }
}

public class Teatteri { // Pääluokka teatterin varausjärjestelmälle
    public static void main(String[] args) {
        Lippu järjestelmä = new Lippu(10); // Teatterissa saatavilla olevien paikkojen määrä
        Random satunnaisluku = new Random();

        for (int i = 1; i <= 15; i++) {
            int pyydetytLiput = satunnaisluku.nextInt(4) + 1; // Jokainen asiakas pyytää 1-4 lippua
            new Asiakas(järjestelmä, "Asiakas " + i, pyydetytLiput).start();
        }
    }
}