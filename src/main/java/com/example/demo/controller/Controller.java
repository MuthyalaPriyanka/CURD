package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dao.EmployeeUserRepository;
import com.example.demo.employeeservice.DepartmentServiceImp;
import com.example.demo.employeeservice.EmployeeService;
import com.example.demo.employeeservice.EmployeeServiceImp;
import com.example.demo.entites.Employee;
import com.example.demo.entites.EmployeeUser;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private EmployeeServiceImp empSerImp;
	@Autowired
	private EmployeeUserRepository employeeuserrepository;
	
	
	@GetMapping("/getemployee")
	public List<Employee> getEmpolyee(){
		 
		return this.employeeService.getEmpolyee();
		
	}
	@ResponseBody
	@RequestMapping("/getDetails")
	public  List<Object> getDetails(){
	List<Employee> emp=employeeDao.findAll();
	List<Object> employeeDao = new ArrayList<>();
	emp.forEach(data -> {
		employeeDao.add(data.getName());
		employeeDao.add(data.getAge());
		employeeDao.add(data.getDob());});
		return employeeDao;
		}
	
	

	/*@GetMapping
	public List<Object[]> getUserEmployee(){
		return this.empSerImp.getEmployeeDetails();
	}*/
	/*@GetMapping("/getUserDetails")
	public List<Employee> getUserEmployee() {
		return this.empDao.getEmpDetails();
	}*/
//	@GetMapping("/employee/{employeeId}")
//	public Employee  getEmployee(@PathVariable String id) {
//		return this.employeeService.getEmpolyee(id);
//	}
	
	
	
	@PostMapping(path="/insertemployee",consumes="application/json")
	public  Employee addEmployee(@RequestBody Employee employee) {
		return  this.employeeService.addEmployee(employee);
				
		
	}
	@PutMapping("/addintoemployee")
	public  Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
		
	}
	@DeleteMapping("/deleteemployee/{id}")
	public  void deleteEmployee(@PathVariable int id){
		  this.employeeService.deleteEmployee(id);
	}
	
	@PostMapping("/userlogin")
	public  EmployeeUser loginUser(@RequestBody EmployeeUser user) {
	//List<EmployeeUser> users = userRepository.findAll();
	return employeeuserrepository.save(user);

}
	

		
	
}
