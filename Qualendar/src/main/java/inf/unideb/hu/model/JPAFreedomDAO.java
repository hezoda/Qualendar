package inf.unideb.hu.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPAFreedomDAO implements FreedomDAO{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hu.inf.emp");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	@Override
	public void sendFreedom(Freedom fr) {
		entityManager.getTransaction().begin();
        entityManager.persist(fr);
        entityManager.getTransaction().commit();
		
	}

	@Override
	public void answearFreedom(Freedom fr) {
		entityManager.getTransaction().begin();
        entityManager.persist(fr);
        entityManager.getTransaction().commit();
		
	}

	@Override
	public List<Freedom> getFreedoms(Freedom fr) {
		TypedQuery<Freedom> query = entityManager.createQuery("SELECT fr FROM Employee fr", Freedom.class); //vagy valami ilyesmi kell
        List<Freedom> freedom = query.getResultList();
        return freedom;
	}
	

}
