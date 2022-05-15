package inf.unideb.hu;

import inf.unideb.hu.model.Admin;

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
