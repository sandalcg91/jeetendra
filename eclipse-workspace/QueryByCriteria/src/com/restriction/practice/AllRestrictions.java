package com.restriction.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.SessionFactory.SessionFactoryDemo;
import com.products.ProductDTO;

public class AllRestrictions {

	static Session session = SessionFactoryDemo.getSession();
	
	public static void getAllRecord()
	{
		Criteria crt = session.createCriteria(ProductDTO.class);
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
	}
	
	public static void getLessThan()
	{
		Criteria crt = session.createCriteria(ProductDTO.class);
		crt.add(Restrictions.lt("price", 30000));
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
	}
	
	public static void getGreaterThan()
	{
		Criteria crt = session.createCriteria(ProductDTO.class);
		crt.add(Restrictions.gt("quantity", 10));
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
	}
	
	public static void getBetween()
	{
		Criteria crt = session.createCriteria(ProductDTO.class);
		crt.add(Restrictions.between("price", 15000, 45000));
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
	}
	
	public static void getIn()
	{
		Criteria crt = session.createCriteria(ProductDTO.class);
		crt.add(Restrictions.in("type", new String[] {"mobile", "laptop", "monitor"} ));
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
	}
	
	public static void getLike()
	{
		Criteria crt = session.createCriteria(ProductDTO.class);
		crt.add(Restrictions.like("type", "%e"));
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
	}
	
	public static void getILike()
	{
		Criteria crt = session.createCriteria(ProductDTO.class);
		crt.add(Restrictions.ilike("type", "M%"));
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
	}
	
   public static void getIsNull()
   {
	   Criteria crt = session.createCriteria(ProductDTO.class);
		crt.add(Restrictions.isNull("name"));
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
   }
   
   public static void getIsNotNull()
   {
	   Criteria crt = session.createCriteria(ProductDTO.class);
		crt.add(Restrictions.isNotNull("name"));
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
   }
   
   public static void getIsEmpty()
   {
	    Criteria crt = session.createCriteria(ProductDTO.class);
		crt.add(Restrictions.isEmpty("name"));
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
   }
   
   public static void getAndCondition()
   {
	   Criteria crt = session.createCriteria(ProductDTO.class);
	   crt.add(Restrictions.eq("type", "mobile"));
	   crt.add(Restrictions.between("price", 10000, 30000));
	   List list = crt.list();
	   Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
   }
   
   public static void getORCondition()
   {
	   Criteria crt = session.createCriteria(ProductDTO.class);
	   crt.add(Restrictions.or(Restrictions.like("type", "mob%"), Restrictions.eq("quantity", 20)));
	   List list = crt.list();
	   Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
		}
   }
}
