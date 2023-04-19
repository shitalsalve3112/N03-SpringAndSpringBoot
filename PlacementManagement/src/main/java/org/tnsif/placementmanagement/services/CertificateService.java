package org.tnsif.placementmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.Certificate;
import org.tnsif.placementmanagement.repository.CertificateRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CertificateService {

	@Autowired
	private CertificateRepository repo;
	
	//addition/insertion/creation
	public void saveCertificate(Certificate certificate)
	{
		repo.save(certificate);
	}
	
	//delete
	public void deletecertificate(Integer id)
	{
		repo.deleteById(id);
	}
	
	//search
	public Certificate getCertificate(Integer id)
	{
		return repo.findById(id).get();
	}
	
	//update
	public Certificate updatecertificate(Certificate certificate)
	{
		return repo.save(certificate);
	}
		
		
}
