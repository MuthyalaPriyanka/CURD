package com.example.demo.controller;

import javax.ws.rs.HeaderParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dao.EmployeeUserRepository;
import com.example.demo.entites.Department;
import com.example.demo.entites.EmployeeUser;

@RestController
public class EmployeeUserController {
	@Autowired
	private EmployeeUserRepository userRepository;

	@PostMapping("/userslogin")
	public EmployeeUser loginUser(@RequestBody EmployeeUser user) {
		return userRepository.save(user);

	}
	
	/*@PostMapping("/userslogin")
	public String loginUser(@RequestBody  EmployeeUser user) {
	return this.userRepository.addDepartment(dept);

	}
*/
	public String checkUserName(@HeaderParam("username") Long username) {
		boolean loginFlag = true;
		String status = "";

		loginFlag = userRepository.checkUserName(username);
		if (loginFlag == true) {
			System.out.println("Login Successfully");
			status = "Login Successfully";
		} else {
			status = "Invalid UserName";
		}

		return status;

	}

}
