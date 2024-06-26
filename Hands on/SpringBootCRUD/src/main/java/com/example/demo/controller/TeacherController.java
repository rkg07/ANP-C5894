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
import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import jakarta.validation.Valid;

//handle all incoming request of Teacher Entity
@RestController
public class TeacherController {
	
	@Autowired
	TeacherService ts;
	
	//use postmapping to insert data 
	@PostMapping("/Teacher/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@Valid @RequestBody Teacher teacher){
		return new ResponseEntity<Teacher>(ts.addTeacher(teacher),
				HttpStatus.CREATED);
	}
	
	//use getmapping to fetch data from db table
	@GetMapping("/Teacher/getTeacher/{tid}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable("tid") int tid){
		return new ResponseEntity<Teacher>(ts.getTeacherDetail(tid),HttpStatus.OK);
	}
	
	//use putmapping to edit existing data
	@PutMapping("/Teacher/editTeacher/{tid}")
	public ResponseEntity<Teacher> editTeacher(@Valid @PathVariable("tid") int tid, @RequestBody Teacher teacher){
		return new ResponseEntity<Teacher>(ts.updateTeacherDetail(teacher, tid), HttpStatus.OK);
	}
	
	
	//use deletemapping to remove existing data
	@DeleteMapping("Teacher/removeTeacher/{tid}")
	public ResponseEntity<String> deleteTeacher(@PathVariable("tid") int tid){
		ts.deleteTeacherDetail(tid);
		return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
	}
	
	
}
