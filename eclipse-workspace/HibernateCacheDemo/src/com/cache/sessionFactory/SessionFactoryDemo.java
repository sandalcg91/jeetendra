package com.cache.sessionFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionFactoryDemo {

	private static SessionFactory sessionFactory = null;
	private static Session session = null;
	private static Transaction tx=null;
	
	public static SessionFactory getSessionFactory()
	{
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		return sessionFactory;
	}
	
	public static Session getSession()
	{
		getSessionFactory();
		session = sessionFactory.openSession();
		return session;
	}
	
	public static Transaction getTransaction()
	{
		getSession();
		tx = session.beginTransaction();
		return tx;
	}
}