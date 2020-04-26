package com.Author_book.practice;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Auther_Book_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session sesson = sessionFactory.openSession();
		
		Author a = new Author();
		a.setAid(1111);
		a.setAname("Chetan");
		a.setAward("bharat ratn");
		
		Books b1 = new Books();
		b1.setBid(41);
		b1.setBname("Half Girlfriend");
		b1.setPrice(150.00);
		
		Books b2 = new Books();
		b2.setBid(42);
		b2.setBname("Two State");
		b2.setPrice(160.00);
		
		Set s = new HashSet();
		s.add(b1);
		s.add(b2);
		
		a.setBook(s);
		Transaction tx = sesson.beginTransaction();
		sesson.save(a);
		tx.commit();
		sesson.close();
	}
}
