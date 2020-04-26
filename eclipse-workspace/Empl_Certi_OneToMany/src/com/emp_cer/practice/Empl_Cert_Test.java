package com.emp_cer.practice;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Empl_Cert_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee e = new Employee();
		e.setEid(1);
		e.setEname("Manish");
		e.setSalary(45000.00);
		
		Certificate c1 = new Certificate();
		c1.setCerid(11);
		c1.setCname("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setCerid(12);
		c2.setCname("SCJP");
		
		Set s = new HashSet();
		
		s.add(c1);
		s.add(c2);
		
		e.setCertificate(s);
		
		Transaction tx = session.beginTransaction();
		
		session.save(e);
		
		tx.commit();
		
		session.close();
	}
}
