package com.example.demo.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "Emplyp")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String age;
	private String dob;
	private long phno;

	
	private Long deptid;


	public Employee(long id, String name, String age, String dob, long phno, Long deptid) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.phno = phno;
		this.deptid = deptid;
	}


	public Employee() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	}


	public Long getDeptid() {
		return deptid;
	}


	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", phno=" + phno
				+ ", deptid=" + deptid + "]";
	}
	
	
	
	
	
}
