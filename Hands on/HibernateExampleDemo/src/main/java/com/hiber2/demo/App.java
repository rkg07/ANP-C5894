package com.hiber2.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hiber2.demo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args)
    {
		Session session = HiberUtil.getSessionFactory().openSession();
		//transaction object to start transaction
		Transaction t = session.beginTransaction();
		
		Employee emp = new Employee();
		
		emp.setEmpName("Padmaja"); //set values with object
		emp.setEmpSurname("Patil");
		emp.setEmpPhone(24524);
		emp.setEmpaddr("IT");
		emp.setDesignation("Trainer");
		
		session.save(emp); //employee details get save in db table
		t.commit(); //permanently saved 
		
		System.out.println("Inserted successfully");
		
		session.close();
		
    }

}