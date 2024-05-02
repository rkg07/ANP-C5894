package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Batches;

//Jpa repository for CRUD method
public interface BatchesRespository extends JpaRepository<Batches, Integer>{
	
	//jpql
}

