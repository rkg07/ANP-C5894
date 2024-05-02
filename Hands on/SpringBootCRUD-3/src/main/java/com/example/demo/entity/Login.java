package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login
{
	
	@Id
	private int uid;
	
	@Column(length=8, nullable = false)
	private String userName;
	
	@Column(length=10, nullable = false)
	private String password;
	
	
}