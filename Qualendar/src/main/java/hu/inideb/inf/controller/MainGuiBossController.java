package hu.inideb.inf.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class MainGuiBossController {

    @FXML
    private Button AddNewWorkerID;

    @FXML
    private Label BossEmail;

    @FXML
    private Label BossName;

    @FXML
    private TableColumn<String, String> BossWorkerLeaveEnd;

    @FXML
    private TableColumn<String, String> BossWorkerLeaveName;

    @FXML
    private TableColumn<String, String> BossWorkerLeaveStart;

    @FXML
    private TableColumn<String, String> BossWorkerSickDayEnd;

    @FXML
    private TableColumn<String, String> BossWorkerSickDayName;

    @FXML
    private TableColumn<String, String> BossWorkerSickDayStart;

    @FXML
    private TableColumn<String, String> WorkerListEmail;

    @FXML
    private TableColumn<String, String> WorkerListName;

    @FXML
    private TableColumn<String, String> WorkerListPosition;

    @FXML
    void AddNewWorker(ActionEvent event) {

    }
