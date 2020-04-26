package com.vend_cust.all;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Vendor_Cust_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Vendor v = new Vendor();
		v.setVid(15);
		v.setVname("ankush");		
		
		Customer c1 = new Customer();
		c1.setCid(1013);
		c1.setName("tannu");
		c1.setMobile(7784451234l);
		
		Customer c2 = new Customer();
		c2.setCid(1014);
		c2.setName("mahesh");
		c2.setMobile(6262581112l);
		
		/*Customer c3 = new Customer();
		c3.setCid(1010);
		c3.setName("sandal");
		c3.setMobile(7432587414l);
	*/	
		/*Customer c4 = new Customer();
		c4.setCid(1004);
		c4.setName("taksh");
		c4.setMobile(6123361234l);*/
		
		// oneTomany
		Set s = new HashSet();
		s.add(c1);
		s.add(c2);
//		s.add(c3);
//		s.add(c4);
		
		v.setCustomer(s);
		
		//manyToone
		
		c1.setVendObject(v);
		c2.setVendObject(v);
//		c3.setVendObject(v);
//		c4.setVendObject(v);
		
		// manyToone
		session.save(c1);
		
		// oneTomany
	//	session.save(v);
		
		tx.commit();
		session.close();
	}
}