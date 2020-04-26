package com.cache.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeData {

	public static void main(String[] args)
	{
		EmployeeDTO dto = new EmployeeDTO();
		dto.setFirstname("payal");
		dto.setLastname("nemade");
		dto.setDesignation("Sr. Programmer");
		dto.setSalary(85000);
		dto.setAddress("Sc no 136");
		dto.setCity("indore");
		dto.setPincode(452001);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(dto);
		tx.commit();
		session.close();
	}
}