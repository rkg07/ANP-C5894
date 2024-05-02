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
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import jakarta.validation.Valid;

//handle all incoming request of Teacher Entity
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	//use postmapping to insert data 
	@PostMapping("/Employee/addEmployee")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee){
		return new ResponseEntity<Employee>(es.addEmployee(employee),
				HttpStatus.CREATED);
	}
	
	//use getmapping to fetch data from db table
	@GetMapping("/Employee/getEmployee/{eid}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("eid") int eid){
		return new ResponseEntity<Employee>(es.getEmployeeDetail(eid),HttpStatus.OK);
	}
	
	//use putmapping to edit existing data
	@PutMapping("/Employee/editEmployee/{eid}")
	public ResponseEntity<Employee> editEmployee(@Valid @PathVariable("eid") int eid, @RequestBody Employee employee){
		return new ResponseEntity<Employee>(es.updateEmployeeDetail(employee, eid), HttpStatus.OK);
	}
	
	
	//use deletemapping to remove existing data
	@DeleteMapping("Employee/removeEmployee/{eid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("eid") int eid){
		es.deleteEmployeeDetail(eid);
		return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
	}
	
	
}
