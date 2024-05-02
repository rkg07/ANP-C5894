package com.example.demo.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Batches;
import com.example.demo.exception.BatchesIdNotFoundException;
import com.example.demo.respository.BatchesRespository;
import com.example.demo.service.BatchesService;


//business logic(CRUD Implementation) of entity teacher
@Service
public class BatchesServiceImpl implements BatchesService{
	
	@Autowired
	BatchesRespository  trepo;

	@Override
	public Batches addBatches(Batches batches) {
		// TODO Auto-generated method stub
		return trepo.save(batches);
	}

	@Override
	public Batches getBatchesDetail(int bid) {
		// TODO Auto-generated method stub
		return trepo.findById(bid).
		         orElseThrow(()-> new BatchesIdNotFoundException("Batches Id is not correct"));
	}

	@Override
	public Batches updateBatchesDetail(Batches batches, int bid) {
		// TODO Auto-generated method stub
		Batches updatedBatches = trepo.findById(bid).
		         orElseThrow(()-> new BatchesIdNotFoundException("Batches Id is not correct"));
	
		//set new values
		updatedBatches.setStartdate(batches.getStartdate());
		updatedBatches.setEnddate(batches.getEnddate());
		
		trepo.save(updatedBatches); //saving updated details 
			return updatedBatches; 
	}

	@Override
	public void deleteBatchesDetail(int bid) {
		// TODO Auto-generated method stub
		trepo.findById(bid).
		orElseThrow(()-> new BatchesIdNotFoundException("Batches Id is not correct"));
	    trepo.deleteById(bid);
	}


	

}
