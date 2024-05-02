package com.example.demo.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Department;
import com.example.demo.entity.Students;
import com.example.demo.exception.DepartmentIdNotFoundException;
import com.example.demo.exception.StudentsIdNotFoundException;
import com.example.demo.respository.DepartmentRespository;
import com.example.demo.service.DepartmentService;


//business logic(CRUD Implementation) of entity teacher
@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRespository  trepo;

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return trepo.save(department);
	}

	@Override
	public Department getDepartmentDetail(int did) {
		// TODO Auto-generated method stub
		return trepo.findById(did).
		         orElseThrow(()-> new DepartmentIdNotFoundException("Department Id is not correct"));
	}

	@Override
	public Department updateDepartmentDetail(Department department, int did) {
		// TODO Auto-generated method stub
		Department updatedDepartment = trepo.findById(did).
		         orElseThrow(()-> new DepartmentIdNotFoundException("Department Id is not correct"));
	
		//set new values
		updatedDepartment.setOnOfEmp1(department.getOnOfEmp1());
		
		trepo.save(updatedDepartment); //saving updated details 
			return updatedDepartment; 
	}

	@Override
	public void deleteDepartmentDetail(int did) {
		// TODO Auto-generated method stub
		trepo.findById(did).
		orElseThrow(()-> new DepartmentIdNotFoundException("Department Id is not correct"));
	    trepo.deleteById(did);
	}

	
	

	

}