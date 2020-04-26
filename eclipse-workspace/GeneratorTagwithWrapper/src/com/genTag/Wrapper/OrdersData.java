package com.genTag.Wrapper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OrdersData {

	public static void main(String[] args) {
		
		OrdersDTO odto = new OrdersDTO();
		odto.setOid(101);
		odto.setOdate("2018-05-01");
		odto.setStatus("pending");
		odto.setAmount(45000.00);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(odto);
		tx.commit();
		session.close();
		
	}
}