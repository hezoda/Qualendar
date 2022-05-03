package inf.unideb.hu;

import inf.unideb.hu.model.Admin;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ValidateLogin {
	
	
	public static boolean bossLoginValidate(String username, String password) {
		if(Admin.getAdminName().equals(username) && Admin.getAdminPasswd().equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}

}
