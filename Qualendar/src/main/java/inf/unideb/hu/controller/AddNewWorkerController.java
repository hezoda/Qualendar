package inf.unideb.hu.controller;

import java.io.IOException;

import inf.unideb.hu.App;
import inf.unideb.hu.model.Employee;
import inf.unideb.hu.model.Employee.PositionType;
import inf.unideb.hu.model.JPAEmployeeDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class AddNewWorkerController {

    @FXML
    private TextField AddNewWorkerEmail;

    @FXML
    private TextField AddNewWorkerFirstName;

    @FXML
    private Button AddNewWorkerID;

    @FXML
    private TextField AddNewWorkerLastName;

    @FXML
    private PasswordField AddNewWorkerPassword;

    @FXML
    private PasswordField AddNewWorkerPasswordAgain;

    @FXML
    private ImageView ExitButtonAddNewWorker;

    @FXML
    private ImageView MaximizeButtonAddNewWorker;

    @FXML
    private ImageView MinimizeButtonAddNewWorker;

    @FXML
    private RadioButton PositionEE;

    @FXML
    private RadioButton PositionKonyvelo;

    @FXML
    private RadioButton PositionKutato;

    @FXML
    private RadioButton PositionMarketing;

    @FXML
    private ToggleGroup Working;

    @FXML
    void AddNewWorker(ActionEvent event) throws IOException {
    	String newWorkerEmail = AddNewWorkerEmail.getText();
    	String newWorkerFirstname = AddNewWorkerFirstName.getText();
    	String newWorkerLastname = AddNewWorkerLastName.getText();
    	String newWorkerPassword = AddNewWorkerPassword.getText();
    	String newWorkerPasswordAgain = AddNewWorkerPasswordAgain.getText();
    	PositionType newWorkerPosition = PositionType.NULL;
    	
    	if(PositionEE.isSelected()) {
    		newWorkerPosition = PositionType.EmberiEroforrasok;
    	}else if(PositionKonyvelo.isSelected()) {
    		newWorkerPosition = PositionType.Konyvelo;
    	}else if(PositionKutato.isSelected()) {
    		newWorkerPosition = PositionType.Kutato;
    	}else if(PositionMarketing.isSelected()) {
    		newWorkerPosition = PositionType.Marketing;
    	}
    	
    	
    		if(newWorkerEmail.equals("") 
    				|| newWorkerFirstname.equals("") 
    				|| newWorkerFirstname.equals("")
    				|| newWorkerPassword.equals("")
    				|| newWorkerPasswordAgain.equals("")
    				|| newWorkerPosition.equals(PositionType.NULL)){
    			//Hiba üzenet készítése az admin számára
    			//vizsgálni az emailt nevet stb stb helyességét
    			
    		}else if(newWorkerPassword.equals(newWorkerPasswordAgain)) {
    			
    			StringBuilder sb = new StringBuilder();
    			sb.append(newWorkerFirstname.substring(0,3));
    			sb.append(newWorkerLastname.substring(0, 3));
    			Employee emp = new Employee();
    			emp.setName(sb.toString());
    			emp.setPosition(newWorkerPosition);
    			emp.setSchedule("");
    			
    			//mentés
    			try(JPAEmployeeDAO empDao = new JPAEmployeeDAO()){
    				empDao.saveEmployee(emp);
    				App.setRoot("MainGuiBoss");
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    		}
    	
    	
    	//hozzáadás után visszatér a MainGUIBoss ablakba
    	//App.setRoot("MainGuiBoss");
    }

    @FXML
    void ExitClickedAddNewWorker(MouseEvent event) {

    }

    @FXML
    void MaximizeClickedAddNewWorker(MouseEvent event) {

    }

    @FXML
    void MinimizeClickedAddNewWorker(MouseEvent event) {

    }

}
