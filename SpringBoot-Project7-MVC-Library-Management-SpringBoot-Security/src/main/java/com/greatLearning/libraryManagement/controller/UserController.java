package com.greatLearning.libraryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.greatLearning.libraryManagement.entity.User;
import com.greatLearning.libraryManagement.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public void saveUserDetails(@RequestBody User user) {
		userService.save(user);
	}

}
