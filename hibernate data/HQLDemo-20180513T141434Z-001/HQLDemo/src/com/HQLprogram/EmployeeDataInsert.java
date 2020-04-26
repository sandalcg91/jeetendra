package com.HQLprogram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDataInsert {

	public static void main(String[] args)
	{
		EmployeeDTO edto = new EmployeeDTO();
		edto.setFirstname("payal");
		edto.setLastname("nemade");
		edto.setMobile(7777665588l);
		edto.setSalary(100000);
		edto.setAddress("Sc no 136 ");
		edto.setCity("Indore");
		edto.setPincode(452002);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(edto);
		tx.commit();
		session.close();
	}
}
