package com.HQLprogram;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DistinctRecords {

		static CustomerDTO cdto = new CustomerDTO();
		
		static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		static Session session = sessionFactory.openSession();
		
		public static void sqlSelectDistinct()
		{
			System.out.println("SQL Distinct record Query executed");
			System.out.println("City");
			Query query = session.createSQLQuery("select distinct c.city from customer c");
			List l = query.list();
			Iterator itr = l.iterator();
			while(itr.hasNext())
			{
				String ct = (String)itr.next();
				System.out.println(ct);
			}
		}
		
		public static void hqlSelectDistinct()
		{
			System.out.println("HQL Distinct record Query executed");
			System.out.println("City");
			Query q = session.createQuery("select Distinct c.pincode from CustomerDTO c");
			List<Object> list = q.list();
			
			for(Object l : list)
			{
				int pin = (Integer)list.get(0);
			}
		}
}