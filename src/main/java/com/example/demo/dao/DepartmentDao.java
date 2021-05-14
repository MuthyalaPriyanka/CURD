package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Department;
@Repository
public interface DepartmentDao  extends JpaRepository<Department, Long>{
	@Query(value="select count(deptid) as d from deptp",nativeQuery=true)  
	Long getDepartmentCount();
}
