package inf.unideb.hu;

import java.util.Iterator;

import org.hibernate.mapping.List;

import inf.unideb.hu.model.Admin;
import inf.unideb.hu.model.Employee;
import inf.unideb.hu.model.EmployeeDAO;
import inf.unideb.hu.model.JPAEmployeeDAO;
import javafx.scene.control.Alert;

public class ValidateLogin {

	public static boolean bossLoginValidate(String username, String password) {
		if (Admin.getAdminName().equals(username) && Admin.getAdminPasswd().equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean workerLoginValidate(String username, String password) {
		boolean valid = false;
		try (JPAEmployeeDAO empDao = new JPAEmployeeDAO()) {
			
			//TO-DO befejezni
			for (Employee emp : empDao.getEmployee()) {
				System.out.println(emp.getUserName());
				if (emp.getUserName().equals(username)) {
					System.out.println("username vizsgálva");
					if (emp.getPassword().equals(password)) {
						valid = true;
					} else {
						Alert alert = new Alert(Alert.AlertType.ERROR);
						alert.setTitle("Bejelentkezési hiba!");
						alert.setHeaderText("Hibás felhasználónév/jelszó!");
						alert.setContentText("Kérlek próbáld újra!");
						alert.showAndWait();
						App.setRoot("WorkerLogin");
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return valid;
	}

}
