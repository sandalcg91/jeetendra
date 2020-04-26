package com.HQLprogram;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class GreaterThan {

		static EmployeeDTO edto = new EmployeeDTO();
		
		static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		static Session session = sessionFactory.openSession();
		
		public static void sqlGreaterThan()
		{
			System.out.println("SQL Query executed (>)");
			System.out.println("cid"+"  "+"firstname"+"  "+"lastname"+"  "+"Mobile"+"         "+"Salary"+"   "+"Address"+"        "+"City"+"  "+"pincode");
			Query query = session.createSQLQuery("select * from employee where salary > 50000");
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
		
		public static void hqlGreaterThan()
		{
			System.out.println("HQL Query executed (>)");
			System.out.println("cid"+"  "+"firstname"+"  "+"lastname"+"  "+"Mobile"+"         "+"Salary"+"   "+"Address"+"        "+"City"+"  "+"pincode");
			Query q = session.createQuery("from EmployeeDTO e where e.salary > 80000");
			List list = q.list();
			Iterator itr = list.iterator();
			while(itr.hasNext())
			{
				EmployeeDTO dto = (EmployeeDTO)itr.next();
				System.out.println(dto.getEid()+"\t"+dto.getFirstname()+"\t"+dto.getLastname()+"\t"+dto.getMobile()+"\t"+dto.getSalary()+"\t"+dto.getAddress()+"\t"+dto.getCity()+"\t"+dto.getPincode());
			}
		}
		
		public static void greaterThanByCriteria()
		{
			System.out.println("HQL Query executed (<) By criteria");
			Criteria crt = session.createCriteria(EmployeeDTO.class);
			crt.add(Restrictions.gt("salary", 60000));
			List list = crt.list();
			Iterator itr = list.iterator();
			while(itr.hasNext())
			{
				EmployeeDTO dto = (EmployeeDTO)itr.next();
				System.out.println(dto.getEid()+"\t"+dto.getFirstname()+"\t"+dto.getLastname()+"\t"+dto.getMobile()+"\t"+dto.getSalary()+"\t"+dto.getAddress()+"\t"+dto.getCity()+"\t"+dto.getPincode());
			}
		}
}