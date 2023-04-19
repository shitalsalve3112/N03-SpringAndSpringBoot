package org.tnsif.placementmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.User;
import org.tnsif.placementmanagement.repository.UserReopsitory;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserReopsitory repo;
	
	//addition/insertion/creation
	public void saveUser(User user)
	{
		repo.save(user);
	}
		
	//delete
	public void deleteUser(Integer id)
	{
		repo.deleteById(id);
	}
		
	//search
	public User getUser(Integer id)
	{
		return repo.findById(id).get();
	}
	
	//update
	public User updateUser(User user)
	{
		return repo.save(user);
	}
		
}
