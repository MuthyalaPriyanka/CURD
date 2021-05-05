package com.example.demo.controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

import com.example.demo.dao.EmployeeUserRepository;
import com.example.demo.entites.EmployeeUser;



	import javax.validation.Valid;
	@RestController
	public class EmployeeUserController {
	@Autowired
	EmployeeUserRepository userRepository;

	
	@PostMapping("/user/login")
	public @Valid EmployeeUser loginUser(@Valid @RequestBody EmployeeUser user) {
	//List<EmployeeUser> users = userRepository.findAll();
	return userRepository.save(user);

	}
	}

