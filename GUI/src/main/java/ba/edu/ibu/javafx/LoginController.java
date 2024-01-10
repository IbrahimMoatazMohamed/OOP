package ba.edu.ibu.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;


public class LoginController implements Initializable {
    @FXML
    public Button btnLogin;
    @FXML
    private TextField email;
    @FXML
    private TextField password;
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    void login(ActionEvent event) throws IOException {
        switchToStudentsScreen(event);
    }

    static void showError(String title, String message) {
        Locale.setDefault(Locale.ENGLISH);
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle(title);
        error.setHeaderText(message);
        error.show();
    }
    void switchToStudentsScreen(ActionEvent event) throws IOException {
//        if (DBConnection.isEmail(email.getText(), password.getText())){
            root = FXMLLoader.load(getClass().getResource("students.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            return;
//        }
//        showError("Login Error", "Your password or email not correct");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
