package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "EmployeeInfo")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long eid;
	
	
	@Column(name = "First_Name",length=25, nullable = false)
	@NotBlank(message = "Employee Name cannot be blank")
	private String efirstName;
	
	
	@Column(name = "Last_Name",length=25, nullable = false)
	@NotBlank(message = "Employee Surname cannot be blank")
	private String elastName;
	

	@Column(name = "Email_Id",length=20, nullable = false, unique = true)
	@NotBlank(message = "Student Email ID cannot be blank")
	@Email(message="Email id is not proper")
	private String eemail;


	public long getId() {
		return eid;
	}


	public void setId(long eid) {
		this.eid = eid;
	}


	public String getEfirstName() {
		return efirstName;
	}


	public void setEfirstName(String efirstName) {
		this.efirstName = efirstName;
	}


	public String getElastName() {
		return elastName;
	}


	public void setElastName(String elastName) {
		this.elastName = elastName;
	}


	public String getEemail() {
		return eemail;
	}


	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	
	
}