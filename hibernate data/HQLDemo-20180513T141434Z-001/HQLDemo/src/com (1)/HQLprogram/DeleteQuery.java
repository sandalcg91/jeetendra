package com.HQLprogram;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteQuery {

	static CustomerDTO cdto = new CustomerDTO();
	
	static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	static Session session = sessionFactory.openSession();
	static Transaction tx = session.beginTransaction();
	
	public static void sqlDeleteQuery()
	{
		Query query = session.createSQLQuery("delete from customer  where customer_id = 5 ");
		int res = query.executeUpdate();
		System.out.println(res+" row deleted");
		tx.commit();
	}
	
	public static void hqlDeleteQuery()
	{
		Query query = session.createQuery("delete from CustomerDTO  where cid = :id ");
		query.setParameter("id", 4);
		int res = query.executeUpdate();
		System.out.println(res+" row deleted");
		tx.commit();
	}
}
