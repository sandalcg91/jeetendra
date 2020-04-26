package com.projection.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.SessionFactory.SessionFactoryDemo;
import com.products.ProductDTO;

public class PerticularColumn {

	public static void getColumn()
	{
		Session session = SessionFactoryDemo.getSession();
		Criteria crt = session.createCriteria(ProductDTO.class);
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("type"));
		plist.add(Projections.property("quantity"));
		crt.setProjection(plist);
		List list = crt.list();
		Iterator itr = list.iterator();
		Object[] col;
		while(itr.hasNext())
		{
			col = (Object[])itr.next();
			String tp = (String)col[0];
			int qty = (Integer)col[1];
			System.out.println("Ptype : "+tp+ "\t\t" + "Quantity : "+qty);
		}
	}
}