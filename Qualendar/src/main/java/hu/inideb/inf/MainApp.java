package hu.inideb.inf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application{

	@Override
    public void start(Stage stage) throws Exception {
		System.out.println("Működöm");
	
		FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxmls/MainGUI.fxml"));
		Scene scene = new Scene((Parent) loader.load());			

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
