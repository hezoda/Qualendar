package inf.unideb.hu.controller;

import java.io.IOException;

import inf.unideb.hu.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class WorkerLoginController {

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
    void WorkerLogin(ActionEvent event) throws IOException {
    	//csak hogy tovább lehessen haladni a munkával
    	if(WorkerLoginUsername.getText().equals("test") && WorkerLoginPassword.getText().equals("test")) {
    		App.setRoot("MainGUI");
    	}
    }

}
