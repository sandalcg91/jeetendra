package com.state_dist.selectall;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class State_Dist_selectall_Test {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	
	public void selectAllOneToMany()
	{
		Criteria crt = session.createCriteria("from State");
		List list = crt.list();
		Iterator itr = list.iterator();
		State st;
		while(itr.hasNext())
		{
			st = (State)itr.next();
			System.out.println("State ID : "+st.getStid());
			System.out.println("State Name : "+st.getStname());
			System.out.println("State Population : "+st.getPopulation());
			
			District d = (District)st.getDistrict();
			System.out.println("District Id : "+d.getDistid());
			System.out.println("District NAme : "+d.getDistname());
		}
	}
	
	public void selectAllManyToOne()
	{
		Query q = session.createQuery("from District");
		List list = q.list();
		Iterator itr = list.iterator();
		District dist;
		while(itr.hasNext())
		{
			dist = (District)itr.next();
			System.out.println("District Id : "+dist.getDistid());
			System.out.println("District NAme : "+dist.getDistname());
			
			State st = dist.getStObject();
			System.out.println("State ID : "+st.getStid());
			System.out.println("State Name : "+st.getStname());
			System.out.println("State Population : "+st.getPopulation());
		}
	}

	public static void main(String[] args) {
	
		State_Dist_selectall_Test sdt = new State_Dist_selectall_Test();
		
		// OneToMany
		sdt.selectAllOneToMany();
		
		// ManyToOne
	//	sdt.selectAllManyToOne();
	}
}