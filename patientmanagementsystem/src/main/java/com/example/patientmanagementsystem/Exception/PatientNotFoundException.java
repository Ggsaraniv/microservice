package com.example.patientmanagementsystem.Exception;

import java.util.function.Supplier;

public class PatientNotFoundException extends RuntimeException {

	public PatientNotFoundException(String message) {
        super(message);
	}

}
