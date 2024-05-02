package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Courses; 

//Jpa repository for CRUD method
public interface CoursesRespository extends JpaRepository<Courses, Integer>
{
	
	//jpql
}

