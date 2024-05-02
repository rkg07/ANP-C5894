package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Students;
import com.example.demo.exception.StudentsIdNotFoundException;
import com.example.demo.respository.StudentsRespository;
import com.example.demo.service.StudentsService;

//business logic(CRUD Implementation) of entity teacher
@Service
public class StudentsServiceImpl implements StudentsService{
	
	@Autowired
	StudentsRespository  trepo;

	@Override
	public Students addStudent(Students students) {
		// TODO Auto-generated method stub
		return trepo.save(students);
		
	}

	@Override
	public Students getStudentDetail(int sid) {
		// TODO Auto-generated method stub
		return trepo.findById(sid).
		         orElseThrow(()-> new StudentsIdNotFoundException("Student Id is not correct"));
		
	}

	@Override
	public Students updateStudentDetail(Students students, int sid) {
		// TODO Auto-generated method stub
		Students updatedStudents = trepo.findById(sid).
		         orElseThrow(()-> new StudentsIdNotFoundException("Student Id is not correct"));
	
		//set new values
		updatedStudents.setSeduc(students.getSeduc());
		updatedStudents.setSaddr(students.getSaddr());
		trepo.save(updatedStudents); //saving updated details 
			return updatedStudents; 
	}

	@Override
	public void deleteStudentDetail(int sid) {
		// TODO Auto-generated method stub
		trepo.findById(sid).
		orElseThrow(()-> new StudentsIdNotFoundException("Student Id is not correct"));
	    trepo.deleteById(sid);
		
	}

	

}