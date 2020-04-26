package com.cart_item.practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Cart_Item_SelectAll {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		CartDTO cdto;
		Query q = session.createQuery("from CartDTO");
		List list = q.list();
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			cdto = (CartDTO)itr.next();
			System.out.println(cdto.getCid()+" "+cdto.getName());
			System.out.println("");
			
			Set s = cdto.getSandal();
			Iterator it = s.iterator();
			ItemsDTO idto;
			while(it.hasNext())
			{
				idto = (ItemsDTO)it.next();
				System.out.println(idto.getItem_id()+" "+idto.getName()+" "+idto.getQuantity());
				System.out.println("");
			}			
		}
		session.close();
	}
}