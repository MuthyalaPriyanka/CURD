package com.example.demo.dao;



	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.employeeservice.DepartmentServiceImp;
import com.example.demo.entites.Employee;
import com.example.demo.entites.EmployeeUser;


	@Repository
	public interface EmployeeUserRepository extends JpaRepository<EmployeeUser, Long> {
		@Query(value="select * from loginp where username like :username",nativeQuery=true)
		boolean checkUserName(@Param("username")  Long username);

		
		
	}

