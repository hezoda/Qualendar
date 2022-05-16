package inf.unideb.hu.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPASickPayDAO implements SickPayDAO{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hu.inf.emp");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	@Override
	public void SendSickPay(SickPay sp) {
		entityManager.getTransaction().begin();
        entityManager.persist(sp);
        entityManager.getTransaction().commit();
		
	}

	@Override
	public void answearSickPay(SickPay sp) {
		entityManager.getTransaction().begin();
        entityManager.persist(sp);
        entityManager.getTransaction().commit();
		
	}

	@Override
	public List<SickPay> getSickPay(SickPay sp) {
		TypedQuery<SickPay> query = entityManager.createQuery("SELECT sp FROM SickPay sp", SickPay.class); //vagy valami ilyesmi kell
        List<SickPay> sickpay = query.getResultList();
        return sickpay;
	}

}
