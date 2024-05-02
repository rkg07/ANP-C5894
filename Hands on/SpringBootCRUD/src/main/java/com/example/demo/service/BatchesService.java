package com.example.demo.service;

import com.example.demo.entity.Batches;


//abstract method for performing CRUD on teacher entity
public interface BatchesService {
	
	//method for saving teacher details in db table
	Batches addBatches(Batches batches);
	
	//method to fetch teacher detail based on tid from db table
	Batches getBatchesDetail(int bid);
	
	//method to modify teacher detail based on tid from db table
	Batches updateBatchesDetail(Batches batches, int bid);
	
	//method to remove teacher detail based on tid from db table
	void deleteBatchesDetail(int bid);

	
	
	
	
}
