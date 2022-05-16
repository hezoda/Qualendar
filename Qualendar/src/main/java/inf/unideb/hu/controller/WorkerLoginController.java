package inf.unideb.hu.controller;

import java.io.IOException;

import inf.unideb.hu.App;
import inf.unideb.hu.ValidateLogin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class WorkerLoginController {

    @FXML
    private Button BackWorkerLogin;

    @FXML
    private ImageView ExitButtonWorkerLogin;

    @FXML
    private ImageView MaximizeButtonWorkerLogin;

    @FXML
    private ImageView MinimizeButtonWorkerLogin;

    @FXML
    private Button WorkerLoginID;

    @FXML
    private PasswordField WorkerLoginPassword;

    @FXML
    private TextField WorkerLoginUsername;

    @FXML
    void ExitClickedWorkerLogin(MouseEvent event) {

    }

    @FXML
    void MaximizeClickedWorkerLogin(MouseEvent event) {

    }

    @FXML
    void MinimizeClickedWorkerLogin(MouseEvent event) {

    }

    @FXML
    void BackButtonWorkerLogin(ActionEvent event) throws IOException {
        App.setRoot("Main");
    }

    @FXML
    void WorkerLogin(ActionEvent event) throws IOException {
    	String username = WorkerLoginUsername.getText();
    	String passwd = WorkerLoginPassword.getText();
    	if(ValidateLogin.workerLoginValidate(username, passwd)) {
    		App.setRoot("MainGUI");
    	}
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Bejelentkezési hiba!");
            alert.setHeaderText("Helytelen felhasználónév/jelszó");
            alert.setContentText("Próbáld meg újra!");
            alert.showAndWait();
            App.setRoot("WorkerLogin");
        }
    }

}
