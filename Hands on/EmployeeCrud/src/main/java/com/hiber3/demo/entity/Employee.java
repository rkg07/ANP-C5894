package com.hiber3.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp007")
public class Employee {
	
	@Id // marks it as identifier for this entity
	// auto increment
	@Column(name = "EmpId")
	private int empid;
	// column mention colname, length, null, unique)
	@Column(name = "FirstName", length = 30, nullable = false)
	private String empName;

	@Column(name = "Surname", length = 30)
	private String empSurname;

	@Column(name = "PhoneNo", length = 11, nullable = false, unique = true)
	private long empPhone;

	@Column(name = "Address",length = 40)
	private String empaddr;

	@Column(name = "Designation",length = 20, nullable = false)
	private String designation;

	public Employee() {
		super();
	}

	public Employee(int empid, String empName, String empSurname, long empPhone, String empaddr, String designation) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSurname = empSurname;
		this.empPhone = empPhone;
		this.empaddr = empaddr;
		this.designation = designation;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSurname() {
		return empSurname;
	}

	public void setEmpSurname(String empSurname) {
		this.empSurname = empSurname;
	}

	public long getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpaddr() {
		return empaddr;
	}

	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
