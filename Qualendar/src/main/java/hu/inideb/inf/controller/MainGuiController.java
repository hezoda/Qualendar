package hu.inideb.inf.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainGuiController {

    @FXML
    private ImageView ExitButtonMainGUI;

    @FXML
    private ImageView MaximizeButtonMainGUI;

    @FXML
    private ImageView MinimizeButtonMainGUI;

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
    void ExitClickedMainGUI(MouseEvent event) {

    }

    @FXML
    void MaximizeClickedMainGUI(MouseEvent event) {

    }

    @FXML
    void MinimizeClickedMainGUI(MouseEvent event) {

    }

    @FXML
    void SendLeave(ActionEvent event) {

    }

    @FXML
    void WorkerSendSickPay(ActionEvent event) {

    }

}
