package com.projection.practice;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import com.SessionFactory.SessionFactoryDemo;
import com.products.ProductDTO;

public class AggregateFunctions {

	static Session session = SessionFactoryDemo.getSession();
	static Criteria crt = session.createCriteria(ProductDTO.class);
	public static void getMax()
	{
		crt.setProjection(Projections.max("price"));
		List list = crt.list();
		int price = (Integer)list.get(0);
		System.out.println("Maximum price is : "+price);
	}
	
	public static void getMin()
	{
		crt.setProjection(Projections.min("quantity"));
		List list = crt.list();
		int qty = (Integer)list.get(0);
		System.out.println("Minimum quantity is : "+qty);
	}
	
	public static void getAvg()
	{
		crt.setProjection(Projections.avg("price"));
		List list = crt.list();
		double avgp = (Double)list.get(0);
		System.out.println("Average Price of all products is : "+avgp);
	}
	
	public static void getSum()
	{
		crt.setProjection(Projections.sum("price"));
		List list = crt.list();
		int sum = (Integer)list.get(0);
		System.out.println("Addition Price of all products is : "+sum);
	}
	
	public static void getCount()
	{
		crt.setProjection(Projections.count("pid"));
		List list = crt.list();
		int cnt = (Integer)list.get(0);
		System.out.println("Count total products id : "+cnt);
	}
	
	public static void getRowCount()
	{
		crt.setProjection(Projections.rowCount());
		List list = crt.list();
		int cnt = (Integer)list.get(0);
		System.out.println("Count total products : "+cnt);
	}
	
	public static void getCountDistinct()
	{
		crt.setProjection(Projections.countDistinct("type"));
		List list = crt.list();
		int cnt = (Integer)list.get(0);
		System.out.println("Count total Distinct products type : "+cnt);
	}
}