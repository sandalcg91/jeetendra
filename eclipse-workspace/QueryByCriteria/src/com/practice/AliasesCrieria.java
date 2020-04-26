package com.practice;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.SessionFactory.SessionFactoryDemo;
import com.products.ProductDTO;

public class AliasesCrieria {

	public static void main(String[] args)
	{
		Session session = SessionFactoryDemo.getSession();
		Criteria crt = session.createCriteria(ProductDTO.class);
	//	crt.createAlias(arg0, arg1)
	}
}