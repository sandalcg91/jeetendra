package com.stu_cour.selectAll;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Stud_Course_selectall_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query q = session.createQuery("from Student");
		List list = q.list();
		Iterator itr = list.iterator();
		
		Student s;
		while(itr.hasNext())
		{
			s = (Student)itr.next();
			System.out.println(s.getRollno()+" "+s.getSname());
			
			Course c = s.getCourseObject();
			System.out.println(c.getCid()+" "+c.getCname()+" "+c.getDuration());
		}
		session.close();
	}
}