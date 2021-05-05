package com.example.demo.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="Employeep")
public class Employee {

	@Id
	private long id;
	private String name;
	private String age;
	private String dob;
	private long phno;
	
	/*@ManyToOne
	private Department department;*/
	//private Set<Employee> employees = new  HashSet<>();
	
	public Employee(long i, String name, String age, String dob, long phno) {
		super();
		this.id = i;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.phno = phno;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", phno=" + phno + "]";
	}
	
}
