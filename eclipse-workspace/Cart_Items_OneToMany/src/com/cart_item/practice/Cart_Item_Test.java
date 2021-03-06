package com.cart_item.practice;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Cart_Item_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		CartDTO cdto = new CartDTO();
		cdto.setCid(102);
		cdto.setName("stationary");

		ItemsDTO i1 = new ItemsDTO();
		i1.setItem_id(301);
		i1.setName("Pencil");
		i1.setQuantity(4);
		
		ItemsDTO i2 = new ItemsDTO();
		i2.setItem_id(302);
		i2.setName("Notebook");
		i2.setQuantity(2);
		
		ItemsDTO i3 = new ItemsDTO();
		i3.setItem_id(303);
		i3.setName("Pen");
		i3.setQuantity(10);
		
		Set s = new HashSet();
		
		s.add(i1);
		s.add(i2);
		s.add(i3);
		
		cdto.setSandal(s);
		
		Transaction tx = session.beginTransaction();
		
		session.save(cdto);
		
		tx.commit();
		session.close();
	}
}