package com.example.patientmanagementsystem.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
 
@Entity
@Table(name="patient")
public class PatientEntity {

	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public LocalDate getRegisterdate() {
		return registerdate;
	}
	public void setRegisterdate(LocalDate registerdate) {
		this.registerdate = registerdate;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id ;

	@NotNull
	private String name;
	
	@NotNull
	@Email
	@Column(name="email",unique=true)
	private String email;
	@NotNull
	private String address;
	@NotNull
	private LocalDate dateofbirth;
	@NotNull
	private LocalDate registerdate;
	 
	
}
