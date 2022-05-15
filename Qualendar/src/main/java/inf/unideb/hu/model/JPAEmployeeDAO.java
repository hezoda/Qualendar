package inf.unideb.hu.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPAEmployeeDAO implements EmployeeDAO {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hu.inf.emp");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	@Override
	public void close() throws Exception {
		entityManager.close();
		entityManagerFactory.close();
	}

	@Override
	public void saveEmployee(Employee emp) {
		entityManager.getTransaction().begin();
        entityManager.persist(emp);
        entityManager.getTransaction().commit();
	}

	@Override
	public void deleteEmployee(Employee emp) {
		entityManager.getTransaction().begin();
        entityManager.remove(emp);
        entityManager.getTransaction().commit();
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		saveEmployee(emp);
		
	}

	@Override
	public List<Employee> getEmployee() {
		TypedQuery<Employee> query = entityManager.createQuery("SELECT emp FROM Employee emp", Employee.class); //vagy valami ilyesmi kell
        List<Employee> employee = query.getResultList();
        return employee;
	}

}
