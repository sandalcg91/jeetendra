package com.HQLprogram;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AggregateFunction {

	static SessionFactory sf = new Configuration().configure().buildSessionFactory();
	static Session session = sf.openSession();
	
	public static void sqlSelectMaxSal() 
	{
		System.out.println("SQL Aggregate Function (MAX) ");
		Query q = session.createSQLQuery("select max(salary) from employee");
		List list = q.list();
		Iterator itr = list.iterator();
		int sal = (Integer)itr.next();
		System.out.println("Max Salary is : "+sal);
	}
	
	public static void hqlSelectMaxSal()
	{
		System.out.println("HQL Aggregate Function (MAX) ");
		Query q = session.createQuery("select max(salary) from EmployeeDTO");
		List list = q.list();
		int sal = (Integer)list.get(0);
		System.out.println("Max Salary is : "+sal);
	}
	
	public static void sqlSelectMinSal() 
	{
		System.out.println("SQL Aggregate Function (MIN) ");
		Query q = session.createSQLQuery("select min(salary) from employee");
		List list = q.list();
		Iterator itr = list.iterator();
		int sal = (Integer)itr.next();
		System.out.println("Minimum Salary is : "+sal);
	}
	
	public static void hqlSelectMinSal()
	{
		System.out.println("HQL Aggregate Function (MIN) ");
		Query q = session.createQuery("select min(salary) from EmployeeDTO");
		List list = q.list();
		int sal = (Integer)list.get(0);
		System.out.println("Minimum Salary is : "+sal);
	}
	
	public static void sqlSelectCount() 
	{
		System.out.println("SQL Aggregate Function (COUNT) ");
		Query q = session.createSQLQuery("select count(*) from employee");
		List list = q.list();
		Iterator itr = list.iterator();
		BigInteger cnt = (BigInteger)itr.next();
		System.out.println("Number of Employees are : "+cnt);
	}
	
	public static void hqlSelectCount()
	{
		System.out.println("HQL Aggregate Function (COUNT) ");
		Query q = session.createQuery("select count(*) from EmployeeDTO");
		List list = q.list();
		long cnt = (Long)list.get(0);
		System.out.println("Number of Employees are : "+cnt);
	}
	
	public static void sqlSelectAvgSal() 
	{
		System.out.println("SQL Aggregate Function (AVG) ");
		Query q = session.createSQLQuery("select avg(salary) from employee");
		List list = q.list();
		Iterator itr = list.iterator();
		BigDecimal sal = (BigDecimal)itr.next();
		System.out.println("Average Salary is : "+sal);
	}
	
	public static void hqlSelectAvgSal()
	{
		System.out.println("HQL Aggregate Function (AVG) ");
		Query q = session.createQuery("select avg(salary) from EmployeeDTO");
		List list = q.list();
		double sal = (Double )list.get(0);
		System.out.println("Average Salary is : "+sal);
	}
	
	public static void sqlSelectSumSal() 
	{
		System.out.println("SQL Aggregate Function (SUM) ");
		Query q = session.createSQLQuery("select sum(salary) from employee");
		List list = q.list();
		Iterator itr = list.iterator();
		BigDecimal sal = (BigDecimal)itr.next();
		System.out.println("Sum of All Employees Salary is : "+sal);
	}
	
	public static void hqlSelectSumSal()
	{
		System.out.println("HQL Aggregate Function (SUM) ");
		Query q = session.createQuery("select sum(salary) from EmployeeDTO");
		List list = q.list();
		long sal = (Long)list.get(0);
		System.out.println("Sum of All Employees Salary is : "+sal);
	}
}