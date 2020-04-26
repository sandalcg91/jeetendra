package com.products;
import com.SessionFactory.SessionFactoryDemo;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductData {

	public static void main(String[] args)
	{
		ProductDTO pdto = new ProductDTO();
		pdto.setName("Mi");
		pdto.setType("mobile");
		pdto.setPrice(20000);
		pdto.setQuantity(5);
		
		Session session = SessionFactoryDemo.getSession();
		Transaction tx = SessionFactoryDemo.getTransaction();
		
		session.save(pdto);
		tx.commit();
		session.close();
		System.out.println("successfully done");
	}
}