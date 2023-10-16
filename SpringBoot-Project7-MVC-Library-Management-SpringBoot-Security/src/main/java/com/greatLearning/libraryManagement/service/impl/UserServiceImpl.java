package com.greatLearning.libraryManagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.greatLearning.libraryManagement.entity.User;
import com.greatLearning.libraryManagement.repository.UserRepository;
import com.greatLearning.libraryManagement.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User save(User user) {		
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));		
		return userRepository.save(user);
	}

}
