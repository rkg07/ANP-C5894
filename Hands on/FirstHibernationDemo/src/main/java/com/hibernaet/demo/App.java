package com.hibernaet.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args)
	{
		System.out.println("Connection Started..");
        
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction ts = session.beginTransaction();
        
        Student p=new Student();
        p.setStdId(1);
        p.setStdName("Rutik");
        p.setStdDegree("B.E.");
        p.setStdGender("M");
        p.setStdPhoneNumber(949448579);
        
    	
    	session.save(p);
        ts.commit();
        session.close();
        System.out.println("Student data Saved Successfully");

    }
	
}

