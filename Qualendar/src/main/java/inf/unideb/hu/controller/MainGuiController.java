package inf.unideb.hu.controller;

import java.io.IOException;
import java.time.LocalDate;

import inf.unideb.hu.App;
import inf.unideb.hu.model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainGuiController {

    @FXML
    private Button BackMainGUI;

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
    void BackButtonMainGUI(ActionEvent event) throws IOException {
        App.setRoot("WorkerLogin");
    }
    @FXML
    void SendLeave(ActionEvent event) throws IOException {
    	LocalDate startDate = WorkerLeaveDateStart.getValue();
    	LocalDate endDate = WorkerLeaveDateEnd.getValue();
        if(endDate == null || startDate == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba!");
            alert.setHeaderText("Nem lehet üres a szabadság vége és/vagy kezdete mező!");
            alert.setContentText("Kérlek add meg a szabadság kezdetét és a végét újra!");
            alert.showAndWait();
            App.setRoot("MainGUI");
        }
    	else {
    	}
    }

    @FXML
    void WorkerSendSickPay(ActionEvent event) throws IOException {
    	LocalDate startSick = WorkerSickDayStart.getValue();
    	LocalDate endSick = WorkerLeaveDateEnd.getValue(); //bár nem tudod mikor gyógyulsz meg...
        if(endSick == null || startSick == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba!");
            alert.setHeaderText("Nem lehet üres a táppénz vége és/vagy kezdete mező!");
            alert.setContentText("Kérlek add meg a táppénz kezdetét és a végét újra!");
            alert.showAndWait();
            App.setRoot("MainGUI");
        }
    	else {
    	}
    }

}
