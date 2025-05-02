package controller;

import Model.Notebook;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.application.Platform;

public class Controller {
    @FXML private TextField titleField;
    @FXML private TextArea contentArea;
    @FXML private VBox notesContainer;
    private final Notebook notebook = new Notebook(); // Improved use of `final`

    @FXML
    public void addNote() {
        String title = titleField.getText().trim();
        String content = contentArea.getText().trim();

        if (!title.isEmpty() && !content.isEmpty()) {
            notebook.addNote(title, content);


            Platform.runLater(() -> {
                Text newNote = new Text("Title: " + title + "\n" + content);
                notesContainer.getChildren().add(newNote);

                titleField.clear();
                contentArea.clear();
            });
        }
    }
}