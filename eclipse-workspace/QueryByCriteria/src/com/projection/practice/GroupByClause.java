package com.projection.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.SessionFactory.SessionFactoryDemo;
import com.products.ProductDTO;

public class GroupByClause {

	static Session session = SessionFactoryDemo.getSession();
	
	public static void getGroupClause()
	{
			Criteria crt = session.createCriteria(ProductDTO.class);
			ProjectionList plist = Projections.projectionList();
	//		plist.add(Projections.sum("price"));
			
			plist.add(Projections.groupProperty("type"));
			crt.setProjection(plist);
			List list = crt.list();
			Iterator itr = list.iterator();
			Object[] col;
			while(itr.hasNext())
			{
				col = (Object[])itr.next();
				int sum = (Integer)col[0];
				String typ = (String)col[1];
				System.out.println(sum+"   "+typ);
			}
	}
}