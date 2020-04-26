package com.HQLprogram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerDataInsert {

	public static void main(String[] args)
	{
		CustomerDTO cdto = new CustomerDTO();
		cdto.setFirstname("taksh");
		cdto.setLastname("malwiya");
		cdto.setMobile(8527413695l);
		cdto.setAddress("abhinav nagar");
		cdto.setCity("bhopal");
		cdto.setPincode(852309);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(cdto);
		tx.commit();
		session.close();
	}
}
