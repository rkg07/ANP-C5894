package com.example.demo.service;

import com.example.demo.entity.Students;


//abstract method for performing CRUD on teacher entity
public interface StudentsService {
	
	//method for saving teacher details in db table
	Students addStudent(Students students);
	
	//method to fetch teacher detail based on tid from db table
	Students getStudentDetail(int sid);
	
	//method to modify teacher detail based on tid from db table
	Students updateStudentDetail(Students students, int sid);
	
	//method to remove teacher detail based on tid from db table
	void deleteStudentDetail(int sid);

	
	
	
	
}