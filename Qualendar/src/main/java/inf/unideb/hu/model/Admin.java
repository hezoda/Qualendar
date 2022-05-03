package inf.unideb.hu.model;

public class Admin {
	
	private static String adminName = "admin";
	private static String adminPasswd = "admin";

	public static String getAdminName() {
		return adminName;
	}

	public static String getAdminPasswd() {
		return adminPasswd;
	}

	public static boolean FreedomAnswer() {
		//TO-DO
		return false;
	}
	
	public static boolean sickPayRatification() {
		//TO-DO
		return true;
	}
}
