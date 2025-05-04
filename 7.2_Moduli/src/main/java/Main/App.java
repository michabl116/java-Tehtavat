package Main;


import View.ConversorView;
import controller.ConversorController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage ikkuna) {
        // Luodaan näkymä ja ohjain
        ConversorView nakyma = new ConversorView(ikkuna);
        new ConversorController(nakyma);

        // Näytetään ikkuna
        ikkuna.show();
    }
}

