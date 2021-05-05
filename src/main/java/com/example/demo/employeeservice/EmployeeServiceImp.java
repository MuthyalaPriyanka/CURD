package com.example.demo.employeeservice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entites.Employee;

@Service
public class EmployeeServiceImp  implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	//List<Employee> list;
	public  EmployeeServiceImp() {
		
		
           /* list = new ArrayList<>();
            list.add(new Employee(1,"priya","23","20-03-97",928171));*/
	}
	
	
	@Override
	public List<Employee> getEmpolyee() {
		return employeeDao.findAll();
	}


	@Override
	public Employee addEmployee(Employee employee) {
       //  list.add(employee);
		employeeDao.save(employee);
		return employee;
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		  /*list.forEach(e -> {
			if(e.getId() == employee.getId()) {
			   e.setName(employee.getName());
			   e.setAge(employee.getAge());
			   e.setDob(employee.getDob());
			   e.setPhno(employee.getPhno());
			}
		}); */
		
		employeeDao.save(employee);
		return employee;
	}


	@Override
	public void  deleteEmployee(long parseLong) {
		//list=this.list.stream().filter(e ->e.getId()!=id).collect(Collectors.toList());

	Employee entity = employeeDao.getOne(parseLong);
	employeeDao.delete(entity);
	}


	

}
