package com.book_publisher.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Book_Publisher_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Publisher p = new Publisher();
		p.setPubid(10201);
		p.setPubname("McGraw-Hill");
		
		Book b1 = new Book();
		b1.setBookid(1231);
		b1.setTitle("The Complete reference- java");
		b1.setEdition(7);
		b1.setPrice(550.00);
		b1.setPubObject(p);
		
		Book b2 = new Book();
		b2.setBookid(1232);
		b2.setTitle("The Complete Reference - C++");
		b2.setEdition(2);
		b2.setPrice(390.00);
		b2.setPubObject(p);
		
		Transaction tx = session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		
		tx.commit();
		session.close();
	}
}