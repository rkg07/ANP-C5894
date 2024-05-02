package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Courses;
import com.example.demo.service.CoursesService;
import jakarta.validation.Valid;

//handle all incoming request of Teacher Entity
@RestController
public class CoursesController 
{
	@Autowired
    CoursesService ts;
	
	//use postmapping to insert data 
	@PostMapping("/Courses/addCourses")
	public ResponseEntity<Courses> saveCourses(@Valid @RequestBody Courses courses){
		return new ResponseEntity<Courses>(ts.addCourses(courses),
				HttpStatus.CREATED);
	}
	
	//use getmapping to fetch data from db table
	@GetMapping("/Courses/getCourses/{cid}")
	public ResponseEntity<Courses> getCourses(@PathVariable("cid") int cid){
		return new ResponseEntity<Courses>(ts.getCoursesDetail(cid),HttpStatus.OK);
	}
	
	//use putmapping to edit existing data
	@PutMapping("/Courses/editCourses/{cid}")
	public ResponseEntity<Courses> editCourses(@Valid @PathVariable("did") int cid, @RequestBody Courses courses){
		return new ResponseEntity<Courses>(ts.updateCoursesDetail(courses, cid), HttpStatus.OK);
	}
	
	
	//use deletemapping to remove existing data
	@DeleteMapping("/Courses/removeCourses/{cid}")
	public ResponseEntity<String> deleteCourses(@PathVariable("cid") int cid){
		ts.deleteCoursesDetail(cid);
		return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
	}
}
