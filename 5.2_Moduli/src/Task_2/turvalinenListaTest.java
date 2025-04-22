package Task_2; // Paketin nimi
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Luokka, joka hallinnoi säikeiden turvallista listaa
class TurvallinenLista {
    private final List<String> lista;

    public TurvallinenLista() {
        this.lista = Collections.synchronizedList(new ArrayList<>());
    }

    public synchronized void lisääElementti(String elementti) {
        lista.add(elementti);
        System.out.println(Thread.currentThread().getName() + " lisäsi: " + elementti);
    }

    public synchronized void poistaElementti(String elementti) {
        if (lista.remove(elementti)) {
            System.out.println(Thread.currentThread().getName() + " poisti: " + elementti);
        } else {
            System.out.println(Thread.currentThread().getName() + " ei löytänyt: " + elementti);
        }
    }

    public synchronized int haeKoko() {
        return lista.size();
    }

    public synchronized void näytäElementit() {
        System.out.println("Nykyinen lista: " + lista);
    }
}

// Luokka, joka testaa TurvallinenLista-säieturvallisuuden
public class turvalinenListaTest {
    public static void main(String[] args) {
        TurvallinenLista lista = new TurvallinenLista();

        Runnable tehtävä = () -> {
            lista.lisääElementti(Thread.currentThread().getName());
            lista.näytäElementit();
            lista.poistaElementti(Thread.currentThread().getName());
        };

        // Luodaan useita säikeitä samanaikaisuuden testaamiseksi
        Thread säie1 = new Thread(tehtävä, "Säie-1");
        Thread säie2 = new Thread(tehtävä, "Säie-2");
        Thread säie3 = new Thread(tehtävä, "Säie-3");
        Thread säie4 = new Thread(tehtävä, "Säie-4");
        Thread säie5 = new Thread(tehtävä, "Säie-5");

        // Käynnistetään säikeet
        säie1.start();
        säie2.start();
        säie3.start();
        säie4.start();
        säie5.start();

        // Odotetaan, että kaikki säikeet päättyvät
        try {
            säie1.join();
            säie2.join();
            säie3.join();
            säie4.join();
            säie5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Näytetään listan lopullinen koko
        System.out.println("Listan lopullinen koko: " + lista.haeKoko());
    }
}