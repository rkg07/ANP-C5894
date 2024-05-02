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
@Table(name="Batches_Info")
@Data
@Getter
@Setter

public class Batches 
{
	@Id
	private int bid;
	
	@Column(length=25, nullable = false)
    private String bname;
	
	@Column(length=20)
	private String subject;
	
	@Column(length=20)
	private String startdate;
	
	@Column(length=20)
	private String enddate;
	
	@Column(length=40, nullable = false)
	private int duration;
}

