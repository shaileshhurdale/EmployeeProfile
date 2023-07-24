package com.example.EmployeeProfile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeProfile.model.EmployeeProfile;
import com.example.EmployeeProfile.service.EmployeeProfileService;

@RestController
@RefreshScope
public class EmployeeProfileController {
	
	@Autowired
	private EmployeeProfileService employeeProfileService;
	
	@Value("${greeting.message}")
	private String message;

	@GetMapping("/empProfile/{empId}")
	public ResponseEntity<EmployeeProfile> getEmployeeProfile(){
		return new ResponseEntity<EmployeeProfile>(employeeProfileService.retrieveEmployeeProfile(), HttpStatus.OK);
	}
	
	@GetMapping("/empProfile/config/home")
	public String greetingMessage() {
		return message;
	}
}
