package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Teacher;


//Jpa repository for CRUD method
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
	
	//jpql
}
