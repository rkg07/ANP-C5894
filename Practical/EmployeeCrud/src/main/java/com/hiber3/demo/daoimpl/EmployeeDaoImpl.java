package com.hiber3.demo.daoimpl;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.hiber3.demo.config.HiberUtil;
import com.hiber3.demo.dao.EmployeeDao;
import com.hiber3.demo.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	Scanner sc=new Scanner(System.in);
	@Override
	
	public void addEmp() 
	{
		Session session=HiberUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		String empName, surname, address, designation;
		int empid;
		long empPhone;
		
		System.out.println("Enter the Id");
		empid=sc.nextInt();
		
		System.out.println("Enter the First Name");
		empName=sc.next();
		
		System.out.println("Enter the Surname");
		surname=sc.next();
		
		System.out.println("Enter the Address");
		address=sc.next();
		
		System.out.println("Enter the Designation");
		designation=sc.next();
		
		System.out.println("Enter the Phone Number");
		empPhone=sc.nextLong();

		Employee emp=new Employee();
		emp.setEmpid(empid);
	    emp.setEmpName(empName);
	    emp.setEmpSurname(surname);
	    emp.setEmpaddr(address);
		emp.setDesignation(designation);
		emp.setEmpPhone(empPhone);
		
		session.save(emp);
		tx.commit();
		session.close();
	
		System.out.println("Employee Data Added Successfully");
		
	}
	
	@Override
	public void deleteEmp() 
	{
		Session session=HiberUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		String empName, surname, address, designation;
		int empid;
		long phone;
		
		System.out.println("Enter the Id");
		empid=sc.nextInt();
		
		Employee emp = session.get(Employee.class, empid);
		emp.setEmpid(empid);
		session.delete(emp);
		tx.commit();
		session.close();
		
		System.out.println("Employee Data Deleted Successfully");
		
	}
	
	@Override
	public void editEmp() 
	{
		Session session=HiberUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		String empName, surname, address, designation;
		int empid;
		long phone;
		
		System.out.println("Enter the Id");
		empid=sc.nextInt();
		
		Employee emp = session.get(Employee.class, empid);
		if (emp != null)
		{
			// Allow the user to modify employee information
			System.out.println("Enter the Name");
			empName=sc.next();
	        emp.setEmpName(empName);
		    
	        System.out.println("Enter the Surname");
	        surname = sc.next();
	        emp.setEmpSurname(surname);
	       
	        System.out.println("Enter the Phone Number");
			phone = sc.nextInt();
			emp.setEmpPhone(phone);
	        
	        System.out.println("Enter the Address");
			address = sc.next();
			emp.setEmpaddr(address);
			
			System.out.println("Enter the Designation");
			designation = sc.next();
			emp.setDesignation(designation);
			
			session.update(emp);
			tx.commit();
			
			System.out.println("Employee data Updated Successfully");
			
		}
		session.close();
		
	}
	
	@Override
	public void displayEmp() 
	{
		Session session = HiberUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		String hql = "FROM Employee";
		Query <Employee> query = session.createQuery(hql,Employee.class);
		List <Employee> resultList = query.getResultList();
		
		for(Employee entity : resultList) {
			System.out.println("Emp ID : " + entity.getEmpid());
			System.out.println("First Name : " + entity.getEmpName());
			System.out.println("Surname : " + entity.getEmpSurname());
			System.out.println("Designation : " + entity.getDesignation());
			System.out.println("Phone Number : " + entity.getEmpPhone());
			System.out.println("Address : " + entity.getEmpaddr());
		}
		
		
	
	}
	
}