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

	public Department addDepartment(Department dept) {
	return departmentDao.save(dept);
	}

	}

