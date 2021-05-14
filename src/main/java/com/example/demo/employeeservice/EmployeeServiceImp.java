package com.example.demo.employeeservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entites.Employee;

@Service
public class EmployeeServiceImp  implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	
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


	
	
	
	


	
	
	


	/*@Override
	public List<Employee> getEmployeeDetails(Employee emp) {
	
		employeeDao.getEmpDetails();
		return emp;
	}*/

	/*public List<Employee> getEmployeeDetails(Employee emp){
	List<Employee> list = new ArrayList<Employee>();
	List<Object[]> obj = employeeDao.getEmpDetails();
	for(Object[] res : obj) {
		Employee e = new Employee();
		e.setName(res[4].toString());
		e.setAge(res[1].toString());
		e.setDob(res[3].toString());
		list.add(e);
	}
	return list;

}
     
	*/
	
	
	
}
