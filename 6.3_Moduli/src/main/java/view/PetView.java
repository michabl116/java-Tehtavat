package view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import models.PetModel;

public class PetView {
    private final Canvas canvas;
    private final GraphicsContext gc;
    private final Image petImage;

    public PetView(int canvasSize) {
        canvas = new Canvas(canvasSize, canvasSize);
        gc = canvas.getGraphicsContext2D();
        petImage = new Image(getClass().getResource("/view/dog.jpeg").toExternalForm());
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void draw(PetModel model) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        double width = 50;
        double height = 50;
        gc.drawImage(petImage, model.getX() - width / 2, model.getY() - height / 2, width, height);
    }
}
