package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Students;

//Jpa repository for CRUD method
public interface StudentsRespository extends JpaRepository<Students, Integer>{
	
	//jpql
}