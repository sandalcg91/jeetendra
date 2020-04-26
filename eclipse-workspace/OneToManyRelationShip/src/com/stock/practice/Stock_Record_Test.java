package com.stock.practice;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Stock_Record_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session sesson = sessionFactory.openSession();
		
		Stock st = new Stock();
		st.setSid(151);
		st.setSname("laptop");
		
		Stock_Daily_Record r1 = new Stock_Daily_Record();
		r1.setRecid(1421);
		r1.setDate("2018-05-12");
		
		Stock_Daily_Record r2 = new Stock_Daily_Record();
		r2.setRecid(1422);
		r2.setDate("2018-02-22");
		
		Set s = new HashSet();
		s.add(r1);
		s.add(r2);
		
		st.setStock_record(s);
		
		Transaction tx = sesson.beginTransaction();
		sesson.save(st);
		tx.commit();
		sesson.close();
	}
}