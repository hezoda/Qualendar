package hu.inideb.inf.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class AddNewWorkerController {

    @FXML
    private TextField AddNewWorkerEmail;

    @FXML
    private TextField AddNewWorkerFirstName;

    @FXML
    private Button AddNewWorkerID;

    @FXML
    private TextField AddNewWorkerLastName;

    @FXML
    private PasswordField AddNewWorkerPassword;

    @FXML
    private PasswordField AddNewWorkerPasswordAgain;

    @FXML
    private RadioButton PositionEE;

    @FXML
    private RadioButton PositionKonyvelo;

    @FXML
    private RadioButton PositionKutato;

    @FXML
    private RadioButton PositionMarketing;

    @FXML
    private ToggleGroup Working;

    @FXML
    void AddNewWorker(ActionEvent event) {

    }

}
