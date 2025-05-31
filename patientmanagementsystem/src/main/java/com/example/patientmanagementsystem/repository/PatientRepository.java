package com.example.patientmanagementsystem.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.patientmanagementsystem.entity.PatientEntity;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, UUID> {

	boolean existsByEmail(String email);


 

}
