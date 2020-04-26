package com.team_player.practice;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Team_Players_Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session sesson = sessionFactory.openSession();
		
		Team t = new Team();
		t.setTid(121);
		t.setTname("India");
		t.setBoardname("BCCI");
		
		Players p1 = new Players();
		p1.setPid(301);
		p1.setPname("Virat kohli");
		p1.setRanking(1);
		
		Players p2 = new Players();
		p2.setPid(302);
		p2.setPname("M S Dhoni");
		p2.setRanking(6);
		
		Set s = new HashSet();
		s.add(p1);
		s.add(p2);
		
		t.setPlayer(s);
		Transaction tx = sesson.beginTransaction();
		sesson.save(t);
		tx.commit();
		sesson.close();
	}
}
