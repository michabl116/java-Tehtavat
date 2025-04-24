package View;

import Model.Moneda;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConversorView {
    private Stage ikkuna;                  // Sovelluksen pääikkuna
    private ComboBox<Moneda> lahdeValinta; // Lähdevaluutan valintalista
    private ComboBox<Moneda> kohdeValinta; // Kohdevaluutan valintalista
    private TextField syoteKentta;         // Käyttäjän syöttämä määrä
    private TextField tulosKentta;         // Muunnoksen tulos
    private Button muunnaNappi;            // Muunna-nappi

    public ConversorView(Stage ikkuna) {
        this.ikkuna = ikkuna;
        luoNakyma();
    }

    /**
     * Luo sovelluksen käyttöliittymän
     */
    private void luoNakyma() {
        // Luodaan päätaso ja asetetaan tyylit
        VBox paataso = new VBox(10);
        paataso.setPadding(new Insets(15));
        paataso.getStyleClass().add("tausta");

        // Otsikko
        Text otsikko = new Text("Valuutanmuunnin");
        otsikko.setFont(Font.font("sans-serif", 20));

        // Ohjeteksti
        Text ohje = new Text("Valitse lähde- ja kohdevaluutat ja syötä muunnettava määrä");
        ohje.setFont(Font.font("sans-serif", 14));

        // Luodaan lomake syöttökentille
        GridPane lomake = new GridPane();
        lomake.setVgap(10);
        lomake.setHgap(10);
        lomake.setAlignment(Pos.CENTER);

        // Lisätään komponentit lomakkeeseen
        lomake.add(new Label("Lähdevaluuta:"), 0, 0);
        lahdeValinta = new ComboBox<>();
        lomake.add(lahdeValinta, 0, 1);

        lomake.add(new Label("Määrä:"), 0, 2);
        syoteKentta = new TextField();
        syoteKentta.setPromptText("Syötä määrä");
        lomake.add(syoteKentta, 0, 3);

        lomake.add(new Label("Kohdevaluuta:"), 1, 0);
        kohdeValinta = new ComboBox<>();
        lomake.add(kohdeValinta, 1, 1);

        lomake.add(new Label("Tulos:"), 1, 2);
        tulosKentta = new TextField();
        tulosKentta.setEditable(false);
        lomake.add(tulosKentta, 1, 3);

        // Luodaan Muunna-nappi
        muunnaNappi = new Button("Muunna");
        muunnaNappi.getStyleClass().add("nappi");

        // Kootaan kaikki komponentit yhteen
        paataso.getChildren().addAll(otsikko, ohje, lomake, muunnaNappi);
        paataso.setAlignment(Pos.TOP_CENTER);

        // Luodaan näkymä ja asetetaan CSS-tyylitiedosto
        Scene nakyma = new Scene(paataso, 500, 300);
        nakyma.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        ikkuna.setTitle("Valuutanmuunnin");
        ikkuna.setScene(nakyma);
    }

    // Getterit käyttöliittymän komponenteille
    public ComboBox<Moneda> getLahdeValinta() { return lahdeValinta; }
    public ComboBox<Moneda> getKohdeValinta() { return kohdeValinta; }
    public TextField getSyoteKentta() { return syoteKentta; }
    public TextField getTulosKentta() { return tulosKentta; }
    public Button getMuunnaNappi() { return muunnaNappi; }
    public Stage getIkkuna() { return ikkuna; }
}