package com.example.demo.entites;



	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotBlank;

	@Entity
	@Table(name = "LoginPP")
	public class EmployeeUser {
	private @Id @GeneratedValue long id;
	private @NotBlank int username;
	private @NotBlank String password;

	public EmployeeUser() {
	}
	public EmployeeUser(@NotBlank int username,
	@NotBlank String password) {
	this.username = username;
	this.password = password;

	}
	public long getId() {
	return id;
	}
	public int getUsername() {
	return username;
	}
	public void setUsername(int username) {
	this.username = username;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}

}
