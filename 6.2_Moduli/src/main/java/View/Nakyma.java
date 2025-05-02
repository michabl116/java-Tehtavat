package View;

import Model.Valuutta;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Nakyma-luokka, joka luo käyttöliittymän valuutan muuntamiseksi.
public class Nakyma {
    // Käyttöliittymän komponentit
    private final TextField maaraKentta = new TextField();
    private final TextField tulosKentta = new TextField();
    private final ComboBox<Valuutta> lahtoValikko = new ComboBox<>();
    private final ComboBox<Valuutta> kohdeValikko = new ComboBox<>();
    private final Button muunnaNappi = new Button("Muunna");

    // Näyttää käyttöliittymän annetussa ikkunassa.
    public void nayta(Stage ikkuna) {
        VBox asettelu = new VBox(10);

        // Asettaa tuloskentän muokkaamattomaksi.
        tulosKentta.setEditable(false);
        lahtoValikko.setPromptText("Valitse lähdevaluutta");
        kohdeValikko.setPromptText("Valitse kohdevaluutta");

        // Lisää komponentit asetteluun.
        asettelu.getChildren().addAll(
                new Label("Määrä:"), maaraKentta,
                new Label("Lähdevaluutta:"), lahtoValikko,
                new Label("Kohdevaluutta:"), kohdeValikko,
                muunnaNappi,
                new Label("Tulos:"), tulosKentta
        );

        // Asettaa tyylit asettelulle.
        asettelu.setStyle("-fx-padding: 15; -fx-font-family: sans-serif;");

        // Asettaa näkymän ikkunaan ja näyttää sen.
        ikkuna.setScene(new Scene(asettelu, 300, 400));
        ikkuna.setTitle("Valuutta");
        ikkuna.show();
    }

    // Getterit, jotka palauttavat käyttöliittymän komponentit.
    public TextField getMaaraKentta() { return maaraKentta; }
    public ComboBox<Valuutta> getLahtoValikko() { return lahtoValikko; }
    public ComboBox<Valuutta> getKohdeValikko() { return kohdeValikko; }
    public Button getMuunnaNappi() { return muunnaNappi; }
    public TextField getTulosKentta() { return tulosKentta; }
}
