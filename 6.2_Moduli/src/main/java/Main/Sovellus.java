package Main;

import controller.Ohjain;
import View.Nakyma;
import javafx.application.Application;
import javafx.stage.Stage;

// Sovellus-luokka, joka käynnistää JavaFX-sovelluksen.
public class Sovellus extends Application {
    @Override
    public void start(Stage ikkuna) {
        // Luo uuden näkymän ja ohjaimen.
        Nakyma nakyma = new Nakyma();
        new Ohjain(nakyma);

        // Näyttää näkymän ikkunassa.
        nakyma.nayta(ikkuna);
    }

    // Päämetodi, joka käynnistää sovelluksen.
    public static void main(String[] args) {
        launch(args);
    }
}
