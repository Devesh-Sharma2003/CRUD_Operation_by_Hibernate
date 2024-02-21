package com.tut.Hibernate;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args ) throws Exception
//    {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory factory = cfg.buildSessionFactory();
//        
//        Student st = new Student(49,"Devesh Sharma","Noida");
//        Student st1 = new Student(50,"Divyank","Faridabad");
//        Student st2 = new Student(51,"Somesh Bhajpai","Ghaziabad");
//        System.out.println(st);
//        
//        Address ad = new Address();
//        ad.setCity("Noida");
//        ad.setIsopen(true);
//        ad.setDouble(3456.4567);
//        
//        
//        
//        
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//        session.save(st);
//        session.save(ad);
//        tx.commit();
//        session.close();
//        
//    }
}
