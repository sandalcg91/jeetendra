package com.orderby.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import com.SessionFactory.SessionFactoryDemo;
import com.products.ProductDTO;

public class OrderByClause {

	public static void main(String[] args)
	{
		Session session = SessionFactoryDemo.getSession();
		
		Criteria crt = session.createCriteria(ProductDTO.class);
	//	crt.addOrder(Order.asc("name"));
		crt.addOrder(Order.desc("type"));
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
			System.out.println(dto.getPid()+"\t\t"+dto.getName()+"\t\t"+dto.getType()+"\t\t"+dto.getPrice()+"\t\t"+dto.getQuantity());
		}
	}
}