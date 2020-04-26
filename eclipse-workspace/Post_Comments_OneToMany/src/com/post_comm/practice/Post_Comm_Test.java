package com.post_comm.practice;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Post_Comm_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Post p = new Post();
		p.setPostid(441);
		p.setPtype("political");
		
		Comments c1 = new Comments();
		c1.setCommid(111);
		c1.setComments("Congratulation");
		
		Comments c2 = new Comments();
		c2.setCommid(112);
		c2.setComments("Jai Hind");
		
		Set s = new HashSet();
		s.add(c1);
		s.add(c2);
		
		p.setComments(s);
		Transaction tx = session.beginTransaction();
		
		session.save(p);
		tx.commit();
		session.close();
	}
}
