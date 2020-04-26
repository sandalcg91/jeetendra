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

public class Limit_Top {

		static EmployeeDTO edto = new EmployeeDTO();
		
		static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		static Session session = sessionFactory.openSession();
		
		public static void sqlLimitByQuery()
		{
			System.out.println("SQL Limit Query executed");
			Query query = session.createSQLQuery("select * from employee limit 3");
			List<Object[]> l = query.list();
			for(Object[] obj : l)
			{
				edto.setEid(Integer.parseInt(obj[0].toString()));
				edto.setFirstname(obj[1].toString());
		    	edto.setLastname(obj[2].toString());
			    edto.setMobile(Long.parseLong(obj[3].toString()));
			    edto.setSalary(Integer.parseInt(obj[4].toString()));
			    edto.setAddress(obj[5].toString());
				edto.setCity(obj[6].toString());
				edto.setPincode(Integer.parseInt(obj[7].toString()));
				System.out.println(edto.getEid()+"\t"+edto.getFirstname()+"\t"+edto.getLastname()+"\t"+edto.getMobile()+"\t"+edto.getSalary()+"\t"+edto.getAddress()+"\t"+edto.getCity()+"\t"+edto.getPincode());
			}
		}
		
		public static void hqlLimitQuery()
		{
			System.out.println("HQL Limit Query executed");
			Query q = session.createQuery("from EmployeeDTO");
			q.setFirstResult(0);
			q.setMaxResults(3);
			List list = q.list();
			Iterator itr = list.iterator();
			EmployeeDTO dto;
			while(itr.hasNext())
			{
				dto = (EmployeeDTO)itr.next();
				System.out.println(dto.getEid()+"\t"+dto.getFirstname()+"\t"+dto.getLastname()+"\t"+dto.getMobile()+"\t"+dto.getSalary()+"\t"+dto.getAddress()+"\t"+dto.getCity()+"\t"+dto.getPincode());
			}
		}
		
		public static void limitByCriteria()
		{
			System.out.println("HQL GroupBy Query by criteria executed");
			Criteria crt = session.createCriteria(EmployeeDTO.class);
		}
}