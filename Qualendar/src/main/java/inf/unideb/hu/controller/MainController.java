package inf.unideb.hu.controller;

import java.io.IOException;

import inf.unideb.hu.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private ImageView ExitButtonMain;

    @FXML
    private Button LoginBossID;

    @FXML
    private Button LoginWorkerID;

    @FXML
    private ImageView MaximizeButtonMain;

    @FXML
    private ImageView MinimizeButtonMain;

    @FXML
    void ExitClickedMain(MouseEvent event) {

    }

    @FXML
    void LoginBoss(ActionEvent event) throws IOException {
    	App.setRoot("BossLogin");
    }

    @FXML
    void LoginWorker(ActionEvent event) throws IOException {
    	App.setRoot("WorkerLogin");
    }

    @FXML
    void MaximizeClickedMain(MouseEvent event) {
    	
    }

    @FXML
    void MinimizeClickedMain(MouseEvent event) {

    }

}
