package com.sywar.users.service;

import com.sywar.users.entities.Role;
import com.sywar.users.entities.User;


public interface UserService {
	
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);

}
