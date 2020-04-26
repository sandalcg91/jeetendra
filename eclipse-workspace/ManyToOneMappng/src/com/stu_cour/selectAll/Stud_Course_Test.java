package com.stu_cour.selectAll;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Stud_Course_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Course c = new Course();
		c.setCid(103);
		c.setCname("C C++ DS");
		c.setDuration("3 month");
		
		Student s1 = new Student();
		s1.setRollno(1234565);
		s1.setSname("vishal");
		s1.setCourseObject(c);
		
		Student s2 = new Student();
		s2.setRollno(1234566);
		s2.setSname("vishal");
		s2.setCourseObject(c);
		
		Transaction tx = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		tx.commit();
		session.close();
	}
}