package PetApp;


import controllers.PetController;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import models.PetModel;
import view.PetView;

public class PetApp extends Application {
    @Override
    public void start(Stage stage) {
        int canvasSize = 400;

        // Luodaan MVC-komponentit
        PetModel model = new PetModel(canvasSize / 2, canvasSize / 2);
        PetView view = new PetView(canvasSize);
        new PetController(model, view);

        // Luodaan näkymä ja ikkuna
        StackPane root = new StackPane(view.getCanvas());
        stage.setScene(new Scene(root, canvasSize, canvasSize));
        stage.setTitle("Virtuaalilemmikki");
        stage.show();

        // Animaatio (päivitetään jatkuvasti)
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                model.updatePosition(); // Päivitetään malli
                view.draw(model);       // Piirretään näkymä
            }
        }.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

