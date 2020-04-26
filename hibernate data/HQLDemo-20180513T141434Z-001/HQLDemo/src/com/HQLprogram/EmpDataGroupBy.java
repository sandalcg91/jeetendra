package com.HQLprogram;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpDataGroupBy {

		static EmployeeDTO edto = new EmployeeDTO();
		
		static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		static Session session = sessionFactory.openSession();
		
		public static void sqlGroupByQuery()
		{
			System.out.println("SQL GroupBy Query executed");
			System.out.println("Salary"+"\t"+"City");
			Query query = session.createSQLQuery("select sum(e.salary), e.city from employee e group by e.city");
			List<Object[]> l = query.list();
			for(Object[] obj : l)
			{
				edto.setSalary(Integer.parseInt(obj[0].toString()));
				edto.setCity(obj[1].toString());
				System.out.println(edto.getSalary()+"\t"+edto.getCity());
			}
		}
		
		public static void hqlGroupByQuery()
		{
			System.out.println("HQL OrderBy Query executed");
			System.out.println("Salary"+"      "+"City");
			Query q = session.createQuery("select sum(e.salary), e.city from EmployeeDTO e group by e.city");
			List list = q.list();
			Object[] col;
			Iterator itr = list.iterator();
			while(itr.hasNext())
			{
				col = (Object[])itr.next();
				long sumSal = (Long)col[0];
				String city = (String)col[1];
				System.out.println(sumSal+"\t"+city);
			}
		}
}