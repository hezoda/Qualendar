package inf.unideb.hu.controller;

import inf.unideb.hu.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SendLeaveController {

    @FXML
    private Button BackSzabadsag;

    @FXML
    private TextField SzabadsagEmail;

    @FXML
    private DatePicker SzabadsagKezdet;

    @FXML
    private TextField SzabadsagNev;

    @FXML
    private Button SzabadsagTarol;

    @FXML
    private DatePicker SzabadsagVeg;

    @FXML
    void SzabadsagGombTarol(ActionEvent event) {

    }

    @FXML
    void BackButtonSzabadsag(ActionEvent event) throws IOException {
        App.setRoot("MainGUIBoss");
    }

}
