package com.veh_owner.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Vehi_Owner_Update_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Owner o = new Owner();
		o.setOwnid(123452);
		o.setOwnname("Raju lal");
		o.setAddress("NewYork");
		
		Vehicle v1 = new Vehicle();
		v1.setVid(1237894);
		v1.setVname("Brio");
		v1.setType("four Wheeler");
		v1.setOwnerObject(o);
		
		Vehicle v2 = new Vehicle();
		v2.setVid(1237895);
		v2.setVname("Honda shine");
		v2.setType("two Wheeler");
		v2.setOwnerObject(o);
		
		Vehicle v3 = new Vehicle();
		v3.setVid(1237896);
		v3.setVname("Swift vdi");
		v3.setType("Four Wheeler");
		v3.setOwnerObject(o);
		
		Transaction tx = session.beginTransaction();
		session.save(v1);
		session.save(v2);
		session.save(v3);
		tx.commit();
		session.close();
	}
}