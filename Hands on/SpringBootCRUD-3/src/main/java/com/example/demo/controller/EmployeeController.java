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




@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService es;
	
	
	@PostMapping("/Employee/addEmployee")
	public ResponseEntity<Employee> saveBatches(@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(es.addEmployee(employee),HttpStatus.OK);
		
	}
	@GetMapping("/Employee/getEmployee/{employeeId}")
	public ResponseEntity<Employee>getEmployee(@PathVariable("employeeId") int employeeId)
	{
		return new ResponseEntity<Employee>(es.getEmployee(employeeId),HttpStatus.OK);
		
	}
	@PutMapping("/Employee/editEmployee/{employeeId}")
	public ResponseEntity<Employee> editEmployee(@PathVariable("employeeId") int employeeId ,@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(es.updateEmployee(employee, employeeId),HttpStatus.OK); 
		
	}
	@DeleteMapping("/Employee/removeEmployee/{employeeId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("employeeId") int employeeId )
	{
		es.deleteEmployee(employeeId);
		return new ResponseEntity<String>("Deleted",HttpStatus.OK); 
		
	}
}
