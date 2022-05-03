package inf.unideb.hu.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

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
    private ImageView ExitButtonAddNewWorker;

    @FXML
    private ImageView MaximizeButtonAddNewWorker;

    @FXML
    private ImageView MinimizeButtonAddNewWorker;

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

    @FXML
    void ExitClickedAddNewWorker(MouseEvent event) {

    }

    @FXML
    void MaximizeClickedAddNewWorker(MouseEvent event) {

    }

    @FXML
    void MinimizeClickedAddNewWorker(MouseEvent event) {

    }

}
