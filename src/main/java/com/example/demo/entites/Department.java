package com.example.demo.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "deptp")
public class Department {

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Id
	private long deptid;
	private String departmentName;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "deptid")
	private List<Employee> employee;

	public Department(long deptid, String departmentName, List<Employee> employee) {
		super();
		this.deptid = deptid;
		this.departmentName = departmentName;
		this.employee = employee;
	}

	public long getDeptid() {
		return deptid;
	}

	public void setDeptid(long deptid) {
		this.deptid = deptid;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", departmentName=" + departmentName + ", employee=" + employee + "]";
	}

	public Department() {

	}

}
