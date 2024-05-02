package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Department;

//Jpa repository for CRUD method
public interface DepartmentRespository extends JpaRepository<Department, Integer>{
	
	//jpql
}
