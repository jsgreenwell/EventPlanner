package event;

import java.util.List;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomeController {

  @FXML
  private TextField txtName;
  @FXML
  private TextField nameField;

  public void greetMeActivated(ActionEvent actionEvent) {
    nameField.setText("Hello " + txtName.getText() + "!");
  }
}
