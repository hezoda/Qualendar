module inf.unideb.hu {
    requires javafx.controls;
    requires javafx.fxml;

    opens inf.unideb.hu.controller to javafx.fxml;
    opens inf.unideb.hu to javafx.fxml;
    exports inf.unideb.hu;
}
