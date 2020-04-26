package com.HQLprogram;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class AggregateFunctionCriteria {

	static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	static Session session = sessionFactory.openSession();
	static Criteria crt = session.createCriteria(EmployeeDTO.class);
	
	public static void maxByCriteria()
	{
		System.out.println("SQL Aggregate Function (MAX) By Criteria ");
		crt.setProjection(Projections.max("salary"));
		List list = crt.list();
		int maxSal = (Integer)list.get(0);
		System.out.println("Max Salary of Employees : "+maxSal);
	}
	
	public static void minByCriteria()
	{
		System.out.println("SQL Aggregate Function (MIN) By Criteria ");
		crt.setProjection(Projections.min("salary"));
		List list = crt.list();
		int  minSal = (Integer)list.get(0);
		System.out.println("Minimum Salary of Employees : "+minSal);
	}
	
	public static void avgByCriteria()
	{
		System.out.println("SQL Aggregate Function (AVG) By Criteria ");
		crt.setProjection(Projections.avg("salary"));
		List list = crt.list();
		Double avgSal = (Double)list.get(0);
		System.out.println("Average Salary of all Employees : "+avgSal);
	}
	
	public static void sumByCriteria()
	{
		System.out.println("SQL Aggregate Function (SUM) By Criteria ");
		crt.setProjection(Projections.sum("salary"));
		List list = crt.list();
		int sumSal = (Integer)list.get(0);
		System.out.println("Sum of Salary of all Employees : "+sumSal);
	}
	
	public static void countRowByCriteria()
	{
		System.out.println("SQL Aggregate Function (COUNT ROW) By Criteria ");
		crt.setProjection(Projections.rowCount());
		List list = crt.list();
		int cnt = (Integer)list.get(0);
		System.out.println("Count number of Employees : "+cnt);
	}
	
	public static void countByCriteria()
	{
		System.out.println("SQL Aggregate Function (COUNT) By Criteria ");
		crt.setProjection(Projections.count("eid"));
		List list = crt.list();
		int cnt = (Integer)list.get(0);
		System.out.println("Count number of Employees : "+cnt);
	}
	
	public static void countDistinctByCriteria()
	{
		System.out.println("SQL Aggregate Function (COUNT DISTINCT) By Criteria ");
		crt.setProjection(Projections.countDistinct("city"));
		List list = crt.list();
		int cnt = (Integer)list.get(0);
		System.out.println("Count Distinct number of Employees : "+cnt);
	}
}