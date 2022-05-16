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

public class BossLoginController {

    @FXML
    private Button BossLoginID;

    @FXML
    private PasswordField BossLoginPassword;

    @FXML
    private TextField BossLoginUsername;

    @FXML
    private ImageView ExitButtonBossLogin;

    @FXML
    private ImageView MaximizeButtonBossLogin;

    @FXML
    private ImageView MinimizeButtonBossLogin;

    @FXML
    void BossLogin(ActionEvent event) throws IOException {
        if((BossLoginUsername.getText().equals("admin") && BossLoginPassword.getText().equals("admin")) == false){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Bejelentkezési hiba!");
            alert.setHeaderText("Hibás felhasználónév/jelszó!");
            alert.setContentText("Kérlek próbáld újra!");
            alert.showAndWait();
            App.setRoot("BossLogin");
        }
    		if(ValidateLogin.bossLoginValidate(BossLoginUsername.getText(),BossLoginPassword.getText())) {
    			App.setRoot("MainGuiBoss");
    		}

    }

    @FXML
    void ExitClickedBossLogin(MouseEvent event) {

    }

    @FXML
    void MaximizeClickedBossLogin(MouseEvent event) {

    }

    @FXML
    void MinimizeClickedBossLogin(MouseEvent event) {

    }

}
