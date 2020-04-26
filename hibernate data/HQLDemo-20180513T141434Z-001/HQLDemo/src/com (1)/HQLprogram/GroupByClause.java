package com.HQLprogram;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class GroupByClause {

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
			System.out.println("HQL GroupBy Query executed");
			System.out.println("Salary"+"      "+"City");
			Query q = session.createQuery("select sum(e.salary), e.city from EmployeeDTO e group by e.city");
			List list = q.list();
			Iterator itr = list.iterator();
			Object[] col;
			
			
			while(itr.hasNext())
			{
				col = (Object[])itr.next();
				long sumSal = (Long)col[0];
				String city = (String)col[1];
				System.out.println(sumSal+"\t"+city);
			}
		}
		
		public static void groupByCriteria()
		{
			System.out.println("HQL GroupBy Query by criteria executed");
			Criteria crt = session.createCriteria(EmployeeDTO.class);
			ProjectionList plist = Projections.projectionList();
			plist.add(Projections.groupProperty("city"));
			crt.setProjection(plist);
			List list = crt.list();
			Iterator itr = list.iterator();
			while(itr.hasNext())
			{
				CustomerDTO dto = (CustomerDTO)itr.next();
				System.out.println(dto.getCid()+"\t"+dto.getFirstname()+"\t"+dto.getLastname()+"\t"+dto.getMobile()+"\t"+dto.getAddress()+"\t"+dto.getCity()+"\t"+dto.getPincode());
			}
		}
}