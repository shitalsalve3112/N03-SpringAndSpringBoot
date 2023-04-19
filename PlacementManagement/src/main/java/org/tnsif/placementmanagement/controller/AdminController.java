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
import org.tnsif.placementmanagement.entities.Admin;
import org.tnsif.placementmanagement.services.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService service;
	
	//RESTful API for CRUD operation
	//add Admin
	@PostMapping("/admin")
	public void save(@RequestBody Admin admin)
	{
		service.add(admin);
	}
	
	//update placement
		@PutMapping("/admin/{id}")
		public ResponseEntity<?>update(@RequestBody Integer admin, @PathVariable Integer id)
		{
			try {
				Admin existAdmin = service.retrieve(id);
				service.add(existAdmin);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(NoSuchElementException e){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}	
		}
		
		//cancel/delete Admin
		@DeleteMapping("/admin/{id}")
		public void delete(@PathVariable Integer id)
		{
			service.delete(id);
		}
		
		//search/find admin
		@GetMapping("/admin/{id}")
		public ResponseEntity<Admin> get(@PathVariable Integer id)
		{
			try {
				Admin admin = service.retrieve(id);
				return new ResponseEntity<Admin>(admin, HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
			}
		}
}

