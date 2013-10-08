package spring.webapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import spring.webapp.model.UserModel;

public class FormDAO {
	
	public void saveForm(UserModel userModel){
		
		//UserModel um = new UserModel();
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userModel);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
