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
	private Button BackAddNewWorker;

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
    			//Hiba ??zenet k??sz??t??se az admin sz??m??ra
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Regisztr??ci??s hiba!");
                alert.setHeaderText("Hi??nyos adat a regisztr??ci??ban!");
                alert.setContentText("Minden mez?? kit??lt??se k??telez??!");
                alert.showAndWait();
                App.setRoot("AddNewWorker");
    		}
            //vizsg??lni az emailt nevet stb stb helyess??g??t
            else if(newWorkerFirstname.length() < 3){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Regisztr??ci??s hiba!");
                alert.setHeaderText("Hib??s adat a regisztr??ci??ban");
                alert.setContentText("Vezet??kn??v hossza legal??bb 3 karakter kell, hogy legyen!");
                alert.showAndWait();
                App.setRoot("AddNewWorker");
            }
            else if(newWorkerLastname.length() < 3){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Regisztr??ci??s hiba!");
                alert.setHeaderText("Hib??s adat a regisztr??ci??ban");
                alert.setContentText("Keresztn??v hossza legal??bb 3 karakter kell, hogy legyen!");
                alert.showAndWait();
                App.setRoot("AddNewWorker");
            }
            else if(newWorkerPassword.equals(newWorkerPasswordAgain) == false){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Regisztr??ci??s hiba!");
                alert.setHeaderText("Hib??s adat a regisztr??ci??ban");
                alert.setContentText("Nem egyezik meg a k??t jelsz??!");
                alert.showAndWait();
                App.setRoot("AddNewWorker");
            }
            else if(!isEmailValid(newWorkerEmail)){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Regisztr??ci??s hiba!");
                alert.setHeaderText("Hib??s adat a regisztr??ci??ban");
                alert.setContentText("Rossz e-mail form??tum!");
                alert.showAndWait();
                App.setRoot("AddNewWorker");
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

                //Mett??l meddig ki dolgozik
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
    			
    			//ment??s
    			try(JPAEmployeeDAO empDao = new JPAEmployeeDAO()){
    				empDao.saveEmployee(emp);
    				App.setRoot("MainGuiBoss");
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    		}
    	
    	
    	//hozz??ad??s ut??n visszat??r a MainGUIBoss ablakba
    	//App.setRoot("MainGuiBoss");
    }


	@FXML
	void BackButtonAddNewWorker(ActionEvent event) throws IOException {
		App.setRoot("MainGUIBoss");
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
        String ePattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
}
