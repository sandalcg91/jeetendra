package com.book_lib.get;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Book_Lib_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Book b = new Book();
		b.setBookid(125681);
		b.setTitle("The Monk who sold his ferrary");
		b.setPrice(250);
		
		Library l1 = new Library();
		l1.setLibid(1331);
		l1.setLibname("central Library");
		l1.setLocation("London");
		
		Library l2 = new Library();
		l2.setLibid(1332);
		l2.setLibname("Vit Library");
		l2.setLocation("Vellore");
		
		Set s = new HashSet();
		s.add(l1);
		s.add(l2);
		
		b.setLibrary(s);
		
		l1.setBookObject(b);
		l2.setBookObject(b);
		
		session.save(b);
		tx.commit();
		session.close();
	}
}
