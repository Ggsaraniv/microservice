package com.example.patientmanagementsystem.Exception;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PatientException {
	
	private final static Logger log =LoggerFactory.getLogger(PatientException.class);
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> haserror (MethodArgumentNotValidException ex)
	{
		Map<String,String> map=new HashMap();
		ex.getBindingResult().getFieldErrors().forEach(error->map.put(error.getField(), error.getDefaultMessage()));
		return ResponseEntity.badRequest().body(map);
		
	}

@ExceptionHandler(EmailAlreadyException.class)
public ResponseEntity<Map<String,String>> hasemailalreadyexception(EmailAlreadyException ex)
{
	Map<String,String> errors =new HashMap();
	log.warn("email is alreay exists "+ex.getMessage());
	errors.put("Message", "Alreay is persent");
	return ResponseEntity.ok().body(errors);
	}


@ExceptionHandler(PatientNotFoundException.class)
public ResponseEntity<Map<String,String>> haspatientNotFoundException(PatientNotFoundException ex)
{  
	Map<String,String> map=new HashMap();
	map.put("Message", "patient not found");
	return ResponseEntity.ok( ).body(map);
	
}

}
