package com.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import com.SessionFactory.SessionFactoryDemo;
import com.products.ProductDTO;

public class GetFirstNthRecords {

	public static void main(String[] args)
	{
		Session session = SessionFactoryDemo.getSession();
		Criteria crt = session.createCriteria(ProductDTO.class);
		crt.addOrder(Order.desc("price"));
		crt.setFirstResult(1);
		crt.setMaxResults(1);
		List list = crt.list();
		Iterator itr = list.iterator();
		ProductDTO dto;
		while(itr.hasNext())
		{
			dto = (ProductDTO)itr.next();
//			System.out.println(dto.getPid()+"\t"+dto.getName()+"\t"+dto.getType()+"\t"+dto.getPrice()+"\t"+dto.getQuantity());
			System.out.println(dto.getPrice());
		}
	}
}
