package inf.unideb.hu.controller;

import inf.unideb.hu.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class SendSickPayController {

    @FXML
    private Button BackTappenz;

    @FXML
    private TextField TappenzEmail;

    @FXML
    private DatePicker TappenzKezdet;

    @FXML
    private TextField TappenzNev;

    @FXML
    private Button TappenzTarol;

    @FXML
    private DatePicker TappenzVeg;

    @FXML
    void TappenzGombTarol(ActionEvent event) throws IOException {
        String nev = TappenzNev.getText();
        String email = TappenzEmail.getText();
        LocalDate kezdet = TappenzKezdet.getValue();
        LocalDate veg = TappenzVeg.getValue();
        if(nev.equals("") || email.equals("") || kezdet == null || veg == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Táppénz beírás hiba!");
            alert.setHeaderText("Hiányos adat a beírásban!");
            alert.setContentText("Minden mező kitöltése kötelező!");
            alert.showAndWait();
            App.setRoot("SendSickPay");
        }
        else if(!isEmailValid(email)){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Regisztrációs hiba!");
            alert.setHeaderText("Hibás adat a regisztrációban");
            alert.setContentText("Rossz e-mail formátum!");
            alert.showAndWait();
            App.setRoot("SendSickPay");
        }
        else if(kezdet.isAfter(veg)){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Regisztrációs hiba!");
            alert.setHeaderText("Hibás adat a regisztrációban");
            alert.setContentText("A kezdetnek korábban kell lennie mint a végnek!");
            alert.showAndWait();
            App.setRoot("SendSickPay");
        }
        else if(kezdet.isEqual(veg)){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Regisztrációs hiba!");
            alert.setHeaderText("Hibás adat a regisztrációban");
            alert.setContentText("A kezdet és a vég nem lehet ugyanazon a napon!");
            alert.showAndWait();
            App.setRoot("SendSickPay");
        }
        else{
            App.setRoot("MainGUIBoss");
            //TODO Kuldes
        }
    }

    @FXML
    void BackButtonTappenz(ActionEvent event) throws IOException {
        App.setRoot("MainGUIBoss");
    }

    public static boolean isEmailValid(String email) {
        String ePattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

}
