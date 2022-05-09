package inf.unideb.hu.model;

import java.util.List;

public interface EmployeeDAO extends AutoCloseable{
	
	public void saveEmployee(Employee emp);
	public void deleteEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public List<Employee> getEmployee(Employee emp);
}
