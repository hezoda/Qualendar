package inf.unideb.hu.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Locale;
import java.util.logging.Level;

import inf.unideb.hu.App;
import inf.unideb.hu.model.Employee;
import inf.unideb.hu.model.Freedom;
import inf.unideb.hu.model.SickPay;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainGuiBossController {
    @FXML
    private Button BackMainGUIBoss;

    @FXML
    private Button AddNewWorkerID;

    @FXML
    private Label BossEmail;

    @FXML
    private Button SzabadsagFonokBeiras;

    @FXML
    private Button TappenzFonokBeiras;

    @FXML
    private TableView<Employee> WorkersTable;

    @FXML
    private TableView<SickPay> SickPayTable;

    @FXML
    private TableView<Freedom> FreedomTable;

    @FXML
    private Label BossName;

    @FXML
    private TableColumn<Freedom, LocalDate> BossWorkerLeaveEnd;

    @FXML
    private TableColumn<Freedom, String> BossWorkerLeaveName;

    @FXML
    private TableColumn<Freedom, LocalDate> BossWorkerLeaveStart;

    @FXML
    private TableColumn<SickPay, LocalDate> BossWorkerSickDayEnd;

    @FXML
    private TableColumn<SickPay, String> BossWorkerSickDayName;

    @FXML
    private TableColumn<SickPay, LocalDate> BossWorkerSickDayStart;

    @FXML
    private ImageView ExitButtonMainGUIBoss;

    @FXML
    private ImageView MaximizeButtonMainGUIBoss;

    @FXML
    private ImageView MinimizeButtonMainGUIBoss;

    @FXML
    private TableColumn<Employee, String> WorkerListEmail;

    @FXML
    private TableColumn<Employee, String> WorkerListName;

    @FXML
    private TableColumn<Employee, String> WorkerListPosition;

    @FXML
    void AddNewWorker(ActionEvent event) throws IOException {
    	App.setRoot("AddNewWorker");
    }

    @FXML
    void ExitClickedMainGUIBoss(MouseEvent event) {

    }

    @FXML
    void MaximizeClickedMainGUIBoss(MouseEvent event) {

    }

    @FXML
    void MinimizeClickedMainGUIBoss(MouseEvent event) {

    }

    @FXML
    void BackButtonMainGUIBoss(ActionEvent event) throws IOException {
        App.setRoot("BossLogin");
    }

    @FXML
    void SzabadsagGombFonokBeiras(ActionEvent event) throws IOException {
        App.setRoot("SendLeave");
    }

    @FXML
    void TappenzGombFonokBeiras(ActionEvent event) throws IOException {
        App.setRoot("SendSickPay");
    }

}
