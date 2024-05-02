package com.hibernaet.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 
{
	public static void main( String[] args )
    {
		System.out.println("Connection Started..");
       
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction ts = session.beginTransaction();
        
        Employee1 a=new Employee1();
    	a.setEmpId(1);
    	a.setEmpName("Rutik");
    	a.setEmpDept("SAP");
    	a.setEmpDesig("Developer");
    	a.setSalary(50000);
    	
    	session.save(a);
        ts.commit();
        
        session.close();
        
        System.out.println("Employee data Saved Successfully");
    }
	
}



