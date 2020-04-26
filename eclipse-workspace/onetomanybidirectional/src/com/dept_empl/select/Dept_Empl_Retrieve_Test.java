package com.dept_empl.select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dept_Empl_Retrieve_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee e = (Employee)session.get(Employee.class, 10023);
		System.out.println(e.getEid()+" "+e.getFirstname()+" "+e.getLastname()+" "+e.getSalary());
		
		Department d = e.getDeptObject();
		System.out.println(d.getDeptid()+" "+d.getDeptname()+" "+d.getLocation());
		
		session.close();
	}
}