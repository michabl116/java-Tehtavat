package View;

import Model.Valuutta;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Nakyma {
    private final TextField maaraKentta = new TextField();
    private final TextField tulosKentta = new TextField();
    private final ComboBox<Valuutta> lahtoValikko = new ComboBox<>();
    private final ComboBox<Valuutta> kohdeValikko = new ComboBox<>();
    private final Button muunnaNappi = new Button("Muunna");

    public void nayta(Stage ikkuna) {
        VBox asettelu = new VBox(10);

        tulosKentta.setEditable(false);
        lahtoValikko.setPromptText("Valitse lähdevaluutta");
        kohdeValikko.setPromptText("Valitse kohdevaluutta");


        asettelu.getChildren().addAll(
                new Label("Määrä:"), maaraKentta,
                new Label("Lähdevaluutta:"), lahtoValikko,
                new Label("Kohdevaluutta:"), kohdeValikko,
                muunnaNappi,
                new Label("Tulos:"), tulosKentta
        );


        asettelu.setStyle("-fx-padding: 15; -fx-font-family: sans-serif;");

        ikkuna.setScene(new Scene(asettelu, 300, 400));
        ikkuna.setTitle("Valuutta");
        ikkuna.show();
    }

    public TextField getMaaraKentta() { return maaraKentta; }
    public ComboBox<Valuutta> getLahtoValikko() { return lahtoValikko; }
    public ComboBox<Valuutta> getKohdeValikko() { return kohdeValikko; }
    public Button getMuunnaNappi() { return muunnaNappi; }
    public TextField getTulosKentta() { return tulosKentta; }
}