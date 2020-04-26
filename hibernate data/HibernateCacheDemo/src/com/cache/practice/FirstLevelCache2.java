package com.cache.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cache.sessionFactory.SessionFactoryDemo;

public class FirstLevelCache2 {

	static SessionFactory sessionFactory = SessionFactoryDemo.getSessionFactory();
	static Session session = sessionFactory.openSession();
	public static void main(String[] args) throws InterruptedException
	{
		Transaction tx1;
		Transaction tx2;
		for(int i=0; i<10; i++)
		{
			tx1 = session.beginTransaction();
			EmployeeDTO empl1 = (EmployeeDTO)session.load(EmployeeDTO.class, 2);
			System.out.println(empl1.getEid()+" "+empl1.getFirstname()+" "+empl1.getLastname()+" "+empl1.getDesignation()+" "+empl1.getSalary()+" "+empl1.getAddress()+" "+empl1.getCity()+" "+empl1.getPincode());
			Thread.sleep(3000);
			empl1.setFirstname("anand");
			session.update(empl1);
			tx1.commit();
	//		Thread.sleep(1000);
			tx2 = session.beginTransaction();
			empl1.setAddress("indranagar");
			session.update(empl1);
			tx2.commit();
		}
		session.close();
	}
}