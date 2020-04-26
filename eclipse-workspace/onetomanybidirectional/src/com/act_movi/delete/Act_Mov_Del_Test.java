package com.act_movi.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Act_Mov_Del_Test {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	
	public void deleteOneToMany(int aid)
	{
		Actor a = (Actor)session.get(Actor.class, aid);
		session.delete(a);
		tx.commit();
	}
	
	public void deleteManyToOne(int mid)
	{
		Movie c = (Movie)session.get(Movie.class, mid);
		session.delete(c);
		tx.commit();
	}
	
	public static void main(String[] args)
	{
		Act_Mov_Del_Test del = new Act_Mov_Del_Test();
		
		// oneToMany
	//	del.deleteOneToMany(123);
		
		// manyTooOne
		del.deleteManyToOne(123656);
	}
}
