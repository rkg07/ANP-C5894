package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Coursesinfo")
@Data
@Getter
@Setter
public class Courses 
{
	@Id
	private int cid;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Course Name cannot be blank")
	private String courseName;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Duration cannot be blank")
	private String duration;
	
	@Column(length=25, nullable = false)
	@NotNull(message = "Fees cannot be blank")
	private double courseFees;
	
	@ManyToOne
    @JoinColumn(name = "cid")
    private Teacher teacher;
	
	
}
