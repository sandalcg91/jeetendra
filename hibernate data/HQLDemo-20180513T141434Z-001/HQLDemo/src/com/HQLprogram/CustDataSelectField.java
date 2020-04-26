package com.HQLprogram;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustDataSelectField {

		static CustomerDTO cdto = new CustomerDTO();
		
		static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		static Session session = sessionFactory.openSession();
		
		public static void sqlFieldSelect()
		{
			System.out.println("cid"+"\t"+"Mobile");
			Query q = session.createSQLQuery("select c.customer_id, c.mobile_no from customer c");
			List<Object[]> l = q.list();
			for(Object[] obj : l)
			{
				cdto.setCid(Integer.parseInt(obj[0].toString()));
				cdto.setMobile(Long.parseLong(obj[1].toString()));
				System.out.println(cdto.getCid()+"\t"+cdto.getMobile());
			}
		}
		
		public static void hqlFieldSelect()
		{
			System.out.println("FirstName"+"\t"+"Pincode");
			Query q = session.createQuery("select c.firstname, c.pincode from CustomerDTO c");
			List l = q.list();
			Iterator it = l.iterator();
			Object[] col;
			while(it.hasNext())
			{
				col = (Object[])it.next();
				String fn = (String)col[0];
				int pin = (Integer)col[1];
				System.out.println(fn+"\t"+pin);
			}
		}		
}