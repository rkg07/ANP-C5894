package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Students;
import com.example.demo.service.StudentsService;
import jakarta.validation.Valid;

//handle all incoming request of Teacher Entity
@RestController
public class StudentsController {
	
	@Autowired
	StudentsService ts;
	
	//use postmapping to insert data 
	@PostMapping("/Students/addStudents")
	public ResponseEntity<Students> saveStudents(@Valid @RequestBody Students students){
		return new ResponseEntity<Students>(ts.addStudent(students),
				HttpStatus.CREATED);
	}
	
	//use getmapping to fetch data from db table
	@GetMapping("/Students/getStudents/{sid}")
	public ResponseEntity<Students> getTeacher(@PathVariable("sid") int sid){
		return new ResponseEntity<Students>(ts.getStudentDetail(sid),HttpStatus.OK);
	}
	
	//use putmapping to edit existing data
	@PutMapping("/Students/editStudents/{sid}")
	public ResponseEntity<Students> editTeacher(@Valid @PathVariable("sid") int sid, @RequestBody Students students){
		return new ResponseEntity<Students>(ts.updateStudentDetail(students, sid), HttpStatus.OK);
	}
	
	
	//use deletemapping to remove existing data
	@DeleteMapping("/Students/removeStudents/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") int sid){
		ts.deleteStudentDetail(sid);
		return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
	}
	
	
}


