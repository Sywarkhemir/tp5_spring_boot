package com.sywar.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sywar.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);


}
