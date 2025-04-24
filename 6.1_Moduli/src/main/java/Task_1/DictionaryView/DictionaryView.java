package Task_1.DictionaryView;

import Task_1.DictionaryController.DictionaryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private DictionaryController controlador;

    @Override
    public void start(Stage stage) {
        controlador = new DictionaryController();

        Label etiqueta = new Label("Ingrese una palabra:");
        TextField campoTexto = new TextField();
        Button botonBuscar = new Button("Buscar");
        Label resultado = new Label();

        botonBuscar.setOnAction(e -> {
            String palabra = campoTexto.getText();
            resultado.setText(controlador.buscarSignificado(palabra));
        });

        FlowPane layout = new FlowPane(10, 10, etiqueta, campoTexto, botonBuscar, resultado);
        Scene escena = new Scene(layout, 400, 200);

        stage.setTitle("Diccionario Virtual");
        stage.setScene(escena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
