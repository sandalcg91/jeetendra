package com.patient_doc.practice;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Doc_Patient_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Doctor d = new Doctor();
		d.setDocid(14521);
		d.setDname("atun sende");
		d.setSpecialist("cardiac");
		
		Patient p1 = new Patient();
		p1.setPid(141);
		p1.setPname("BholaRam");
		p1.setDisease("Stomac-Ulcer");
		p1.setDocObject(d);
		
		Patient p2 = new Patient();
		p2.setPid(142);
		p2.setPname("bansiLal");
		p2.setDisease("Stomac-pain");
		p2.setDocObject(d);
		
		Set s = new HashSet();
		s.add(p1);
		s.add(p2);
		
		d.setPatient(s);
		
		p1.setDocObject(d);
		p2.setDocObject(d);
		
	//	session.save(p2);
		
		session.save(d);
		tx.commit();
		session.close();
	}
}