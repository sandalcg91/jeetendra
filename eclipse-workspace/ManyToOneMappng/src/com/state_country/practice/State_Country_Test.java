package com.state_country.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class State_Country_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Country c = new Country();
		c.setCid(12321);
		c.setCname("India");
		c.setPresident("RamNath-Kvind");
		
		State s1 = new State();
		s1.setSid(5);
		s1.setSname("Hariyana");
		s1.setCm("M.L.Khattar");
		s1.setCntryObject(c);
		
		State s2 = new State();
		s2.setSid(3);
		s2.setSname("Gujrat");
		s2.setCm("Parrikar");
		s2.setCntryObject(c);
		
		Transaction tx = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		tx.commit();
		session.close();
	}
}