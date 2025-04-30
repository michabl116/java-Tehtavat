package controllers;



import javafx.scene.input.MouseEvent;
import models.PetModel;
import view.PetView;

public class PetController {
    private final PetModel model;
    private final PetView view;

    public PetController(PetModel model, PetView view) {
        this.model = model;
        this.view = view;

        view.getCanvas().setOnMouseMoved(this::onMouseMoved);
        view.getCanvas().setOnMouseExited(e -> model.stopMoving());
    }

    private void onMouseMoved(MouseEvent event) {
        model.setTarget(event.getX(), event.getY());
    }
}

