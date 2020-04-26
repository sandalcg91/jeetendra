package com.cre_person.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CC_Person_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Person p = new Person();
		p.setPid(4511);
		p.setPname("manish");
		p.setAddress("LIG-COLONY");
		p.setMobile(7894561230l);
		
		CreditCard cc1 = new CreditCard();
		cc1.setCcno(78945612312l);
		cc1.setBankname("SBI");
		cc1.setCclimit(1000000);
		cc1.setPerObject(p);
		
		CreditCard cc2 = new CreditCard();
		cc2.setCcno(78451236952l);
		cc2.setBankname("HDFC");
		cc2.setCclimit(1500000);
		cc2.setPerObject(p);
		
		session.save(cc1);
		session.save(cc2);
		tx.commit();
		session.close();
	}
}