package inf.unideb.hu.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import inf.unideb.hu.App;
import inf.unideb.hu.model.Employee;
import inf.unideb.hu.model.Employee.PositionType;
import inf.unideb.hu.model.JPAEmployeeDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Regisztrációs hiba!");
                alert.setHeaderText("Hiányos adat a regisztrációban!");
                alert.setContentText("Minden mező kitöltése kötelező!");
                alert.showAndWait();
                App.setRoot("AddNewWorker");
    		}
            //vizsgálni az emailt nevet stb stb helyességét
            else if(newWorkerFirstname.length() < 3){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Regisztrációs hiba!");
                alert.setHeaderText("Hibás adat a regisztrációban");
                alert.setContentText("Vezetéknév hossza legalább 3 karakter kell, hogy legyen!");
                alert.showAndWait();
                App.setRoot("AddNewWorker");
            }
            else if(newWorkerLastname.length() < 3){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Regisztrációs hiba!");
                alert.setHeaderText("Hibás adat a regisztrációban");
                alert.setContentText("Keresztnév hossza legalább 3 karakter kell, hogy legyen!");
                alert.showAndWait();
                App.setRoot("AddNewWorker");
            }
            else if(newWorkerPassword.equals(newWorkerPasswordAgain) == false){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Regisztrációs hiba!");
                alert.setHeaderText("Hibás adat a regisztrációban");
                alert.setContentText("Nem egyezik meg a két jelszó!");
                alert.showAndWait();
                App.setRoot("AddNewWorker");
            }
            else if(!isEmailValid(newWorkerEmail)){
            	System.out.println("igen");
            }
            else if(newWorkerPassword.equals(newWorkerPasswordAgain)) {
    			StringBuilder sb = new StringBuilder();
    			sb.append(newWorkerFirstname.substring(0,3));
    			sb.append(newWorkerLastname.substring(0,3));
    			Employee emp = new Employee();
    			StringBuilder sbFullName = new StringBuilder();
    			sbFullName.append(newWorkerFirstname);
    			sbFullName.append(" ");
    			sbFullName.append(newWorkerLastname);
    			emp.setFullName(sbFullName.toString());
    			emp.setUserName(sb.toString());
    			emp.setPosition(newWorkerPosition);

                //Mettől meddig ki dolgozik
                if(newWorkerPosition.equals(PositionType.Kutato)){
                    emp.setSchedule("P - V : 08:00 - 17:00");
                }
                else if(newWorkerPosition.equals(PositionType.EmberiEroforrasok)){
                    emp.setSchedule("H - P : 12:00 - 20:00");
                }
                else if(newWorkerPosition.equals(PositionType.Konyvelo)){
                    emp.setSchedule("H , Sz , P : 08:00 - 20:00");
                }
                else if(newWorkerPosition.equals(PositionType.Marketing)){
                    emp.setSchedule("H - V : 08:00 - 12:00");
                }
                emp.setPassword(newWorkerPassword);
                emp.setEmail(newWorkerEmail);
    			
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

	public static boolean isEmailValid(String email) {
		final Pattern EMAILREGEX = Pattern.compile(
				"[a-z0-9!#$%&'*+/=?^{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_{|}~-]+)@(?:[a-z0-9](?:[a-z0-9-][a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
				Pattern.CASE_INSENSITIVE);
		return EMAILREGEX.matcher(email).matches();
	}
}
