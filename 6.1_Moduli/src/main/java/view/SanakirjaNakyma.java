package view;

import Controller.SanakirjaOhjain;
import model.Sanakirja;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class SanakirjaNakyma extends Application {
    private SanakirjaOhjain ohjain;

    @Override
    public void start(Stage primaryStage) {
        Sanakirja sanakirja = new Sanakirja();
        ohjain = new SanakirjaOhjain(sanakirja);

        TextField sanaKentta = new TextField();
        sanaKentta.setPromptText("Syötä sana");

        Button haeNappi = new Button("Hae");

        Label tulosLabel = new Label();

        haeNappi.setOnAction(e -> {
            String sana = sanaKentta.getText();
            if (sana.isEmpty()) {
                tulosLabel.setText("Ole hyvä ja syötä sana.");
            } else {
                String merkitys = ohjain.haeSana(sana);
                tulosLabel.setText(merkitys);
            }
        });

        FlowPane root = new FlowPane(10, 10, sanaKentta, haeNappi, tulosLabel);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle(" Sanakirja");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

