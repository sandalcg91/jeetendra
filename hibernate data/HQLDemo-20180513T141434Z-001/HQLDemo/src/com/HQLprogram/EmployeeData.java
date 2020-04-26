package com.HQLprogram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeData {

	public static void main(String[] args)
	{
		EmployeeDTO edto = new EmployeeDTO();
		edto.setFirstname("chandan");
		edto.setLastname("gupta");
		edto.setMobile(9977400556l);
		edto.setSalary(75000);
		edto.setAddress("LIG Colony");
		edto.setCity("Indore");
		edto.setPincode(452202);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(edto);
		tx.commit();
		session.close();
	}
}