package inf.unideb.hu.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainGuiBossController {

    @FXML
    private Button AddNewWorkerID;

    @FXML
    private Label BossEmail;

    @FXML
    private Label BossName;

    @FXML
    private TableColumn<?, ?> BossWorkerLeaveEnd;

    @FXML
    private TableColumn<?, ?> BossWorkerLeaveName;

    @FXML
    private TableColumn<?, ?> BossWorkerLeaveStart;

    @FXML
    private TableColumn<?, ?> BossWorkerSickDayEnd;

    @FXML
    private TableColumn<?, ?> BossWorkerSickDayName;

    @FXML
    private TableColumn<?, ?> BossWorkerSickDayStart;

    @FXML
    private ImageView ExitButtonMainGUIBoss;

    @FXML
    private ImageView MaximizeButtonMainGUIBoss;

    @FXML
    private ImageView MinimizeButtonMainGUIBoss;

    @FXML
    private TableColumn<?, ?> WorkerListEmail;

    @FXML
    private TableColumn<?, ?> WorkerListName;

    @FXML
    private TableColumn<?, ?> WorkerListPosition;

    @FXML
    void AddNewWorker(ActionEvent event) {

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

}
