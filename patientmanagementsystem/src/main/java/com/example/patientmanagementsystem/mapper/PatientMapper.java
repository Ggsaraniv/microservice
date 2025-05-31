package com.example.patientmanagementsystem.mapper;

 
import com.example.patientmanagementsystem.dto.PatientRequestDto;
import com.example.patientmanagementsystem.dto.PatientResponseDto;
import com.example.patientmanagementsystem.entity.PatientEntity;
 

public class PatientMapper {

    public static PatientResponseDto todto(PatientEntity patient) {
        PatientResponseDto dto = new PatientResponseDto();
        dto.setName(patient.getName());
        dto.setId(String.valueOf(patient.getId())); 
        dto.setAddress(patient.getAddress());
        dto.setEmail(patient.getEmail());
        dto.setRegisterdate(
            patient.getRegisterdate() != null ? patient.getRegisterdate().toString() : null
        );
        return dto;
    }

    public static PatientEntity toentity(PatientRequestDto patientRequestDTO) {
        PatientEntity patient = new PatientEntity();
        patient.setName(patientRequestDTO.getName());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setDateofbirth(patientRequestDTO.getDateofbirth());
        patient.setRegisterdate(patientRequestDTO.getRegisterdate());
        return patient;
    }
}

