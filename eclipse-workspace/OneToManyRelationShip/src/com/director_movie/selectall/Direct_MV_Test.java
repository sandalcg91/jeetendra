package com.director_movie.selectall;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Direct_MV_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Director d = new Director();
		d.setDirid(1021);
		d.setDirname("R Hirani");
		
		Movies m1 = new Movies();
		m1.setMid(1234561);
		m1.setMname("3 Idiot");
		m1.setDuration("3:05 hour");
		m1.setActor("Amir");
		m1.setActress("kareena");

		Movies m2 = new Movies();
		m1.setMid(1234522);
		m1.setMname("PK");
		m1.setDuration("3:25 hour");
		m1.setActor("Amir");
		m1.setActress("Anushka");
		
		Set s = new HashSet();
		s.add(m1);
		s.add(m2);
		
		d.setMovie(s);
		
		session.save(d);
		tx.commit();
		session.close();
	}
}
