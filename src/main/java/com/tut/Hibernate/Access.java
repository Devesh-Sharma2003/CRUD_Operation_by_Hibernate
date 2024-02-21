package com.tut.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
public class Access 
{
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student st = new Student(49,"Devesh Sharma","Noida");
        Student st1 = new Student(50,"Divyank","Faridabad");
        Student st2 = new Student(51,"Somesh Bhajpai","Ghaziabad");
        
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(st);
		session.save(st1);
		session.save(st2);
		Student s = (Student) session.get(Student.class,54);
		System.out.println(s);
		txn.commit();
		session.close();
        
		
	}
	
			

}
