import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import inf.unideb.hu.model.Employee;
import inf.unideb.hu.model.EmployeeDAO;
import inf.unideb.hu.model.JPAEmployeeDAO;

public class JPAEmployeeDAOTest {

	@Test
	void isSaved() {
		Employee testemp = new Employee();
		testemp.setFullName("Aranyosi Kati");
		testemp.setEmail("katika@web.hu");
		testemp.setUserName("AraKat");
		
		EmployeeDAO empDao = new JPAEmployeeDAO();
		empDao.saveEmployee(testemp);
		
		var users = empDao.getEmployee();
        assertTrue(users.contains(testemp));
	}
	@Test
	void isDeleted() {
		Employee testemp = new Employee();
		testemp.setFullName("Aranyosi Kati");
		testemp.setEmail("katika@web.hu");
		testemp.setUserName("AraKat");
		
		EmployeeDAO empDao = new JPAEmployeeDAO();
		var users = empDao.getEmployee();
		
		if (!users.contains(testemp)) {
			empDao.saveEmployee(testemp);
        }
		empDao.deleteEmployee(testemp);

        var updated_users = empDao.getEmployee();

        assertFalse(updated_users.contains(testemp));
	}
}
