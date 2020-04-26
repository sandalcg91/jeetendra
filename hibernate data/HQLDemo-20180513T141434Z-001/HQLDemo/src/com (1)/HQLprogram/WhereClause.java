package com.HQLprogram;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class WhereClause {

		static CustomerDTO cdto = new CustomerDTO();
		
		static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		static Session session = sessionFactory.openSession();
		
		public static void sqlWhereClause()
		{
			System.out.println("SQL Where clause executed");
			System.out.println("cid"+"  "+"firstname"+"  "+"lastname"+"  "+"Mobile"+"         "+"Address"+"        "+"City"+"  "+"pincode");
			Query query = session.createSQLQuery("select * from customer where first_name='chandan'");
			List<Object[]> l = query.list();
			for(Object[] obj : l)
			{
				cdto.setCid(Integer.parseInt(obj[0].toString()));
				cdto.setFirstname(obj[1].toString());
				cdto.setLastname(obj[2].toString());
				cdto.setMobile(Long.parseLong(obj[3].toString()));
				cdto.setAddress(obj[4].toString());
				cdto.setCity(obj[5].toString());
				cdto.setPincode(Integer.parseInt(obj[6].toString()));
				System.out.println(cdto.getCid()+"\t"+cdto.getFirstname()+"\t"+cdto.getLastname()+"\t"+cdto.getMobile()+"\t"+cdto.getAddress()+"\t"+cdto.getCity()+"\t"+cdto.getPincode());
			}
		}
		
		public static void hqlWhereClause()
		{
			System.out.println("HQL Where Clause executed");
			System.out.println("cid"+"  "+"firstname"+"  "+"lastname"+"  "+"Mobile"+"         "+"Address"+"      "+"City"+"  "+"pincode");
			Query q = session.createQuery("from CustomerDTO where firstname = 'manish'");
			List list = q.list();
			Iterator itr = list.iterator();
			while(itr.hasNext())
			{
				CustomerDTO dto = (CustomerDTO)itr.next();
				System.out.println(dto.getCid()+"\t"+dto.getFirstname()+"\t"+dto.getLastname()+"\t"+dto.getMobile()+"\t"+dto.getAddress()+"\t"+dto.getCity()+"\t"+dto.getPincode());
			}
		}
		
		public static void whereByCriteria()
		{
			System.out.println("HQL Where Clouse by Criteria executed");
			Criteria crt = session.createCriteria(CustomerDTO.class);
			crt.add(Restrictions.eq("lastname", "verma"));
			List list = crt.list();
			Iterator itr = list.iterator();
			while(itr.hasNext())
			{
				CustomerDTO dto = (CustomerDTO)itr.next();
				System.out.println(dto.getCid()+"\t"+dto.getFirstname()+"\t"+dto.getLastname()+"\t"+dto.getMobile()+"\t"+dto.getAddress()+"\t"+dto.getCity()+"\t"+dto.getPincode());
			}
		}
}