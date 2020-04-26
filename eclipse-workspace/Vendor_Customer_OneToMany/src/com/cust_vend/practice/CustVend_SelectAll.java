package com.cust_vend.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustVend_SelectAll {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query q = session.createQuery("from Customer");
		
		List list = q.list();
		Iterator itr = list.iterator();
		Customer cust;
		while(itr.hasNext())
		{
			cust = (Customer)itr.next();
			System.out.println(cust.getCid()+" "+cust.getName()+" "+cust.getMobile());
		//	Vendor vend = cust.getParentObject();
		//	System.out.println(vend.getVid()+" "+vend.getVname());
		}
		session.close();
	}
}