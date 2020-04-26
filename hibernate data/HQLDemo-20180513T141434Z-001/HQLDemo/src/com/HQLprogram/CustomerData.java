package com.HQLprogram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerData {

	public static void main(String[] args)
	{
		CustomerDTO cdto = new CustomerDTO();
		cdto.setFirstname("chandan");
		cdto.setLastname("gupta");
		cdto.setMobile(9977400556l);
		cdto.setAddress("LIG Colony");
		cdto.setCity("Indore");
		cdto.setPincode(452202);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(cdto);
		tx.commit();
		session.close();
	}
}