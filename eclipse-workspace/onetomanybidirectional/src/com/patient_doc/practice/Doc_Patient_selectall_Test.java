package com.patient_doc.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Doc_Patient_selectall_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Criteria crt = session.createCriteria(Patient.class);
		List list = crt.list();
		Iterator itr = list.iterator();
		Patient p;
		while(itr.hasNext())
		{
			p = (Patient)itr.next();
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getDisease());
			
			Doctor d  = p.getDocObject();
			System.out.println(d.getDocid()+" "+d.getDname()+" "+d.getSpecialist());
		}		
		session.close();
	}
}