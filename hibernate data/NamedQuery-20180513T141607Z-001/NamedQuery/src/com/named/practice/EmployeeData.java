package com.named.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeData {

	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query q = session.getNamedQuery("AllEmployee");
		List list = q.list();
		Iterator itr = list.iterator();
		EmployeeDTO dto;
		while(itr.hasNext())
		{
			dto = (EmployeeDTO)itr.next();
			System.out.println(dto.getEid()+" "+dto.getFirstname()+" "+dto.getSalary());
		}
		
		System.out.println("---------------------------------------------------------------");
		
		Query q1 = session.getNamedQuery("Employee_Id");
			q1.setParameter("id", 3);
			List list1 = q1.list();
			Iterator itr1 = list1.iterator();
			EmployeeDTO dto1;
			while(itr1.hasNext())
			{
				dto1 = (EmployeeDTO)itr1.next();
				System.out.println(dto1.getEid()+" "+dto1.getFirstname()+" "+dto1.getSalary());
			}
			
		System.out.println("---------------------------------------------------------------");
			
		Query q2 = session.getNamedQuery("Employee_OrderBy");
			
			List list2 = q2.list();
			Iterator itr2 = list2.iterator();
			EmployeeDTO dto2;
			while(itr2.hasNext())
			{
				dto2 = (EmployeeDTO)itr2.next();
				System.out.println(dto2.getEid()+" "+dto2.getFirstname()+" "+dto2.getSalary());
			}
		
		System.out.println("---------------------------------------------------------------");
			
		Query q3 = session.getNamedQuery("Employee_Salary");
				q3.setInteger("salary", 100000);
				List list3 = q3.list();
				Iterator itr3 = list3.iterator();
				EmployeeDTO dto3;
				while(itr3.hasNext())
				{
					dto3 = (EmployeeDTO)itr3.next();
					System.out.println(dto3.getEid()+" "+dto3.getFirstname()+" "+dto3.getSalary());
				}
	
		System.out.println("---------------------------------------------------------------");
				
		Query q4= session.getNamedQuery("Employee_City");
				q4.setString(0, "indore");
				List list4 = q4.list();
				Iterator itr4 = list4.iterator();
				EmployeeDTO dto4;
				while(itr4.hasNext())
				{
					dto4 = (EmployeeDTO)itr4.next();
					System.out.println(dto4.getEid()+" "+dto4.getFirstname()+" "+dto4.getSalary());
				}
	
				System.out.println("---------------------------------------------------------------");
				
		Query q5= session.getNamedQuery("Employee_Id_City");
				q5.setInteger(0, 1);
				q5.setString(1, "indore");
				List list5 = q5.list();
				Iterator itr5 = list5.iterator();
				EmployeeDTO dto5;
				while(itr5.hasNext())
				{
					dto5 = (EmployeeDTO)itr5.next();
					System.out.println(dto5.getEid()+" "+dto5.getFirstname()+" "+dto5.getSalary());
				}
		
		session.close();
	}
}
