package inf.unideb.hu.controller;

import inf.unideb.hu.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SendSickPayController {

    @FXML
    private Button BackTappenz;

    @FXML
    private TextField TappenzEmail;

    @FXML
    private DatePicker TappenzKezdet;

    @FXML
    private TextField TappenzNev;

    @FXML
    private Button TappenzTarol;

    @FXML
    private DatePicker TappenzVeg;

    @FXML
    void TappenzGombTarol(ActionEvent event) {
        //TODO
    }

    @FXML
    void BackButtonTappenz(ActionEvent event) throws IOException {
        App.setRoot("MainGUIBoss");
    }

}
