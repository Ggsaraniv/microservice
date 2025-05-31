package com.example.BILLINGS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.BILLINGS.ResponseDTO.ResponseDTO;
import com.example.BILLINGS.entity.Billing;
import com.example.BILLINGS.services.BillingServices;
import com.example.patientmanagementsystem.dto.PatientResponseDto;
import com.example.patientmanagementsystem.service.PatientService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class controller {
	@Autowired
 private BillingServices billingservice;
    @Autowired
    private PatientService patientClientService;
	@Autowired
    private RestTemplate restTemplate;
	
	  @GetMapping("/microb")
	    public ResponseEntity<List<PatientResponseDto>> getPatientsFromB() {
		  List<PatientResponseDto> patients = patientClientService.getAllPatients();

	        return ResponseEntity.ok(patients);
	    }

 
	@GetMapping
	public ResponseEntity<List<ResponseDTO>>getbilling() {
		 List<ResponseDTO> billing = billingservice.getbilling();
		
		return ResponseEntity.ok(billing);
		
		}
	@PostMapping
    public ResponseEntity<Billing> saveBilling(@RequestBody Billing billing) {
        Billing saved = billingservice.saveBilling(billing);
        return ResponseEntity.ok(saved);
    }
}
