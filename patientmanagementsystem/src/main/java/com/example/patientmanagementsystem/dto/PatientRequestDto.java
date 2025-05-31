package com.example.patientmanagementsystem.dto;

import java.time.LocalDate;

 

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class PatientRequestDto {

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	@NotBlank(message="need a name")
	@Size(max=100, message="need a 100 words")
	private String id;
	@NotBlank(message="need a name")
	private String name;
	@NotBlank(message="need a name")
	@Email(message="nee a valid Email Address")
	private String email;
	@NotBlank(message="need a name")
	private String address;
	@NotNull(message="need a name")
	private LocalDate dateofbirth;
	@NotNull(message="need a name")
	private LocalDate registerdate;
	
	
}
