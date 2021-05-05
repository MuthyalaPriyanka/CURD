package com.example.demo.controller;
    import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employeeservice.DepartmentServiceImp;
import com.example.demo.entites.Department;

	
	@RestController
	public class DepartmentController extends RuntimeException {

	private static final long serialVersionUID = 1L;
	@Autowired
	private DepartmentServiceImp departmentService;

	@GetMapping("/department")

	public List<Department> getAllDepartment() {
	return this.departmentService.getAllDepartment();
	}

	@PostMapping("/dept")
	public Department addDepartment(@RequestBody Department dept) {
	return this.departmentService.addDepartment(dept);

	}

	}
	

