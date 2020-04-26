package com.cust_vend.practice;

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
		
		Vendor v = new Vendor();
		v.setVid(11);
		v.setVname("chandan");		
		
		Customer c1 = new Customer();
		c1.setCid(1001);
		c1.setName("payal");
		c1.setMobile(7894561234l);
		
		Customer c2 = new Customer();
		c2.setCid(1002);
		c2.setName("manish");
		c2.setMobile(7774441112l);
		
		Customer c3 = new Customer();
		c3.setCid(1003);
		c3.setName("sandal");
		c3.setMobile(9632587414l);
		
		Customer c4 = new Customer();
		c4.setCid(1004);
		c4.setName("taksh");
		c4.setMobile(6123361234l);
		
		Set s = new HashSet();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		s.add(c4);
		
		v.setCustomer(s);
		
		Transaction tx = session.beginTransaction();
		
		session.save(v);
		tx.commit();
		session.close();
	}
}