package jappuccini.apps.circles;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller implements Initializable {

  @FXML
  private Canvas canvas;
  private Model model;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    model = Model.getInstance();

    GraphicsContext g = canvas.getGraphicsContext2D();
    g.setFill(Color.WHITE);
    g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
  }

  @FXML
  public void drawCircle(ActionEvent actionEvent) {
    Circle circle = model.getCircle(0, (int) canvas.getWidth(), 0, (int) canvas.getHeight());

    GraphicsContext g = canvas.getGraphicsContext2D();
    g.setFill(circle.getColor());
    g.fillOval(circle.getX(), circle.getY(), circle.getR() * 2, circle.getR() * 2);
  }

}
