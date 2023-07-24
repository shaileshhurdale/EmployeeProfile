package com.example.EmployeeProfile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.EmployeeProfile.model.BasicInfo;
import com.example.EmployeeProfile.model.EmployeeProfile;
import com.example.EmployeeProfile.model.SkillSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class EmployeeProfileService {
	
	Logger logger = LoggerFactory.getLogger(EmployeeProfileService.class);
	
	
	@Autowired
	private BasicInfoService basicInfoService;
	
	@Autowired
	private SkillSetService skillSetService;
	
	public EmployeeProfile retrieveEmployeeProfile() {
		logger.info("calling basic info and skill set service");
		BasicInfo basicInfoResponse = basicInfoService.retrieveBasicInfo();
		SkillSet skillSet = skillSetService.retrieveSkillSet();
		return new EmployeeProfile(skillSet, basicInfoResponse);
		
	}

}
