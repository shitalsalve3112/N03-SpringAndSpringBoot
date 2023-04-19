package org.tnsif.placementmanagement.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.entities.Placement;
import org.tnsif.placementmanagement.entities.Student;
import org.tnsif.placementmanagement.services.PlacementService;

@RestController
public class PlacementController 
{

	@Autowired
	private PlacementService service;
	
	//RESTful API for CRUD operation
	//add placement
	@PostMapping("/placements")
	public void save(@RequestBody Placement placement)
	{
		service.savePlacement(placement);
	}
	
	//update placement
	@PutMapping("/placements/{id}")
	public ResponseEntity<?>update(@RequestBody Placement placement, @PathVariable Integer id)
	{
		try {
			Placement existPlacement = service.getPlacement(id);
			service.savePlacement(placement);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}

	//cancel/delete placement
	@DeleteMapping("/placements/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.deletePlacement(id);
	}
	
	//search/find placement
	@GetMapping("/placements/{id}")
	public ResponseEntity<Placement> get(@PathVariable Integer id)
	{
		try {
			Placement placement = service.getPlacement(id);
			return new ResponseEntity<Placement>(placement, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
		
	
	
}
