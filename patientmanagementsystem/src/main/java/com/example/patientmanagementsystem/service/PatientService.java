package com.example.patientmanagementsystem.service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.PageDto;
import org.springframework.stereotype.Service;

import com.example.patientmanagementsystem.Exception.EmailAlreadyException;
import com.example.patientmanagementsystem.Exception.PatientNotFoundException;
import com.example.patientmanagementsystem.dto.PatientRequestDto;
import com.example.patientmanagementsystem.dto.PatientResponseDto;
import com.example.patientmanagementsystem.entity.PatientEntity;
import com.example.patientmanagementsystem.mapper.PatientMapper;
import com.example.patientmanagementsystem.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientrepo;
	
	
	public List<PatientResponseDto > getAllPatients(){
		 List<PatientEntity>patients =patientrepo.findAll();
		 List<PatientResponseDto> patient=patients.stream().map(PatientMapper::todto).toList();
		 
		 
		 return patient;
	
	}
	
	public PatientResponseDto addpatient(PatientRequestDto request ) {
		
		if(patientrepo.existsByEmail(request.getEmail())) {
			throw new EmailAlreadyException("email is Already Present"); 
		}
	PatientEntity	patient =patientrepo.save(PatientMapper.toentity(request));
	return PatientMapper.todto(patient);
		
		
	}
	
	
 public PatientResponseDto createpatient(UUID uuid, PatientRequestDto request)
{
		PatientEntity patient =patientrepo.findById(uuid).orElseThrow(()->new PatientNotFoundException("Patient not found"));
		if(patientrepo.existsByEmail(request.getEmail()))
		
		{
			throw new EmailAlreadyException("email is Already Present"); 
		}
		
		patient.setName(request.getName());
		patient.setEmail(request.getEmail());
		patient.setAddress(request.getAddress());
patient.setRegisterdate(request.getRegisterdate());

    PatientEntity Patientupdate =patientrepo.save(patient);
return PatientMapper.todto(Patientupdate);
		
}

 
	}
