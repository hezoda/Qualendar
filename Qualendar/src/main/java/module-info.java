module inf.unideb.hu {
    requires javafx.controls;
    requires javafx.fxml;
	requires com.h2database;
	requires java.sql;

    opens inf.unideb.hu.controller to javafx.fxml;
    opens inf.unideb.hu to javafx.fxml;
    exports inf.unideb.hu;
}
