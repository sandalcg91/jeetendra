package com.cache.practice;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cache.sessionFactory.SessionFactoryDemo;

public class UpdateQuery {

	static EmployeeDTO edto = new EmployeeDTO();
	
	static SessionFactory sessionFactory = SessionFactoryDemo.getSessionFactory();
	static Session session1 = sessionFactory.openSession();
	static Transaction tx = session1.beginTransaction();
	
	public static void updateQuery()
	{
		Query query = session1.createQuery("update EmployeeDTO set firstname = :fn  where eid = :id ");
		query.setParameter("fn", "anand");
		query.setParameter("id", 2);
		int res = query.executeUpdate();
		System.out.println(res+" row affected");
		tx.commit();
	}
}