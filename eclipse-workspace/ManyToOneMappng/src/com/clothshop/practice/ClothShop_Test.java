package com.clothshop.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClothShop_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Shop s = new Shop();
		s.setShopid(1231);
		s.setSname("Fashion-fever");
		s.setAddress("Palasiya");
		
		Cloths c1 = new Cloths();
		c1.setCid(451);
		c1.setCname("Jeans");
		c1.setTypes("Mens");
		c1.setPrice(1500.00);
		c1.setShopObject(s);
		
		session.save(c1);
		tx.commit();
		session.close();
	}
}