package com.cni.formulairescore.services;

import java.util.List;

import com.cni.formulairescore.entities.Role;
import com.cni.formulairescore.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
}