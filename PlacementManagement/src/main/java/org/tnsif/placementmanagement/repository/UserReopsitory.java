package org.tnsif.placementmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entities.User;

public interface UserReopsitory extends JpaRepository<User,Integer>{

}
