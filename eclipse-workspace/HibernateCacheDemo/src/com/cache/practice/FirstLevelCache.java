package com.cache.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache {

	static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		for(int i=0; i<10; i++)
		{
			Session session = sessionFactory.openSession();
			EmployeeDTO empl1 = (EmployeeDTO)session.load(EmployeeDTO.class, 2);
			System.out.println(empl1.getEid()+" "+empl1.getFirstname()+" "+empl1.getLastname()+" "+empl1.getDesignation()+" "+empl1.getSalary()+" "+empl1.getAddress()+" "+empl1.getCity()+" "+empl1.getPincode());
			session.close();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}