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
import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import jakarta.validation.Valid;

//handle all incoming request of Teacher Entity
@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService ts;
	
	//use postmapping to insert data 
	@PostMapping("/Department/addDepartment")
	public ResponseEntity<Department> saveDepartment(@Valid @RequestBody Department department){
		return new ResponseEntity<Department>(ts.addDepartment(department),
				HttpStatus.CREATED);
	}
	
	//use getmapping to fetch data from db table
	@GetMapping("/Department/getDepartment/{did}")
	public ResponseEntity<Department> getDepartment(@PathVariable("did") int did){
		return new ResponseEntity<Department>(ts.getDepartmentDetail(did),HttpStatus.OK);
	}
	
	//use putmapping to edit existing data
	@PutMapping("/Department/editDepartment/{did}")
	public ResponseEntity<Department> editDepartment(@Valid @PathVariable("did") int did, @RequestBody Department department){
		return new ResponseEntity<Department>(ts.updateDepartmentDetail(department, did), HttpStatus.OK);
	}
	
	
	//use deletemapping to remove existing data
	@DeleteMapping("/Department/removeDepartment/{did}")
	public ResponseEntity<String> deleteDepartment(@PathVariable("did") int did){
		ts.deleteDepartmentDetail(did);
		return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
	}
	
	
}
