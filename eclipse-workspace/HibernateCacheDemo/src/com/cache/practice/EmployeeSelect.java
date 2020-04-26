package com.cache.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeSelect {

	public static void main(String[] args)
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		EmployeeDTO dto = (EmployeeDTO)session.get(EmployeeDTO.class, 2);
		
		System.out.println(dto.getEid()+" "+dto.getFirstname()+" "+dto.getLastname()+" "+dto.getDesignation()+" "+dto.getSalary()+" "+dto.getAddress()+" "+dto.getCity()+" "+dto.getPincode());
	}
}