package com.example.demo.employeeservice;
    import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
    import com.example.demo.dao.DepartmentDao;
    import com.example.demo.entites.Department;


	@Service
	public class DepartmentServiceImp {

	@Autowired
	private DepartmentDao departmentDao;

	public List<Department> getAllDepartment() {
	return departmentDao.findAll();
	}

	public String addDepartment(Department dept) {
	    Department dp = new Department();
	    String message = "";
		long depts= departmentDao.getDepartmentCount();
		if(depts<=10) {
			dp =departmentDao.save(dept);
		}
		else {
			message = "More then 10 records not allowed";
		}
		
	return message;
	}

	/*public Department adDepartment(Department dept) {
		long depts= departmentDao.getDepartmentCount();
		System.out.println(depts);
		return null;
	*/
	//}
	}

