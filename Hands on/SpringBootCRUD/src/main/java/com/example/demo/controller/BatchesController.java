package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Batches;
import com.example.demo.service.BatchesService;

import jakarta.validation.Valid;

//handle all incoming request of Teacher Entity
@RestController
public class BatchesController {
	
	@Autowired
	BatchesService ts;
	
	//use postmapping to insert data 
	@PostMapping("/Batches/addBatches")
	public ResponseEntity<Batches> saveBatches(@Valid @RequestBody Batches batches){
		return new ResponseEntity<Batches>(ts.addBatches(batches),
				HttpStatus.CREATED);
	}
	
	//use getmapping to fetch data from db table
	@GetMapping("/Batches/getBatches/{bid}")
	public ResponseEntity<Batches> getBatches(@PathVariable("bid") int bid){
		return new ResponseEntity<Batches>(ts.getBatchesDetail(bid),HttpStatus.OK);
	}
	
	//use putmapping to edit existing data
	@PutMapping("/Batches/editBatches/{bid}")
	public ResponseEntity<Batches> editBatches(@Valid @PathVariable("bid") int bid, @RequestBody Batches batches){
		return new ResponseEntity<Batches>(ts.updateBatchesDetail(batches, bid), HttpStatus.OK);
	}
	
	
	//use deletemapping to remove existing data
	@DeleteMapping("/Batches/removeBatches/{bid}")
	public ResponseEntity<String> deleteBatches(@PathVariable("bid") int bid){
		ts.deleteBatchesDetail(bid);
		return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
	}
	
	
}
