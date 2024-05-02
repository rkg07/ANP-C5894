package com.example.demo.service;

import com.example.demo.entity.Department;


//abstract method for performing CRUD on teacher entity
public interface DepartmentService {
	
	//method for saving teacher details in db table
	Department addDepartment(Department department);
	
	//method to fetch teacher detail based on tid from db table
	Department getDepartmentDetail(int did);
	
	//method to modify teacher detail based on tid from db table
	Department updateDepartmentDetail(Department department, int did);
	
	//method to remove teacher detail based on tid from db table
	void deleteDepartmentDetail(int did);

	
	
	
	
}
