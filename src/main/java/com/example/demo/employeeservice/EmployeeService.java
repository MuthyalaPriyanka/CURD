package com.example.demo.employeeservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entites.Employee;

public interface EmployeeService {
 
	//EmployeeDao employeeDao;
	public List<Employee> getEmpolyee();
	
	//public Employee getEmpolyee(long id);
	
	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);
	

	void deleteEmployee(long parseLong);
	
	
	
	
	
	//
	// emp1.findAll();
	// List<PadEmployee> emp=emp1.findAll();
	

	
	// //System.out.println(names);
	// emp.forEach(data -> {
	// ArrayList<Object> names = new ArrayList<Object>( Arrays.asList(data.getEmployeeName(), data.getAge(), data.getDob()) );
	// return names;
	// });
	// */
	
	
}
