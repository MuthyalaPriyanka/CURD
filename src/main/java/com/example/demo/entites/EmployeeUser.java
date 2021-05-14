package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loginp")
public class EmployeeUser {
	@Id

	private long username;
	private String password;

	public EmployeeUser(long username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public long getUsername() {
		return username;
	}

	public void setUsername(long username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmployeeUser [username=" + username + ", password=" + password + "]";
	}

	public EmployeeUser() {

	}

}
