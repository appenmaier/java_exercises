package jappuccini.apps.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

  @FXML
  private TextField inputTextField;
  @FXML
  private Label outputLabel;
  private Model model;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    model = Model.getInstance();
  }

  @FXML
  public void calculate(ActionEvent actionEvent) {
    String input = inputTextField.getText();
    String output = model.calculate(input);
    outputLabel.setText(output);
  }

}
