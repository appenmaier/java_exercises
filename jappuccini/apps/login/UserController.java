package jappuccini.apps.login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class UserController implements Initializable {

  @FXML
  private Label greetingsLabel;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    Model model = Model.getInstance();
    User user = model.getUser();
    greetingsLabel.setText("Hallo " + user.getFirstName() + " " + user.getFamilyName());
  }

}
