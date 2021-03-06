package com.cache.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache {

	
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session1 = sessionFactory.openSession();
		EmployeeDTO empl1 = null;
		Object o = (EmployeeDTO)session1.get(EmployeeDTO.class, 2);
		empl1 = (EmployeeDTO)o;
		session1.close();
	//	System.out.println(empl1.getEid()+" "+empl1.getFirstname()+" "+empl1.getLastname()+" "+empl1.getDesignation()+" "+empl1.getSalary()+" "+empl1.getAddress()+" "+empl1.getCity()+" "+empl1.getPincode());
		
		empl1.setSalary(4569877);
		
		Session session2 = sessionFactory.openSession();
		EmployeeDTO empl2 = null;
		Object o1 = (EmployeeDTO)session2.get(EmployeeDTO.class, 2);
		empl2 = (EmployeeDTO)o1;
		Transaction tx = session2.beginTransaction();
	  
		session2.merge(empl1);
		
	//	session2.update(empl1); // - throws an exception -  org.hibernate.NonUniqueObjectException: a different object with the same identifier value was already associated with the session
		
		tx.commit();
	    
	//
		session2.close();
		
		/*Session session2 = sessionFactory.openSession();
		EmployeeDTO empl2 = (EmployeeDTO)session2.load(EmployeeDTO.class, 1);
		System.out.println(empl2.getEid()+" "+empl2.getFirstname()+" "+empl2.getLastname()+" "+empl2.getDesignation()+" "+empl2.getSalary()+" "+empl2.getAddress()+" "+empl2.getCity()+" "+empl2.getPincode());
		session2.close();
		
		Session session3 = sessionFactory.openSession();
		EmployeeDTO empl3 = (EmployeeDTO)session3.load(EmployeeDTO.class, 2);
		System.out.println(empl3.getEid()+" "+empl3.getFirstname()+" "+empl3.getLastname()+" "+empl3.getDesignation());
		session3.close();
		
		Session session4 = sessionFactory.openSession();
		EmployeeDTO empl4 = (EmployeeDTO)session4.load(EmployeeDTO.class, 1);
		System.out.println(empl4.getEid()+" "+empl4.getFirstname()+" "+empl4.getSalary());
		session4.close();*/
	}
}