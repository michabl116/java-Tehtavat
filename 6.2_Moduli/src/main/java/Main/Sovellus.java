package Main;

import controller.Ohjain;
import View.Nakyma;
import javafx.application.Application;
import javafx.stage.Stage;

public class Sovellus extends Application {
    @Override
    public void start(Stage ikkuna) {
        Nakyma nakyma = new Nakyma();
        new Ohjain(nakyma);
        nakyma.nayta(ikkuna);
    }

    public static void main(String[] args) {
        launch(args);
    }
}