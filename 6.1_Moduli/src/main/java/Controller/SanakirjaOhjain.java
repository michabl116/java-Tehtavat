package Controller;

import model.Sanakirja;

public class SanakirjaOhjain {
    private Sanakirja sanakirja;

    public SanakirjaOhjain(Sanakirja sanakirja) {
        this.sanakirja = sanakirja;
    }

    public String haeSana(String sana) {
        String merkitys = sanakirja.haeMerkitys(sana);
        if (merkitys == null) {
            return "Sanaa ei löytynyt";
        }
        return merkitys;
    }
}

