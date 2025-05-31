package com.example.patientmanagementsystem.controller;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.patientmanagementsystem.dto.PatientRequestDto;
import com.example.patientmanagementsystem.dto.PatientResponseDto;
import com.example.patientmanagementsystem.service.PatientService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
@Tag(name = "PatientEntity",description = "this my patient swagger testing")
@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService pservice;


private final static Logger log=LoggerFactory.getLogger(PatientController.class);
	
@GetMapping
@Operation(summary="Get a patient")
public ResponseEntity<List<PatientResponseDto>> getAllPatients()
{
	List<PatientResponseDto> patients =pservice.getAllPatients();
	log.info("it is dislay the records");
	return ResponseEntity.ok().body(patients);
}	

@PostMapping@Operation(summary="post a patient")
public ResponseEntity<PatientResponseDto> createpatient(@Valid @RequestBody PatientRequestDto dto ){
	PatientResponseDto patientresponsedto= pservice.addpatient(dto);
	return ResponseEntity.ok().body(patientresponsedto);

}
	@PutMapping("{id}")@Operation(summary="put a patient")
public ResponseEntity<PatientResponseDto> Updateepatient(@PathVariable("id") UUID uuid,@RequestBody PatientRequestDto request)
{
	PatientResponseDto responseUPDATE =pservice.createpatient(uuid, request);
		
	return ResponseEntity.ok().body( responseUPDATE);
	
}


}