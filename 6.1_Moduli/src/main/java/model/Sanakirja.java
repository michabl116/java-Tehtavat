package model;


import java.util.HashMap;

public class Sanakirja {
    private HashMap<String, String> sanakirja;

    public Sanakirja() {
        sanakirja = new HashMap<>();
        // Lisää esimerkkisanat suoraan malliin
        lisaaSana("Moi", "Tervehdys suoomi");
        lisaaSana("Ope", "Moi");
    }

    public void lisaaSana(String sana, String merkitys) {
        sanakirja.put(sana, merkitys);
    }

    public String haeMerkitys(String sana) {
        return sanakirja.get(sana);
    }
}
