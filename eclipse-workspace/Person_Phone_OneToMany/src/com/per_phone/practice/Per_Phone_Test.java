package com.per_phone.practice;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Per_Phone_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Person p = new Person();
		p.setPid(111);
		p.setPname("chandan");
		
		Phone pn1 = new Phone();
		pn1.setPhoneid(1111);
		pn1.setMobile(7894561235l);
		
		Phone pn2 = new Phone();
		pn2.setPhoneid(1112);
		pn2.setMobile(7894521362l);
		
		Set s = new HashSet();
		
		s.add(pn1);
		s.add(pn2);
		
		p.setPhone(s);
		
		Transaction tx = session.beginTransaction();
		
		session.save(p);
		
		tx.commit();
		
		session.close();
	}
}
