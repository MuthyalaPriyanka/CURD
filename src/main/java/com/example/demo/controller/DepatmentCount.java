package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.DepartmentDao;

public class DepatmentCount {
	
 @Autowired
 private  DepartmentDao departmentDao;
 public  Long getAll() {
		 Long count  = departmentDao.getDepartmentCount();
		 System.out.println(count);
		return count;
		
	 
 }
 public static void main(String[] args) {
	 DepatmentCount d = new  DepatmentCount();
	 d.getAll();
 }
}
