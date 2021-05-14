package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
	/*@Query(value="select  name ,age,dob from Emplyp limit 3",nativeQuery=true)
	
     List<Object[]> getEmpDetails();
*/
	
}
