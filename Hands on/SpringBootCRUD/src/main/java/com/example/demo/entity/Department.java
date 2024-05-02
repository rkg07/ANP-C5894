package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TableInfo")
@Data
@Getter
@Setter
public class Department 
{
	@Id
	private int did;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Department Name cannot be blank")
	private String deptname;
	
	@Column(length=20)
	private String deptHOD;
	
	@Column(length=40, nullable = false)
	@NotNull(message = "Kindly mention no of employees")
	private int onOfEmp1;
	
}
