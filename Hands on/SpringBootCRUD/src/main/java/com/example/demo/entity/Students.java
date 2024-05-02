package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name="StudentInfo")	
public class Students
{
	@Id
	private int sid;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Student Name cannot be blank")
	private String sname;
		
	@Column(length=25, nullable = false)
	@NotBlank(message = "Student Surname cannot be blank")
	private String ssurname;
		
	@Column(length=20, nullable = false, unique = true)
	@NotBlank(message = "Student Email ID cannot be blank")
	@Email(message="Email id is not proper")
	private String semail;
		
	@Column(length=25, nullable = false)
	@NotBlank(message = "Student education cannot be blank")
	private String seduc;
		
	@Column(length=25, nullable = false)
	@NotBlank(message = "Student Address cannot be blank")
	private String saddr;
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSsurname() {
		return ssurname;
	}

	public void setSsurname(String ssurname) {
		this.ssurname = ssurname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSeduc() {
		return seduc;
	}

	public void setSeduc(String seduc) {
		this.seduc = seduc;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
		
		
}











