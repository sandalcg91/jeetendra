package com.pass_flight.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Flight_Pass_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Flight f = new Flight();
		f.setFno(455);
		f.setFname("Air-India");
		f.setDeptime("8:30 AM");
		
		Passenger p1 = new Passenger();
		p1.setPid(1025);
		p1.setPname("chandani");
		p1.setMobile(7894512635l);
/*		p1.setFrom("Mumbai");
		p1.setTo("Delhi");
*/		p1.setFltObject(f);
		
		/*Passenger p2 = new Passenger();
		p2.setPid(1024);
		p2.setPname("anish");
		p2.setMobile(6252589635l);
		p2.setFrom("Mumbai");
		p2.setTo("pune");
		p2.setFltObject(f);
		*/
		session.save(p1);
//		session.save(p2);
		tx.commit();
		session.close();
	}
}