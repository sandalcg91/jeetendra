package com.pass_flight.delete;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Pass_Flt_Delete_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Passenger p = (Passenger)session.get(Passenger.class, 1025);
		session.delete(p);

		tx.commit();
		session.close();
	}
}