package event;

import Database.DBHandler;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomeController {

  @FXML
  private TextField txtName;
  @FXML
  private TextField nameField;

  Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
  @FXML
  public Button btnHello;


  public void greetMeActivated(ActionEvent actionEvent) throws SQLException {
    DBHandler db = new DBHandler();

    nameField.setText("Hello Employee #" +
        db.getEmpID(txtName.getText().toUpperCase()) + "!");
    db.closeConn();
  }
}
