package com.act_movi.delete;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Actor_Movie_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Actor act = new Actor();
		act.setActid(123);
		act.setActname("aamir");
		
		Movie m1 = new Movie();
		m1.setMveid(123655);
		m1.setMvename("PK");
		m1.setDuration("3:34");
		
		Movie m2 = new Movie();
		m2.setMveid(123656);
		m2.setMvename("3-idiot");
		m2.setDuration("3:12");
		
		// oneTomany
		Set s = new HashSet();
		s.add(m1);
		s.add(m2);
		
		act.setMovie(s);
		
		// manyToone
		m1.setActObject(act);
		m2.setActObject(act);
		
		// manyToone
	//	session.save(m1);
		
		// oneTomany
		session.save(act);
		tx.commit();
		session.close();
	}
}