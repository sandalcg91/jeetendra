package com.cart_item.practice;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Cart_Item_Get {

public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		CartDTO dto = (CartDTO)session.get(CartDTO.class, 101);
		System.out.println(dto.getCid()+" "+dto.getName());
		
		Set s = dto.getSandal();
		
		Iterator itr = s.iterator();
		ItemsDTO i;
		while(itr.hasNext())
		{
			i = (ItemsDTO)itr.next();
			System.out.println(i.getItem_id()+" "+i.getName()+" "+i.getQuantity());
		}
		session.close();
	}
}
