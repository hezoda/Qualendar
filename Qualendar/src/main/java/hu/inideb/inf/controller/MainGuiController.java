package hu.inideb.inf.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainGuiController {

    @FXML
    private Button SendLeaveID;

    @FXML
    private Label WorkerEmail;

    @FXML
    private DatePicker WorkerLeaveDateEnd;

    @FXML
    private DatePicker WorkerLeaveDateStart;

    @FXML
    private Label WorkerName;

    @FXML
    private Label WorkerPosition;

    @FXML
    private Button WorkerSendSickPayID;

    @FXML
    private DatePicker WorkerSickDayEnd;

    @FXML
    private DatePicker WorkerSickDayStart;

    @FXML
    void SendLeave(ActionEvent event) {

    }

    @FXML
    void WorkerSendSickPay(ActionEvent event) {

    }

}