package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.employeeservice.EmployeeService;
import com.example.demo.entites.Employee;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee")
	public List<Employee> getEmpolyee(){
		
		return this.employeeService.getEmpolyee();
		
	}
	
//	@GetMapping("/employee/{employeeId}")
//	public Employee  getEmployee(@PathVariable String id) {
//		return this.employeeService.getEmpolyee(id);
//	}
	
	
	
	@PostMapping(path="/employee",consumes="application/json")
	public  Employee addEmployee(@RequestBody Employee employee) {
		return  this.employeeService.addEmployee(employee);
				
		
	}
	@PutMapping("/employee")
	public  Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
		
	}
	@DeleteMapping("/employee/{id}")
	public  void deleteEmployee(@PathVariable int id){
		  this.employeeService.deleteEmployee(id);
	}
	
	
}
