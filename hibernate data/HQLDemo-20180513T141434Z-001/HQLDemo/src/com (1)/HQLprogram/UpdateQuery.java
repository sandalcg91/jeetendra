package com.HQLprogram;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateQuery {

	static CustomerDTO cdto = new CustomerDTO();
	
	static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	static Session session = sessionFactory.openSession();
	static Transaction tx = session.beginTransaction();
	
	public static void sqlUpdateQuery()
	{
		Query query = session.createSQLQuery("update customer set address = 'sc no 136'  where customer_id = 3 ");
		int res = query.executeUpdate();
		System.out.println(res+" row affected");
	//	tx.commit();
	}
	
	public static void hqlUpdateQuery()
	{
		Query query = session.createQuery("update CustomerDTO set address = :add  where cid = :id ");
		query.setParameter("add", "Annapurna");
		query.setParameter("id", 2);
		int res = query.executeUpdate();
		System.out.println(res+" row affected");
		tx.commit();
	}
}
