package com.example.demo.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeIdNotFoundException;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;


//business logic(CRUD Implementation) of entity teacher
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository erepo;

	//use save() of Jpa repository for saving details
	@Override
	public Employee addEmployee(Employee employee) {
		
		return erepo.save(employee);
	}
	
  //use findById of Jpa repository for fetching record if not found
	//then throw custom exception
	@Override
	public Employee getEmployeeDetail(int eid) {
		return erepo.findById(eid).
       orElseThrow(()-> new EmployeeIdNotFoundException("Employee Id is not correct"));
	}
	
	//use findById of Jpa repository for fetching record if not found
	//then throw custom exception
	// if found update phone,designation & save new records
	@Override
	public Employee updateEmployeeDetail(Employee employee, int eid) {
		Employee updatedEmployee = erepo.findById(eid).
	         orElseThrow(()-> new EmployeeIdNotFoundException("Employee Id is not correct"));

	//set new values
	updatedEmployee.setEfirstName(employee.getEfirstName());
	updatedEmployee.setEfirstName(employee.getEfirstName());
	updatedEmployee.setEemail(employee.getEemail());
	
	erepo.save(updatedEmployee); //saving updated details 
		return updatedEmployee; 
		
	}


	//use findById of Jpa repository for fetching record if not found
	//then throw custom exception
	//if found use deleteById to remove record
	@Override
	public void deleteEmployeeDetail(int eid) {
		erepo.findById(eid).
		orElseThrow(()-> new EmployeeIdNotFoundException("Employee Id is not correct"));
	    erepo.deleteById(eid);
	}

}
