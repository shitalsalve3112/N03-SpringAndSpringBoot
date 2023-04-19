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
import org.tnsif.placementmanagement.entities.Certificate;
import org.tnsif.placementmanagement.services.CertificateService;

@RestController
public class CertificateController {

	@Autowired
	private CertificateService service;
	
	//RESTful API for CRUD operation
	//add certificate
	@PostMapping("/certificate")
	public void save(@RequestBody Certificate certificate)
	{
		service.saveCertificate(certificate);
	}
	
	//update certificate
	@PutMapping("/certificate/{id}")
	public ResponseEntity<?>update(@RequestBody Certificate certificate, @PathVariable Integer id)
		{
			try {
				Certificate existcertificate = service.getCertificate(id);
				service.saveCertificate(certificate);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(NoSuchElementException e){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}
	
	//cancel/delete certificate
	@DeleteMapping("/certificate/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.deletecertificate(id);
	}
	
	//search/find certificate
	@GetMapping("/certificate/{id}")
	public ResponseEntity<Certificate> get(@PathVariable Integer id)
	{
		try {
			Certificate certificate = service.getCertificate(id);
			return new ResponseEntity<Certificate>(certificate, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}
		
}
