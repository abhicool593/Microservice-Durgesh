package com.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Entity.User;
import com.user.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepo;
	
	public User getID(Long id) {
		return this.userrepo.getById(id);
	}
		
}
