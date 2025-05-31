package com.example.BILLINGS.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.BILLINGS.Mapper.BillingMapper;
import com.example.BILLINGS.ResponseDTO.ResponseDTO;
import com.example.BILLINGS.entity.Billing;
import com.example.BILLINGS.repository.BillingRepo;
import com.example.patientmanagementsystem.dto.PatientResponseDto;

@Service
public class BillingServices {
@Autowired
	private BillingRepo billingrepo;
@Autowired
private RestTemplate restTemplate;

 
private final String BASE_URL = "http://localhost:8081/patient"; 

public List<PatientResponseDto> getAllPatients() {
    ResponseEntity<PatientResponseDto[]> response = restTemplate.getForEntity(BASE_URL, PatientResponseDto[].class);
    return Arrays.asList(response.getBody());
}


public List<ResponseDTO> getbilling() {
	List<Billing> billing =billingrepo.findAll();
	List<ResponseDTO> billings=billing.stream().map(b->BillingMapper.todto(b)).toList();
	
	return billings ;
}

public Billing saveBilling(Billing billing) {
	 
        return billingrepo.save(billing);
    
}

	
}
