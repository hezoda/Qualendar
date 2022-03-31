package hu.inideb.inf;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application{

	@Override
    public void start(Stage stage) throws Exception {
		System.out.println("Működöm");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
