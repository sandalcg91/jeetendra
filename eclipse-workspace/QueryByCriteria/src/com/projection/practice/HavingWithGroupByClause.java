package com.projection.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.SessionFactory.SessionFactoryDemo;
import com.products.ProductDTO;

public class HavingWithGroupByClause {

		static Session session = SessionFactoryDemo.getSession();
		
		public static void havingGroupQuery()
		{
			Criteria crt = session.createCriteria(ProductDTO.class);
			ProjectionList plist = Projections.projectionList();
			plist.add(Projections.count("type"));
			plist.add(Projections.groupProperty("type"));
			crt.add(Restrictions.eq("type", "mobile"));
			crt.setProjection(plist);
			
			List list = crt.list();
			Iterator itr = list.iterator();
			Object[] col;
			while(itr.hasNext())
			{
				col = (Object[])itr.next();
				Integer cnt = (Integer)col[0];
				System.out.println(cnt);
			}
		}
}