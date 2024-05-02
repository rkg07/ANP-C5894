package com.example.demo.service;

import com.example.demo.entity.Employee;

public interface EmployeeService 
{
	
	//method for saving teacher details in db table
	Employee addEmployee(Employee employee);
		
	//method to fetch teacher detail based on tid from db table
	Employee getEmployeeDetail(int eid);
		
	//method to modify teacher detail based on tid from db table
	Employee updateEmployeeDetail(Employee employee, int eid);
		
	//method to remove teacher detail based on tid from db table
	void deleteEmployeeDetail(int eid);
		
			
	
}
