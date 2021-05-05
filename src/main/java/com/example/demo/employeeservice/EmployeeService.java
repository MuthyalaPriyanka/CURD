package com.example.demo.employeeservice;

import java.util.List;

import com.example.demo.entites.Employee;

public interface EmployeeService {
 
	public List<Employee> getEmpolyee();
	
	//public Employee getEmpolyee(long id);
	
	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);
	

	void deleteEmployee(long parseLong);
}
